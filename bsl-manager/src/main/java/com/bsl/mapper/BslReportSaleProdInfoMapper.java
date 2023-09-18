package com.bsl.mapper;

import com.bsl.pojo.BslReportSaleProdInfo;
import com.bsl.pojo.BslReportSaleProdInfoExample;
import com.bsl.reportbean.BslProdSaleReportHJInfo;
import com.bsl.select.QueryCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BslReportSaleProdInfoMapper {
    long countByExample(BslReportSaleProdInfoExample example);

    int deleteByExample(BslReportSaleProdInfoExample example);

    int insert(BslReportSaleProdInfo row);

    int insertSelective(BslReportSaleProdInfo row);

    List<BslReportSaleProdInfo> selectByExample(BslReportSaleProdInfoExample example);

    int updateByExampleSelective(@Param("row") BslReportSaleProdInfo row, @Param("example") BslReportSaleProdInfoExample example);

    int updateByExample(@Param("row") BslReportSaleProdInfo row, @Param("example") BslReportSaleProdInfoExample example);

    //产成品销售出库报表统计
    List<BslReportSaleProdInfo> selectProdSaleReportInfoTJ(QueryCriteria queryCriteria);
    
    //产成品销售出库报表合计
    List<BslProdSaleReportHJInfo> selectProdSaleReportInfoHJ(QueryCriteria queryCriteria);
    
    int countNormProdSaleReportInfoHJ(QueryCriteria queryCriteria);
    
}