<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link href="/js/kindeditor-4.1.10/themes/default/default.css" type="text/css" rel="stylesheet">
<script type="text/javascript" charset="utf-8" src="/js/kindeditor-4.1.10/kindeditor-all-min.js"></script>
<script type="text/javascript" charset="utf-8" src="/js/kindeditor-4.1.10/lang/zh_CN.js"></script>
<style>
	tr{height:30px}
</style>
<div style="padding:10px 10px 10px 10px">
	<form id="prodWxInfoDealForm" class="itemForm" method="post">
	   <table>
	        <tr>
	            <td width="120"  align="right">产品编号:</td>
	            <td width="210"  align="right">
	            	<input name="prodOriId" id="prodOriIdM3103Deal" class="easyui-textbox" readonly="readonly" data-options="required:false" style="width:200px;"/>
	            </td>      
	            <td width="120" align="right">产品钢种:</td>
	            <td width="210" align="right">
	            	<select name="prodMaterial" id="prodMaterialM3103Deal" readonly="readonly" class="easyui-combobox" panelHeight="auto" data-options="editable:true" style="width:200px;">
			           <option value="">请选择...</option>
			           <c:forEach items="${prodMaterialList}" var="a">
			          	   	<option value="${a.enumKey}">${a.enumValue}</option>
			          </c:forEach>
					</select>
				</td>    
	        </tr>
	        <tr>  
				 <td width="120" align="right">产品炉号:</td>
	             <td width="210" align="right">
	            	<input name="prodLuno" id="prodLunoM3103Deal" class="easyui-textbox" readonly="readonly" type="text" data-options="required:true,validType:'length[0,40]'" style="width:200px;"></input>
	            </td> 
	            <td width="120" align="right">产品规格:</td>
	             <td width="210" align="right">
	            	<input name="prodNorm" id="prodNormM3103Deal" class="easyui-textbox" readonly="readonly" type="text" data-options="required:true,validType:'length[0,40]'" style="width:200px;"></input>
	            </td> 
	        </tr>
	        <tr>
	            <td width="120" align="right">产品定尺(米):</td>
	            <td width="210" align="right">
	            	<input name="prodLength" id="prodLengthM3103Deal"  class="easyui-numberbox" type="text" data-options="required:true,min:0,precision:3,validType:'length[0,10]'" style="width:200px;"></input>
	            </td>
	            <td width="120" align="right">产品名称:</td>
	            <td width="210" align="right">
	            	<input name="prodName" id="prodNameM3103Deal" class="easyui-textbox" type="text" data-options="required:true,validType:'length[0,40]'" style="width:200px;"></input>
	            </td> 
	        </tr>
	        <tr>
	           <td width="120" align="right">质量等级:</td>
	            <td width="210" align="right">
	            	<select name="prodLevel" id="prodLevelM3103Deal" class="easyui-combobox" panelHeight="auto" data-options="editable:true" style="width:200px;">
			         <option value="">请选择...</option>
			          <c:forEach items="${prodLevelList}" var="a">
			          	   	<option value="${a.enumKey}">${a.enumValue}</option>
			          </c:forEach>
					</select>
	            </td>
	            <td width="120" align="right">产品总重量/吨:</td>
	            <td width="210" align="right">
	            	<input name="prodRelWeight" id="prodRelWeightM3103Deal" class="easyui-numberbox" type="text" data-options="required:true,min:0,precision:3,validType:'length[0,10]'"  style="width:200px;"></input>
	            </td>
	        </tr>
	        <tr>
	        	<td width="120" align="right">单包件数:</td>
	            <td width="210" align="right">
	            	<input name="prodNum" class="easyui-numberbox" type="text" data-options="required:true,min:0,precision:0,validType:'length[0,10]'" style="width:200px;"></input>
	            </td>
	        	<td width="120" align="right">入库包数:</td>
	        	<td width="210" align="right">
	            	<input name="sumNum" id="sumNumM3103Deal" class="easyui-numberbox" type="text" data-options="required:true,min:1,precision:0,validType:'length[0,10]'" value="1" style="width:200px;"></input>
	            </td>
	        </tr>
	        <tr>	 
	        	<td width="120" align="right">生产班次:</td>
	            <td width="210" align="right">
	            	<select name="prodBc" class="easyui-combobox" panelHeight="auto" data-options="required:true,editable:true" style="width:200px;">
			           <option value="">请选择...</option>
			          <c:forEach items="${prodBcList}" var="a">
			          	   	<option value="${a.enumKey}">${a.enumValue}</option>
			          </c:forEach>
					</select>
	            </td> 
	            <td width="120" align="right">入库仓库/区:</td>
	            <td width="210" align="right">
	            	<select name="prodRuc" class="easyui-combobox" panelHeight="auto" data-options="required:true,editable:true" style="width:200px;">
			           <option value="">请选择...</option>
			          <c:forEach items="${prodRucList}" var="a">
			          	   	<option value="${a.enumKey}">${a.enumValue}</option>
			          </c:forEach>
					</select>
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
	            	<input name="prodInputuser" id="prodInputuserM3103Deal" class="easyui-textbox" type="text" data-options="required:false" style="width:200px;"></input>
	            </td>
		    </tr>	
	    </table>
	</form>
	<div style="margin-top:10px" align="center">
	    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitM3103DealForm()">提交</a>
	    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="closeM3103DealForm()">关闭</a>
	</div>
</div>
<script type="text/javascript">
	
	//联动称重机获取实际重量
	function getWeightCheckM3103Deal(){
		var params = {};
		$.post("/rxtx/weighing",params, function(data){
			if(data.status == 200){
				$("#prodRelWeightM3103Deal").numberbox('setValue',data.data);
			}else{
				$.messager.alert('提示','错误码：'+data.status+',错误信息：'+data.msg);
			}
		});
	}
	
	//提交表单
	function submitM3103DealForm(){
		
		//记录录入人员信息
		var inputUser = $("#user_id").html();
		$("#prodInputuserM3103Deal").textbox('setValue',inputUser);
		var sumNum = $("#sumNumM3103Deal").numberbox('getValue');
		//有效性验证
		if(!$('#prodWxInfoDealForm').form('validate')){
			$.messager.alert('提示','表单还未填写完成!');
			return;
		}
		//ajax的post方式提交表单
		//$("#itemAddForm").serialize()将表单序列号为key-value形式的字符串
		$.messager.confirm('确认','是否确认入库？',function(r){
			if (r){
				$.post("/prodWxManager/addWxProd3103",$("#prodWxInfoDealForm").serialize(), function(data){
					if(data.status == 200){
						var prodId = data.data;
						$.messager.confirm('提示','外协厂产品加工入库成功!起始单号为：'+prodId+"；是否将该产品状态更新为加工完成？",function(rn){
							if (rn){
								var params = {"prodId":$("#prodOriIdM3103Deal").textbox('getValue'),"user":inputUser};
								$.post("/prodWxManager/dealWxProdFinish",params, function(result){
									if(result.status == 200){
										$.messager.alert('提示','状态更新成功!',undefined,function(){
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
			            				});
									}else{
										$.messager.alert('提示','错误码：'+result.status+',错误信息：'+result.msg);
									}
								});
							}else{
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
							}
							$("#prodWxDealWindow").window('close');
							searchM3103Form();
							//$("#receiptList").datagrid("reload");
						});
					}else{
						$.messager.alert('提示','错误码：'+data.status+',错误信息：'+data.msg);
					}
				});
			}
		});
	}
	
	function closeM3103DealForm(){
		$("#prodWxDealWindow").window('close');
	}
	
</script>
