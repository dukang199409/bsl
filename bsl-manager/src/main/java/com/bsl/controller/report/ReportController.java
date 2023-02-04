package com.bsl.controller.report;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.bsl.common.pojo.EasyUIDataGridResult;
import com.bsl.common.utils.BSLResult;
import com.bsl.select.DictItemOperation;
import com.bsl.select.ErrorCodeInfo;
import com.bsl.select.QueryCriteria;
import com.bsl.service.report.ProdReportService;
import com.bsl.service.report.RawReportService;
import com.bsl.service.report.ReportService;

/**
 * @author 杜康
 * 报表查询Controller
 */
@Controller
@RequestMapping("/report")
public class ReportController {
	
	@Autowired
	private ReportService reportService;
	
	@Autowired
	private RawReportService rawReportService;
	
	@Autowired
	private ProdReportService prodReportService;
	
	/**
	 * 成型机组生产报表
	 * @param 
	 * @param 
	 * @return
	 */
	@RequestMapping("/listByCriteriaM7101")
	@ResponseBody
	public BSLResult getM7101Report(QueryCriteria queryCriteria){
		BSLResult result = null;
		if(StringUtils.isBlank(queryCriteria.getPage())) {
			result =  BSLResult.build(400, "页码不能为空");
		}else if(StringUtils.isBlank(queryCriteria.getRows())) {
			result =  BSLResult.build(400, "每页记录数不能为空");
		}else{
			result = reportService.getM7101Report(queryCriteria);
		}
		return result;
	}
	
	/**
	 * 纵剪机组生产报表
	 * @param 
	 * @param 
	 * @return
	 */
	@RequestMapping("/listByCriteriaM7102")
	@ResponseBody
	public BSLResult getM7102Report(QueryCriteria queryCriteria){
		BSLResult result = null;
		if(StringUtils.isBlank(queryCriteria.getPage())) {
			result =  BSLResult.build(400, "页码不能为空");
		}else if(StringUtils.isBlank(queryCriteria.getRows())) {
			result =  BSLResult.build(400, "每页记录数不能为空");
		}else{
			result = reportService.getM7102Report(queryCriteria);
		}
		return result;
	}
	
	/**
	 * 产成品销售报表
	 * @param 
	 * @param 
	 * @return
	 */
	@RequestMapping("/listByCriteriaM7103")
	@ResponseBody
	public BSLResult getM7103Report(QueryCriteria queryCriteria){
		BSLResult result = null;
		if(StringUtils.isBlank(queryCriteria.getPage())) {
			result =  BSLResult.build(400, "页码不能为空");
		}else if(StringUtils.isBlank(queryCriteria.getRows())) {
			result =  BSLResult.build(400, "每页记录数不能为空");
		}else{
			result = reportService.getM7103Report(queryCriteria);
		}
		return result;
	}
	
	/**
	 * 半成品销售报表
	 * @param 
	 * @param 
	 * @return
	 */
	@RequestMapping("/listByCriteriaM7104")
	@ResponseBody
	public BSLResult getM7104Report(QueryCriteria queryCriteria){
		BSLResult result = null;
		if(StringUtils.isBlank(queryCriteria.getPage())) {
			result =  BSLResult.build(400, "页码不能为空");
		}else if(StringUtils.isBlank(queryCriteria.getRows())) {
			result =  BSLResult.build(400, "每页记录数不能为空");
		}else{
			result = reportService.getM7104Report(queryCriteria);
		}
		return result;
	}
	
	/**
	 * 原材料进库报表日报
	 * @param 
	 * @param 
	 * @return
	 */
	@RequestMapping("/listM7105")
	@ResponseBody
	public BSLResult getM7105Report(QueryCriteria queryCriteria){
		BSLResult result = null;
		if(StringUtils.isBlank(queryCriteria.getPage())) {
			result =  BSLResult.build(400, "页码不能为空");
		}else if(StringUtils.isBlank(queryCriteria.getRows())) {
			result =  BSLResult.build(400, "每页记录数不能为空");
		}else{
			result = rawReportService.getM7105Report(queryCriteria);
		}
		return result;
	}
	
	/**
	 * 原材料进库报表统计
	 * @param 
	 * @param 
	 * @return
	 */
	@RequestMapping("/listM7105s")
	@ResponseBody
	public BSLResult getM7105sReport(QueryCriteria queryCriteria){
		BSLResult result = null;
		if(StringUtils.isBlank(queryCriteria.getPage())) {
			result =  BSLResult.build(400, "页码不能为空");
		}else if(StringUtils.isBlank(queryCriteria.getRows())) {
			result =  BSLResult.build(400, "每页记录数不能为空");
		}else{
			try {
				return rawReportService.getM7105sReport(queryCriteria);
			} catch (Exception e) {
				DictItemOperation.log.info("===========异常:"+e.getMessage());
				return BSLResult.build(ErrorCodeInfo.错误类型_交易异常,e.getMessage());
			}
		}
		return result;
	}
	
