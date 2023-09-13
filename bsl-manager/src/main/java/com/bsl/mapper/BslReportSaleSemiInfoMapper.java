package com.bsl.mapper;

import com.bsl.pojo.BslReportSaleSemiInfo;
import com.bsl.pojo.BslReportSaleSemiInfoExample;
import com.bsl.reportbean.BslSemiSaleReportHJInfo;
import com.bsl.select.QueryCriteria;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BslReportSaleSemiInfoMapper {
    long countByExample(BslReportSaleSemiInfoExample example);

    int deleteByExample(BslReportSaleSemiInfoExample example);

    int insert(BslReportSaleSemiInfo row);

    int insertSelective(BslReportSaleSemiInfo row);

    List<BslReportSaleSemiInfo> selectByExample(BslReportSaleSemiInfoExample example);

    int updateByExampleSelective(@Param("row") BslReportSaleSemiInfo row, @Param("example") BslReportSaleSemiInfoExample example);

    int updateByExample(@Param("row") BslReportSaleSemiInfo row, @Param("example") BslReportSaleSemiInfoExample example);

    //半成品销售出库报表统计
    List<BslReportSaleSemiInfo> selectSemiSaleReportInfoTJ(QueryCriteria queryCriteria);
    
    //半成品销售出库报表合计
    List<BslSemiSaleReportHJInfo> selectSemiSaleReportInfoHJ(QueryCriteria queryCriteria);
    
    int countNormSemiSaleReportInfoHJ(QueryCriteria queryCriteria);
    
}