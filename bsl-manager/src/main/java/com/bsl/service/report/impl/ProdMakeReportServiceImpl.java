package com.bsl.service.report.impl;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bsl.common.pojo.BSLException;
import com.bsl.common.utils.BSLResult;
import com.bsl.mapper.BslReportProdMakeInfoMapper;
import com.bsl.pojo.BslReportProdMakeInfo;
import com.bsl.pojo.BslReportProdMakeInfoExample;
import com.bsl.reportbean.BslProdMakeReportHJInfo;
import com.bsl.select.DictItemOperation;
import com.bsl.select.ErrorCodeInfo;
import com.bsl.select.QueryCriteria;
import com.bsl.service.report.ProdMakeReportService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * 成型机组生产报表查询综合类
 * duk-20230831
 */
@Service
public class ProdMakeReportServiceImpl implements ProdMakeReportService {

	@Autowired	 
	BslReportProdMakeInfoMapper bslReportProdMakeInfoMapper;
	
	
	//根据条件查询成型机组生产报表日报
	@Override
	public BSLResult getM7108Report(QueryCriteria queryCriteria) {
		BslReportProdMakeInfoExample bslReportProdMakeInfoExample = new BslReportProdMakeInfoExample();
		com.bsl.pojo.BslReportProdMakeInfoExample.Criteria criteria = bslReportProdMakeInfoExample.createCriteria();
		if(!StringUtils.isBlank(queryCriteria.getProdMaterial())){
			criteria.andProdMaterialEqualTo(queryCriteria.getProdMaterial());
		}
		if(!StringUtils.isBlank(queryCriteria.getProdNorm())){
			criteria.andProdNormLike("%"+queryCriteria.getProdNorm()+"%");
		}
		if(!StringUtils.isBlank(queryCriteria.getProdBc())){
			criteria.andProdBcEqualTo(queryCriteria.getProdBc());
		}
		if(!StringUtils.isBlank(queryCriteria.getProdMakeJz())){
			criteria.andProdMakeJzEqualTo(queryCriteria.getProdMakeJz());
		}
		if(!StringUtils.isBlank(queryCriteria.getProdLength())){
			criteria.andProdLengthEqualTo(Float.valueOf(queryCriteria.getProdLength()));
		}
		
		//开始日期结束日期
		Date dateStart = new Date();
		Date dateEnd = new Date();
		if(!StringUtils.isBlank(queryCriteria.getStartDate())){
			try {
				dateStart = DictItemOperation.日期转换实例.parse(queryCriteria.getStartDate());
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}else{
			try {
				dateStart = DictItemOperation.日期转换实例.parse("2018-01-01");
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		if(!StringUtils.isBlank(queryCriteria.getEndDate())){
			try {
				dateEnd = DictItemOperation.日期转换实例.parse(queryCriteria.getEndDate());
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}else{
			dateEnd = new Date();
		}
		criteria.andCrtDateBetween(dateStart,dateEnd);
		//分页处理
		PageHelper.startPage(Integer.parseInt(queryCriteria.getPage()), Integer.parseInt(queryCriteria.getRows()));
		bslReportProdMakeInfoExample.setOrderByClause("`crt_date` desc");
		
		List<BslReportProdMakeInfo> bslReportProdMakeInfos = bslReportProdMakeInfoMapper.selectByExample(bslReportProdMakeInfoExample);
		PageInfo<BslReportProdMakeInfo> pageInfo = new PageInfo<BslReportProdMakeInfo>(bslReportProdMakeInfos);
		return BSLResult.ok(bslReportProdMakeInfos,"prodMakeReportServiceImpl","getM7108Report",pageInfo.getTotal(),bslReportProdMakeInfos);
	}
	
	//根据条件查询成型机组生产报表统计
	@Override
	public BSLResult getM7108sReport(QueryCriteria queryCriteria) {
		if(StringUtils.isBlank(queryCriteria.getProdMaterial())){
			queryCriteria.setProdMaterial(null);
		}
		if(StringUtils.isBlank(queryCriteria.getProdNorm())){
			queryCriteria.setProdNorm(null);
		}else{
			queryCriteria.setProdNorm("%"+queryCriteria.getProdNorm()+"%");
		}
		if(StringUtils.isBlank(queryCriteria.getProdBc())){
			queryCriteria.setProdBc(null);
		}
		if(StringUtils.isBlank(queryCriteria.getProdMakeJz())){
			queryCriteria.setProdMakeJz(null);
		}
		if(StringUtils.isBlank(queryCriteria.getProdLength())){
			queryCriteria.setProdLength(null);
		}
		if(StringUtils.isBlank(queryCriteria.getStartDate())){
			throw new BSLException(ErrorCodeInfo.错误类型_查询无记录,"开始日期不能为空");
		}
		if(StringUtils.isBlank(queryCriteria.getEndDate())){
			throw new BSLException(ErrorCodeInfo.错误类型_查询无记录,"结束日期不能为空");
		}
		String startDateS = queryCriteria.getStartDate().replace("-", "");
		String endDateS = queryCriteria.getEndDate().replace("-", "");
		queryCriteria.setStartDate(startDateS);
		queryCriteria.setEndDate(endDateS);
		String dateNow = DictItemOperation.日期转换实例yyyyMMdd.format(new Date());
		if(Integer.parseInt(endDateS) >= Integer.parseInt(dateNow)){
			throw new BSLException(ErrorCodeInfo.错误类型_查询无记录,"结束日期不能大于前一日");
		}
		//分页处理
		PageHelper.startPage(Integer.parseInt(queryCriteria.getPage()), Integer.parseInt(queryCriteria.getRows()));
		
		
		List<BslReportProdMakeInfo> bslReportProdMakeInfos = bslReportProdMakeInfoMapper.selectProdMakeReportInfoTJ(queryCriteria);
		PageInfo<BslReportProdMakeInfo> pageInfo = new PageInfo<BslReportProdMakeInfo>(bslReportProdMakeInfos);
		return BSLResult.ok(bslReportProdMakeInfos,"prodMakeReportServiceImpl","getM7108sReport",pageInfo.getTotal(),bslReportProdMakeInfos);
	}
	
	//根据条件查询成型机组生产报表合计
	@Override
	public BSLResult getM7108sHJReport(QueryCriteria queryCriteria) {
		if(StringUtils.isBlank(queryCriteria.getProdMaterial())){
			queryCriteria.setProdMaterial(null);
		}
		if(StringUtils.isBlank(queryCriteria.getProdNorm())){
			queryCriteria.setProdNorm(null);
		}else{
			queryCriteria.setProdNorm("%"+queryCriteria.getProdNorm()+"%");
		}
		if(StringUtils.isBlank(queryCriteria.getProdBc())){
			queryCriteria.setProdBc(null);
		}
		if(StringUtils.isBlank(queryCriteria.getProdMakeJz())){
			queryCriteria.setProdMakeJz(null);
		}
		if(StringUtils.isBlank(queryCriteria.getProdLength())){
			queryCriteria.setProdLength(null);
		}
		
		String startDateS = queryCriteria.getStartDate().replace("-", "");
		String endDateS = queryCriteria.getEndDate().replace("-", "");
		queryCriteria.setStartDate(startDateS);
		queryCriteria.setEndDate(endDateS);
		
		List<BslProdMakeReportHJInfo> bslProdMakeReportHJInfos = bslReportProdMakeInfoMapper.selectProdMakeReportInfoHJ(queryCriteria);
		int prodNormHJ = bslReportProdMakeInfoMapper.countNormProdMakeReportInfoHJ(queryCriteria);
		
		List<BslProdMakeReportHJInfo> resInfos = new ArrayList<>();
		BslProdMakeReportHJInfo bslProdMakeReportHJInfo = new BslProdMakeReportHJInfo();
		if(bslProdMakeReportHJInfos!=null && bslProdMakeReportHJInfos.size()>0 && bslProdMakeReportHJInfos.get(0) != null){
			bslProdMakeReportHJInfo = bslProdMakeReportHJInfos.get(0);
		}
		bslProdMakeReportHJInfo.setProdHJ("合计");
		bslProdMakeReportHJInfo.setProdNormHJ(prodNormHJ);
		resInfos.add(bslProdMakeReportHJInfo);
		return BSLResult.ok(resInfos);
	}

}