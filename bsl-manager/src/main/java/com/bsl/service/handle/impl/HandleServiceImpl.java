package com.bsl.service.handle.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bsl.common.utils.BSLResult;
import com.bsl.mapper.BslProductInfoMapper;
import com.bsl.service.handle.HandleService;

@Service
public class HandleServiceImpl implements HandleService {

	@Autowired
	private BslProductInfoMapper bslProductInfoMapper;
	
	@Override
	public BSLResult useCompanyImport() {
		try (InputStream inputStream = new FileInputStream(new File("/root/bsllogs/usecompany.xlsx"))) {
			// 解析Excel对象流转成需要的对象
			List<UseCompanyModule> uclist = processExcel(inputStream);
			for (int i=0;i<=uclist.size();i++) {
				bslProductInfoMapper.updateUseCompanyByExcel(uclist.get(i));
				if(i%1000==0) {
					System.out.println("已经修改"+i+"行");
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	//导入数据
	private List<UseCompanyModule> processExcel(InputStream inputStream) throws Exception {
		List<UseCompanyModule> uclist = new ArrayList<>();

		try{
			Workbook workbook = WorkbookFactory.create(inputStream);
			Sheet sheet = workbook.getSheetAt(0);
			int totalRow = sheet.getLastRowNum();
			if (totalRow == 0) {
				throw new Exception("文件内容为空");
			} 
			
			UseCompanyModule forlanStudent = null;

			// 遍历每行
			for (int rowIndex = 1; rowIndex <= totalRow; rowIndex++) {
				Row currentRow = sheet.getRow(rowIndex);
				if (currentRow == null) {
					continue;
				}
				String prodId = currentRow.getCell(0).toString();
				String useCompany = currentRow.getCell(1).toString();
				if(!StringUtils.isBlank(prodId) || !StringUtils.isBlank(useCompany)) {
					forlanStudent = new UseCompanyModule();
					forlanStudent.setProdId(prodId);
					forlanStudent.setUseCompany(useCompany);
					uclist.add(forlanStudent);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}

		return uclist;
	}

}
