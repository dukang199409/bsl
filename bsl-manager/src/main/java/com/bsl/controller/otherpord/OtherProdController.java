package com.bsl.controller.otherpord;

import javax.servlet.http.HttpServletRequest;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.bsl.common.pojo.BSLException;
import com.bsl.common.utils.BSLResult;
import com.bsl.pojo.BslProductInfo;
import com.bsl.select.DictItemOperation;
import com.bsl.select.ErrorCodeInfo;
import com.bsl.select.QueryCriteria;
import com.bsl.service.otherprod.OtherProdService;

/**
 * @author 杜康
 * 外厂来料产品库存台账Controller
 */
@Controller
@RequestMapping("/otherProd")
public class OtherProdController {
	
	@Autowired
	private OtherProdService otherProdService;
	
	/**
	 * 根据条件查询外厂来料产品库存台账信息
	 * @param 
	 * @param 
	 * @return
	 */
	@RequestMapping("/listByCriteria")
	@ResponseBody
	public BSLResult getOtherProdInfo(QueryCriteria queryCriteria){
		BSLResult result = null;
		if(StringUtils.isBlank(queryCriteria.getPage())) {
			result =  BSLResult.build(400, "页码不能为空");
		}else if(StringUtils.isBlank(queryCriteria.getRows())) {
			result =  BSLResult.build(400, "每页记录数不能为空");
		}else{
			result = otherProdService.getOtherProdInfo(queryCriteria);
		}
		return result;
	}
	
	
	/**
	 * 外厂来料产品入库
	 * @param 
	 * @param 
	 * @return
	 */
	@RequestMapping("/addProd")
	@ResponseBody
	public BSLResult cfmRaw(BslProductInfo bslProductInfo,String sumNum){
		int sumNumInt = Integer.parseInt(sumNum);
		if(StringUtils.isBlank(bslProductInfo.getProdPlanNo())){
			return BSLResult.build(ErrorCodeInfo.错误类型_参数为空, "外厂来料单号不能为空");
		}
		if(StringUtils.isBlank(bslProductInfo.getProdName())){
			return BSLResult.build(ErrorCodeInfo.错误类型_参数为空, "产品名称不能为空");
		}
		if(StringUtils.isBlank(bslProductInfo.getProdMaterial())){
			return BSLResult.build(ErrorCodeInfo.错误类型_参数为空, "产品钢种不能为空");
		}
		if(StringUtils.isBlank(bslProductInfo.getProdNorm())){
			return BSLResult.build(ErrorCodeInfo.错误类型_参数为空, "产品规格不能为空");
		}
		if(bslProductInfo.getProdLength() == null || bslProductInfo.getProdLength() == 0){
			return BSLResult.build(ErrorCodeInfo.错误类型_参数为空, "产品定尺不能为空");
		}
		if(bslProductInfo.getProdRelWeight() == null || bslProductInfo.getProdRelWeight() == 0){
			return BSLResult.build(ErrorCodeInfo.错误类型_参数为空, "产品实际重量不能为空");
		}
		if(bslProductInfo.getProdNum() == null || bslProductInfo.getProdNum() == 0){
			return BSLResult.build(ErrorCodeInfo.错误类型_参数为空, "产品件数不能为空");
		}
		if(StringUtils.isBlank(bslProductInfo.getProdInputuser())){
			return BSLResult.build(ErrorCodeInfo.错误类型_参数为空, "录入人不能为空");
		}
		try {
			return otherProdService.addOtherProdInfo(bslProductInfo,sumNumInt);
		} catch (Exception e) {
			if(e instanceof BSLException) {
				BSLException bslException = (BSLException) e;
				return BSLResult.build(bslException.getErrorCode(), bslException.getMessage());
			}else {
				DictItemOperation.log.info("===========异常:"+e.getMessage());
				return BSLResult.build(ErrorCodeInfo.错误类型_交易异常, e.getMessage());
			}
		}
	}
	
	/**
	 * 外厂来料产品修改
	 * @param 
	 * @param 
	 * @return
	 */
	@RequestMapping("/editProd")
	@ResponseBody
	public BSLResult editRaw(BslProductInfo bslProductInfo){
		if(StringUtils.isBlank(bslProductInfo.getProdId())){
			return BSLResult.build(ErrorCodeInfo.错误类型_参数为空, "产品编号不能为空");
		}
		if(StringUtils.isBlank(bslProductInfo.getProdPlanNo())){
			return BSLResult.build(ErrorCodeInfo.错误类型_参数为空, "外厂来料单号不能为空");
		}
		if(StringUtils.isBlank(bslProductInfo.getProdName())){
			return BSLResult.build(ErrorCodeInfo.错误类型_参数为空, "产品名称不能为空");
		}
		if(StringUtils.isBlank(bslProductInfo.getProdMaterial())){
			return BSLResult.build(ErrorCodeInfo.错误类型_参数为空, "产品钢种不能为空");
		}
		if(StringUtils.isBlank(bslProductInfo.getProdNorm())){
			return BSLResult.build(ErrorCodeInfo.错误类型_参数为空, "产品规格不能为空");
		}
		if(bslProductInfo.getProdLength() == null || bslProductInfo.getProdLength() == 0){
			return BSLResult.build(ErrorCodeInfo.错误类型_参数为空, "产品定尺不能为空");
		}
		if(bslProductInfo.getProdRelWeight() == null || bslProductInfo.getProdRelWeight() == 0){
			return BSLResult.build(ErrorCodeInfo.错误类型_参数为空, "产品实际重量不能为空");
		}
		if(bslProductInfo.getProdNum() == null || bslProductInfo.getProdNum() == 0){
			return BSLResult.build(ErrorCodeInfo.错误类型_参数为空, "产品件数不能为空");
		}
		try {
			return otherProdService.updateOtherProdInfo(bslProductInfo);
		} catch (Exception e) {
			DictItemOperation.log.info("===========异常:"+e.getMessage());
			return BSLResult.build(ErrorCodeInfo.错误类型_交易异常, e.getMessage());
		}
	}
	
	/**
	 * 外厂来料产品删除
	 * @param 
	 * @param 
	 * @return
	 */
	@RequestMapping("/delete")
	@ResponseBody
	public BSLResult deleteRaw(String prodId){
		if(StringUtils.isBlank(prodId)){
			return BSLResult.build(ErrorCodeInfo.错误类型_参数为空, "产品编号不能为空");
		}
		try {
			return otherProdService.deleteOtherProd(prodId);
		} catch (Exception e) {
			DictItemOperation.log.info("===========异常:"+e.getMessage());
			return BSLResult.build(ErrorCodeInfo.错误类型_交易异常, e.getMessage());
		}
	}
	
	
	@RequestMapping("/{page}")
	public String showUserPage(@PathVariable String page, HttpServletRequest request) {
		return page;
	}
	
}
