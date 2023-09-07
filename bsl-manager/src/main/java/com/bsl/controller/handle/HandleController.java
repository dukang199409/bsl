package com.bsl.controller.handle;

import java.text.ParseException;
import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.bsl.common.utils.BSLResult;
import com.bsl.mapper.BslProductInfoMapper;
import com.bsl.select.DictItemOperation;
import com.bsl.service.handle.HandleService;

/**
 * 手工调用接口
 * @author duk
 * @date 2019年3月28日  
 *
 */
@Controller
@RequestMapping("/handle")
public class HandleController {
	
	@Autowired
	private HandleService handleService;
	
	@Autowired
	private BslProductInfoMapper bslProductInfoMapper;
	
	/**
	 * 根据excel导入使用单位
	 */
	@RequestMapping("/useCompanyImport")
	@ResponseBody
	public BSLResult useCompanyImport() {
		return handleService.useCompanyImport();
	}
	
	/**
	 * 手工跑数
	 * @throws ParseException 
	 */
	@RequestMapping("/rawReportImport")
	@ResponseBody
	public BSLResult rawReportImport() throws ParseException {
		String startDate = "20190701";
		String endDate = "20230906";
		String todayString = "20190701";
		Calendar c = Calendar.getInstance();
		c.setTime(DictItemOperation.日期转换实例yyyyMMdd.parse(startDate));
		while(true) {
			todayString = DictItemOperation.日期转换实例yyyyMMdd.format(c.getTime());
			bslProductInfoMapper.insertProdMakeInfoReport(todayString);
			c.add(Calendar.DATE, 1);
			if(Integer.valueOf(todayString) > Integer.valueOf(endDate)) {
				break;
			}
		}
		
		return null;
	}
	
}
