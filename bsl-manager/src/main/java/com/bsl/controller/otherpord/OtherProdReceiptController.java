package com.bsl.controller.otherpord;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.bsl.common.utils.BSLResult;
import com.bsl.pojo.BslBsPlanInfo;
import com.bsl.select.DictItemOperation;
import com.bsl.select.ErrorCodeInfo;
import com.bsl.select.QueryCriteria;
import com.bsl.service.otherprod.OtherProdReceiptService;

/**
 * @author 杜康
 * 外厂成品来料通知单管理Controller
 */
@Controller
@RequestMapping("/otherProdReceipt")
public class OtherProdReceiptController {
	
	@Autowired
	private OtherProdReceiptService otherProdReceiptService;
	
	
	/**
	 * 根据条件查询外厂成品来料通知单信息
	 * @param 
	 * @param 
	 * @return
	 */
	@RequestMapping("/listByCriteria")
	@ResponseBody
	public BSLResult getReceiptList(QueryCriteria queryCriteria){
		BSLResult result = null;
		if(StringUtils.isBlank(queryCriteria.getPage())) {
			result =  BSLResult.build(400, "页码不能为空");
		}else if(StringUtils.isBlank(queryCriteria.getRows())) {
			result =  BSLResult.build(400, "每页记录数不能为空");
		}else{
			result = otherProdReceiptService.getOtherProdReceiptService(queryCriteria);
		}
		return result;
	}
	
	/**
	 * 新增外厂成品来料通知单
	 * @param BslBsPlanInfo
	 * @return
	 */
	@RequestMapping(value="/addReceipt", method=RequestMethod.POST)
	@ResponseBody
	public BSLResult addReceiptInfo(BslBsPlanInfo bslBsPlanInfo,String bsArrdateAdd) {
		if(StringUtils.isBlank(bslBsPlanInfo.getBsCompany())){
			return BSLResult.build(ErrorCodeInfo.错误类型_参数为空, "来料供应商不能为空");
		}
		try {
			return otherProdReceiptService.addOtherProdReceiptInfo(bslBsPlanInfo);
		} catch (Exception e) {
			DictItemOperation.log.info("===========异常:"+e.getMessage());
			return BSLResult.build(ErrorCodeInfo.错误类型_交易异常,e.getMessage());
		}
	}
	
	/**
	 * 修改外厂成品来料通知单
	 * @param BslBsPlanInfo
	 * @return
	 */
	@RequestMapping(value="/editReceipt", method=RequestMethod.POST)
	@ResponseBody
	public BSLResult editReceiptInfo(BslBsPlanInfo bslBsPlanInfo,String crtDateM1001EditText,String bsArrdateEditText) {
		if(StringUtils.isBlank(bslBsPlanInfo.getBsCompany())){
			return BSLResult.build(ErrorCodeInfo.错误类型_参数为空, "来料供应商不能为空");
		}
		if(StringUtils.isBlank(bslBsPlanInfo.getBsId())){
			return BSLResult.build(ErrorCodeInfo.错误类型_参数为空, "外厂成品来料通知单号不能为空");
		}
		try {
			return otherProdReceiptService.updateOtherProdReceiptInfo(bslBsPlanInfo);
		} catch (Exception e) {
			DictItemOperation.log.info("===========异常:"+e.getMessage());
			return BSLResult.build(ErrorCodeInfo.错误类型_交易异常, e.getMessage());
		}
	}
	
	/**
	 * 删除外厂成品来料通知单
	 * @param BslBsPlanInfo
	 * @return
	 */
	@RequestMapping(value="/delete", method=RequestMethod.POST)
	@ResponseBody
	public BSLResult deleteReceiptInfo(BslBsPlanInfo bslBsPlanInfo) {
		try {
			return otherProdReceiptService.deleteOtherProdReceiptInfo(bslBsPlanInfo);
		} catch (Exception e) {
			DictItemOperation.log.info("===========异常:"+e.getMessage());
			return BSLResult.build(ErrorCodeInfo.错误类型_交易异常,e.getMessage());
		}
	}
	
	@RequestMapping("/{page}")
	public String showUserPage(@PathVariable String page) {
		return page;
	}
	
}
