<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link href="/js/kindeditor-4.1.10/themes/default/default.css" type="text/css" rel="stylesheet">
<script type="text/javascript" charset="utf-8" src="/js/kindeditor-4.1.10/kindeditor-all-min.js"></script>
<script type="text/javascript" charset="utf-8" src="/js/kindeditor-4.1.10/lang/zh_CN.js"></script>
<style>
	tr{height:30px}
</style>
<div style="padding:10px 10px 10px 10px">
	<form id="prodM3108AddBForm" class="itemForm" method="post">
	   <table>
	        <tr>
	            <td width="120" align="right">产品名称:</td>
	            <td width="210" align="right">
	            	<input name="prodName" class="easyui-textbox" type="text" data-options="required:true,validType:'length[0,40]'" style="width:200px;"></input>
	            </td>      
	            <td width="120" align="right">父级产品编号:</td>
	            <td width="210" align="right">
	            	<input name="prodOriId" id="prodOriIdM3108AddB" class="easyui-textbox" type="text" data-options="required:true,validType:'length[0,20]',events:{blur:onProdOriIdBlurM3108AddB}"  style="width:200px;"></input>
	            </td> 
	        </tr>
	        <tr>	
	            <td width="120" align="right">产品钢种:</td>
	            <td width="210" align="right">
	            	<select name="prodMaterial" id="prodMaterialM3108AddB" readonly="readonly" class="easyui-combobox" panelHeight="auto" readonly="readonly" data-options="editable:true" style="width:200px;">
			           <option value="">请选择...</option>
			           <c:forEach items="${prodMaterialList}" var="a">
			          	   	<option value="${a.enumKey}">${a.enumValue}</option>
			          </c:forEach>
					</select>
				</td>
	            <td width="120" align="right">产品规格:</td>
	             <td width="210" align="right">
	            	<input name="prodNorm" id="prodNormM3108AddB" readonly="readonly" class="easyui-textbox" type="text" data-options="required:true,validType:'length[0,40]'" style="width:200px;"></input>
	            </td>
	        </tr>
	       <tr>  
	       		 <td width="120" align="right">产品炉号:</td>
	             <td width="210" align="right">
	            	<input name="prodLuno" id="prodLunoM3108AddB" readonly="readonly" class="easyui-textbox" readonly="readonly" type="text" data-options="required:true,validType:'length[0,40]'" style="width:200px;"></input>
	            </td> 
	            <td width="120" align="right">产品定尺(米):</td>
	            <td width="210" align="right">
	            	<input name="prodLength" id="prodLengthM3108AddB"  class="easyui-numberbox" type="text" data-options="required:true,min:0,precision:3,validType:'length[0,10]'" style="width:200px;"></input>
	            </td>
	       </tr>
	       <tr>
	           <td width="120" align="right">质量等级:</td>
	            <td width="210" align="right">
	            	<select name="prodLevel" id="prodLevelM3108AddB" class="easyui-combobox" panelHeight="auto" data-options="editable:true" style="width:200px;">
			         <option value="">请选择...</option>
			          <c:forEach items="${prodLevelList}" var="a">
			          	   	<option value="${a.enumKey}">${a.enumValue}</option>
			          </c:forEach>
					</select>
	            </td>
	            <td width="120" align="right">产品重量/吨:</td>
	            <td width="210" align="right">
	            	<input name="prodRelWeight" id="prodRelWeightM3108AddB" class="easyui-numberbox" type="text" data-options="required:true,min:0,precision:3,validType:'length[0,10]'"  style="width:200px;"></input>
	            </td>
	        </tr>
	        <tr>
	        	<td width="120" align="right">单包件数:</td>
	            <td width="210" align="right">
	            	<input name="prodNum" class="easyui-numberbox" type="text" data-options="required:true,min:0,precision:0,validType:'length[0,10]'" style="width:200px;"></input>
	            </td>
	        	<td width="120" align="right">生产班次:</td>
	            <td width="210" align="right">
	            	<select name="prodBc" class="easyui-combobox" panelHeight="auto" data-options="required:true,editable:true" style="width:200px;">
			           <option value="">请选择...</option>
			          <c:forEach items="${prodBcList}" var="a">
			          	   	<option value="${a.enumKey}">${a.enumValue}</option>
			          </c:forEach>
					</select>
	            </td> 
	        </tr>
	        <tr>	 
	            <td width="120" align="right">入库仓库/区:</td>
	            <td width="210" align="right">
	            	<select name="prodRuc" class="easyui-combobox" panelHeight="auto" data-options="required:true,editable:true" style="width:200px;">
			           <option value="">请选择...</option>
			          <c:forEach items="${prodRucList}" var="a">
			          	   	<option value="${a.enumKey}">${a.enumValue}</option>
			          </c:forEach>
					</select>
	            </td>  
	        	<td width="120" align="right">备注:</td>
	            <td width="210" align="right">
	            	<input name="remark" class="easyui-textbox" type="text" data-options="required:false,validType:'length[0,120]'" style="width:200px;" maxLength="10"></input>
	            </td> 
	        </tr>
	        <tr hidden="true">
	            <td width="120" align="right">录入人:</td>
	            <td width="210" align="right">
	            	<input name="prodInputuser" id="prodInputuserM3108AddB" class="easyui-textbox" type="text" data-options="required:false" style="width:200px;"></input>
	            </td>
		    </tr>	
	    </table>
	</form>
	<div style="margin-top:10px" align="center">
	    <a href="javascript:void(0)" class="easyui-linkbutton" id="M3108AddB" onclick="submitM3108AddBForm()">提交</a>
	    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="closeM3108AddBForm()">关闭</a>
	</div>
