package com.bsl.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bsl.pojo.BslProductInfo;
import com.bsl.pojo.BslProductInfoExample;
import com.bsl.reportbean.BslHalfProdMakeInfo;
import com.bsl.reportbean.BslOutProductDetailInfo;
import com.bsl.reportbean.BslProdMakeUseInfo;
import com.bsl.reportbean.BslProductInfoCollect;
import com.bsl.reportbean.BslProductQualityInfo;
import com.bsl.reportbean.BslSaleCarInfo;
import com.bsl.select.QueryCriteria;
import com.bsl.select.QueryExample;
import com.bsl.service.handle.impl.UseCompanyModule;

public interface BslProductInfoMapper {
    int countByExample(BslProductInfoExample example);

    int deleteByExample(BslProductInfoExample example);

    int deleteByPrimaryKey(String prodId);

    int insert(BslProductInfo record);

    int insertSelective(BslProductInfo record);

    List<BslProductInfo> selectByExample(BslProductInfoExample example);

    BslProductInfo selectByPrimaryKey(String prodId);

    int updateByExampleSelective(@Param("record") BslProductInfo record, @Param("example") BslProductInfoExample example);

    int updateByExample(@Param("record") BslProductInfo record, @Param("example") BslProductInfoExample example);

    int updateByPrimaryKeySelective(BslProductInfo record);

    int updateByPrimaryKey(BslProductInfo record);
    
    /**
     * 查询汇总后销售出库单 自定义sql
     * @param queryExample
     * @return
     */
    List<BslProductInfoCollect> querySaleOutBill(QueryExample queryExample);
    List<BslProductInfoCollect> querySaleOutBillWaste(QueryExample queryExample);
    List<BslProductInfoCollect> querySaleOutByProds(QueryExample queryExample);
    List<BslOutProductDetailInfo> querySaleOutGroup(QueryCriteria queryCriteria);
    //20231221之前的使用old
    List<BslProductQualityInfo> prodQualityInfoOld(QueryCriteria queryCriteria);
    //20231221之后的使用新的
    List<BslProductQualityInfo> prodQualityInfo(QueryCriteria queryCriteria);
    
    List<BslSaleCarInfo> prodSaleCarInfo(QueryCriteria queryCriteria);
    List<BslHalfProdMakeInfo> halfProdMakeInfo(QueryExample queryExample);
    
    int insertHistoryProductInfo(String dateString);
    int deleteHistoryProductInfo(String dateString);
    
    //查询某指令当前第一个出库的纵剪带信息
    List<BslProductInfo> getTheFirstOutProd(String prodOutPlan);
    
    //查询某指令当前前两个出库的纵剪带信息
    List<BslProductInfo> getTopTwoOutProd(String prodOutPlan);
    
    //查询某指令制造的产品用料组成信息
    List<BslProdMakeUseInfo> getProdMakeUseInfo(QueryCriteria queryCriteria);
    
    //获取可以出库的半成品信息
    List<BslProductInfo> getProdCanOutProds(QueryCriteria queryExample);
    
    //2023新增报表
    //原材料进库报表
    int insertRawInfoReportNew(String dateString);
    //产成品库存报表
    int insertProdInfoReport(String dateString);
    //纵剪机组生产报表
    int insertSemiMakeInfoReport(String dateString);
    //成型机组生产报表
    int insertProdMakeInfoReport(String dateString);
    
    //销售报表
    int insertProdSaleInfoReport(String dateString);
    int insertHalfProdSaleInfoReport(String dateString);
    int insertProdSaleInfoReportBT(QueryCriteria queryCriteria);
    int insertHalfProdSaleInfoReportBT(QueryCriteria queryCriteria);
    
    //根据excel数据修改使用单位
    int updateUseCompanyByExcel(UseCompanyModule record);
    
}