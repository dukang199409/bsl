package com.bsl.mapper;

import com.bsl.pojo.BslReportProdMakeInfo;
import com.bsl.pojo.BslReportProdMakeInfoExample;
import com.bsl.reportbean.BslProdMakeReportHJInfo;
import com.bsl.select.QueryCriteria;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BslReportProdMakeInfoMapper {
    long countByExample(BslReportProdMakeInfoExample example);

    int deleteByExample(BslReportProdMakeInfoExample example);

    int insert(BslReportProdMakeInfo row);

    int insertSelective(BslReportProdMakeInfo row);

    List<BslReportProdMakeInfo> selectByExample(BslReportProdMakeInfoExample example);

    int updateByExampleSelective(@Param("row") BslReportProdMakeInfo row, @Param("example") BslReportProdMakeInfoExample example);

    int updateByExample(@Param("row") BslReportProdMakeInfo row, @Param("example") BslReportProdMakeInfoExample example);

    //成型机组生产报表统计
    List<BslReportProdMakeInfo> selectProdMakeReportInfoTJ(QueryCriteria queryCriteria);
    
    //成型机组生产报表合计
    List<BslProdMakeReportHJInfo> selectProdMakeReportInfoHJ(QueryCriteria queryCriteria);
    
    int countNormProdMakeReportInfoHJ(QueryCriteria queryCriteria);

}