</div>
<script type="text/javascript">
	
	//根据指令号回显名称钢种等信息
	function onProdOriIdBlurM3108AddB(){
		var prodOriId = $("#prodOriIdM3108AddB").textbox('getValue');
		var params = {"prodId":prodOriId};
		$.post("/prodManager/getProdById", params, function(data) {
			if (data.status == 200) {
				$("#prodMaterialM3108AddB").combobox('setValue',data.data.prodMaterial);
				$("#prodNormM3108AddB").textbox('setValue',data.data.prodNorm);
				$("#prodLunoM3108AddB").textbox('setValue',data.data.prodLuno);
				$("#prodLevelM3108AddB").combobox('setValue',data.data.prodLevel);
			} else {
				$.messager.alert('提示', data.msg);
				$("#prodMaterialM3108AddB").combobox('setValue','');
				$("#prodNormM3108AddB").textbox('setValue','');
				$("#prodLunoM3108AddB").textbox('setValue','');
				$("#prodLevelM3108AddB").combobox('setValue','');
				return false;
			}
		});
		
	}
	
	//提交表单
	function submitM3108AddBForm(){
		
		//记录录入人员信息
		var inputUser = $("#user_id").html();
		$("#prodInputuserM3108AddB").textbox('setValue',inputUser);
		//有效性验证
		if(!$('#prodM3108AddBForm').form('validate')){
			$.messager.alert('提示','表单还未填写完成!');
			return;
		}
		//ajax的post方式提交表单
		//$("#itemAddForm").serialize()将表单序列号为key-value形式的字符串
		$.messager.confirm('确认','是否确认补录入库？',function(r){
			if (r){
				$.post("/prodWxManager/addM3108Prod",$("#prodM3108AddBForm").serialize(), function(data){
					if(data.status == 200){
						var prodId = data.data;
						$.messager.alert('提示','加工产品补录完成!单号为：'+prodId,'info',function(){
							if(sumNum<=1){
								$.messager.confirm('确认','是否需要打印PDF标签文件？',function(r){
									if (r){
					        	    	var mapParam = new Map();
					        			mapParam.set("url","/import/importPdf");
					        			mapParam.set("prodId",prodId);
					        			mapParam.set("tradeType","M3005");
					        			BSL.toNewPagePDF(mapParam);
					        	    }
								});
							}
							$("#prodM3108AddWindowB").window('close');
							searchM3108Form();
							//$("#receiptList").datagrid("reload");
						});
					}else{
						$.messager.alert('提示','错误码：'+data.status+',错误信息：'+data.msg);
					}
				});
			}
		});
	}
	
	function closeM3108AddBForm(){
		$("#prodM3108AddWindowB").window('close');
	}
	
</script>