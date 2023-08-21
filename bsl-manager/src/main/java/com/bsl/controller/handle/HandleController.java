package com.bsl.controller.handle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.bsl.common.utils.BSLResult;
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
	
	/**
	 * 根据excel导入使用单位
	 */
	@RequestMapping("/useCompanyImport")
	@ResponseBody
	public BSLResult useCompanyImport() {
		return handleService.useCompanyImport();
	}
	
}
