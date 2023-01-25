<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link href="/js/kindeditor-4.1.10/themes/default/default.css" type="text/css" rel="stylesheet">
<script type="text/javascript" charset="utf-8" src="/js/kindeditor-4.1.10/kindeditor-all-min.js"></script>
<script type="text/javascript" charset="utf-8" src="/js/kindeditor-4.1.10/lang/zh_CN.js"></script>
<style>
	tr{height:30px}
</style>
<div style="padding:10px 10px 10px 10px">
	<form id="otherProdReceiptEditForm" class="itemForm" method="post">
	   <table>
	        <tr>
	        	<td width="120" align="right">外厂成品来料单号:</td>
	            <td width="210" align="right">
	            	<input name="bsId" class="easyui-textbox" type="text" data-options="required:true,validType:'length[0,20]'" readonly="readonly" style="width:200px;"></input>
	            </td>  
	            <td width="120" align="right">供应商:</td>
	            <td width="210" align="right">
	            	<input name="bsCompany" class="easyui-textbox" type="text" data-options="required:true,validType:'length[0,40]'" style="width:200px;"></input>
	            </td>
	        </tr>
	        <tr>
	            <td width="120" align="right">客户:</td>
	            <td width="210" align="right">
	            	<input name="bsCustomer" class="easyui-textbox" type="text" data-options="required:false,validType:'length[0,40]'" style="width:200px;"></input>
	            </td>
	            <td width="120" align="right">含质保书: </td>
	            <td width="210" align="right">
	            	<select name="bsHasguarantee" class="easyui-combobox" panelHeight="auto" data-options="editable:true" style="width:200px;">
			         <c:forEach items="${nyFlagList}" var="a">
			          	   <option value="${a.enumKey}">${a.enumValue}</option>
			          </c:forEach>
					</select>
	            </td>
	        </tr>
	        <tr>
	            <td width="120" align="right">包数:</td>
	            <td width="210" align="right">
	            	<input name="bsAmt" class="easyui-numberbox" type="text" data-options="required:false,min:1,precision:0,validType:'length[0,10]'" style="width:200px;"></input>
	            </td>
	            <td width="120" align="right">预计来料重量/吨:</td>
	            <td width="210" align="right">
	            	<input name="bsWeight" class="easyui-numberbox" type="text" data-options="required:false,min:0,precision:3,validType:'length[0,10]'" style="width:200px;"></input>
	            </td>
	        </tr>
	        <tr>
	            <td width="120" align="right">备注:</td>
	            <td width="210" align="right">
	            	<input name="remark" class="easyui-textbox" type="text" data-options="required:false,validType:'length[0,120]'" style="width:200px;" maxLength="10"></input>
	            </td>
	        </tr>
	        <tr hidden="true">
	        	<td width="120" align="right">录入人:</td>
	            <td width="210" align="right">
	            	<input name="bsInputuser" id="bsInputuserM3201" class="easyui-textbox" type="text" data-options="required:false" style="width:200px;"></input>
	            </td>
	            <td width="120" align="right">录入日期:</td>
	            <td width="210" align="right">
	            	<input name="crtDateM3201EditText" id="crtDateM3201EditText" class="easyui-textbox" type="text" data-options="required:false" style="width:200px;"></input>
	            </td>
	        </tr>
	    </table>
	</form>
	<div style="margin-top:10px" align="center">
	    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitEditM3201Form()">提交</a>
	    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="closeEditM3201Form()">关闭</a>
	</div>
</div>
<script type="text/javascript">
	
	//提交表单
	function submitEditM3201Form(){
		
		//记录录入人员信息
		var inputUser = $("#user_id").html(); 
		$("#bsInputuserM3201").textbox('setValue',inputUser);
		
		//有效性验证
		if(!$('#otherProdReceiptEditForm').form('validate')){
			$.messager.alert('提示','表单还未填写完成!');
			return ;
		}
		//ajax的post方式提交表单
		//$("#itemAddForm").serialize()将表单序列号为key-value形式的字符串
		$.post("/otherProdReceipt/editReceipt",$("#otherProdReceiptEditForm").serialize(), function(data){
			if(data.status == 200){
				$.messager.alert('提示','修改外厂成品来料通知单成功!单号为：'+data.data,'info',function(){
					$("#otherProdReceiptEditWindow").window('close');
					searchM3201Form();
				});
			}else{
				$.messager.alert('提示','错误码：'+data.status+',错误信息：'+data.msg);
			}
		});
	}
	
	function closeEditM3201Form(){
		$("#otherProdReceiptEditWindow").window('close');
	}
</script>