	/**
	 * 原材料进库报表合计
	 * @param 
	 * @param 
	 * @return
	 */
	@RequestMapping("/listM7105sHJ")
	@ResponseBody
	public BSLResult getM7105sHJReport(QueryCriteria queryCriteria){
		BSLResult result = null;
		if(StringUtils.isBlank(queryCriteria.getPage())) {
			result =  BSLResult.build(400, "页码不能为空");
		}else if(StringUtils.isBlank(queryCriteria.getRows())) {
			result =  BSLResult.build(400, "每页记录数不能为空");
		}else{
			try {
				return rawReportService.getM7105sHJReport(queryCriteria);
			} catch (Exception e) {
				DictItemOperation.log.info("===========异常:"+e.getMessage());
				return BSLResult.build(ErrorCodeInfo.错误类型_交易异常,e.getMessage());
			}
		}
		return result;
	}
	
	/**
	 * 产成品库存报表日报
	 * @param 
	 * @param 
	 * @return
	 */
	@RequestMapping("/listM7106")
	@ResponseBody
	public BSLResult getM7106Report(QueryCriteria queryCriteria){
		BSLResult result = null;
		if(StringUtils.isBlank(queryCriteria.getPage())) {
			result =  BSLResult.build(400, "页码不能为空");
		}else if(StringUtils.isBlank(queryCriteria.getRows())) {
			result =  BSLResult.build(400, "每页记录数不能为空");
		}else{
			result = prodReportService.getM7106Report(queryCriteria);
		}
		return result;
	}
	
	/**
	 * 查询库存日照信息
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping("/listM8001")
	@ResponseBody
	public EasyUIDataGridResult getProdInfoList(Integer page,Integer rows){		
		return reportService.getAllProductPhotoService(page, rows);
	}
		
	/**
	 * 根据条件查询库存日照信息
	 * @param 
	 * @param 
	 * @return
	 */
	@RequestMapping("/listByCriteriaM8001")
	@ResponseBody
	public BSLResult getProdInfoList(QueryCriteria queryCriteria){
		BSLResult result = null;
		if(StringUtils.isBlank(queryCriteria.getPage())) {
			result =  BSLResult.build(400, "页码不能为空");
		}else if(StringUtils.isBlank(queryCriteria.getRows())) {
			result =  BSLResult.build(400, "每页记录数不能为空");
		}else{
			result = reportService.getProductPhotoService(queryCriteria);
		}
		return result;
	} 
	
	/**
	 * 查询库存变动日汇总信息
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping("/listM8002")
	@ResponseBody
	public EasyUIDataGridResult getStockChangeInfoList(Integer page,Integer rows){		
		return reportService.getAllStockChangeInfoService(page, rows);
	}
		
	/**
	 * 根据条件查询库存变动日汇总信息
	 * @param 
	 * @param 
	 * @return
	 */
	@RequestMapping("/listByCriteriaM8002")
	@ResponseBody
	public BSLResult getStockChangeInfoList(QueryCriteria queryCriteria){
		BSLResult result = null;
		if(StringUtils.isBlank(queryCriteria.getPage())) {
			result =  BSLResult.build(400, "页码不能为空");
		}else if(StringUtils.isBlank(queryCriteria.getRows())) {
			result =  BSLResult.build(400, "每页记录数不能为空");
		}else{
			result = reportService.getStockChangeInfoService(queryCriteria);
		}
		return result;
	} 
	
	/**
	 * 查询库存变动汇总信息
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping("/listM8003")
	@ResponseBody
	public EasyUIDataGridResult getStockChangeSumInfoList(Integer page,Integer rows){		
		return reportService.getAllStockChangeSumService(page, rows);
	}
		
	/**
	 * 根据条件查询库存变动汇总信息
	 * @param 
	 * @param 
	 * @return
	 */
	@RequestMapping("/listByCriteriaM8003")
	@ResponseBody
	public BSLResult getStockChangeSumInfoList(QueryCriteria queryCriteria){
		BSLResult result = null;
		if(StringUtils.isBlank(queryCriteria.getPage())) {
			result =  BSLResult.build(400, "页码不能为空");
		}else if(StringUtils.isBlank(queryCriteria.getRows())) {
			result =  BSLResult.build(400, "每页记录数不能为空");
		}else{
			result = reportService.getStockChangeSumService(queryCriteria);
		}
		return result;
	} 
	
	/**
	 * 查询单炉报表信息
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping("/listM8004")
	@ResponseBody
	public EasyUIDataGridResult getLuStockInfoList(Integer page,Integer rows){		
		return reportService.getAllLuStockInfoService(page, rows);
	}
		
	/**
	 * 根据条件查询单炉报表信息
	 * @param 
	 * @param 
	 * @return
	 */
	@RequestMapping("/listByCriteriaM8004")
	@ResponseBody
	public BSLResult getLuStockInfoList(QueryCriteria queryCriteria){
		BSLResult result = null;
		if(StringUtils.isBlank(queryCriteria.getPage())) {
			result =  BSLResult.build(400, "页码不能为空");
		}else if(StringUtils.isBlank(queryCriteria.getRows())) {
			result =  BSLResult.build(400, "每页记录数不能为空");
		}else{
			result = reportService.getLuStockInfoService(queryCriteria);
		}
		return result;
	}
	
}
