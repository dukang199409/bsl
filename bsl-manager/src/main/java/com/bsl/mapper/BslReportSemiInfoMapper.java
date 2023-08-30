package com.bsl.mapper;

import com.bsl.pojo.BslReportSemiInfo;
import com.bsl.pojo.BslReportSemiInfoExample;
import com.bsl.reportbean.BslSemiReportHJInfo;
import com.bsl.select.QueryCriteria;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BslReportSemiInfoMapper {
    long countByExample(BslReportSemiInfoExample example);

    int deleteByExample(BslReportSemiInfoExample example);

    int insert(BslReportSemiInfo row);

    int insertSelective(BslReportSemiInfo row);

    List<BslReportSemiInfo> selectByExample(BslReportSemiInfoExample example);

    int updateByExampleSelective(@Param("row") BslReportSemiInfo row, @Param("example") BslReportSemiInfoExample example);

    int updateByExample(@Param("row") BslReportSemiInfo row, @Param("example") BslReportSemiInfoExample example);

    //纵剪机组生产报表统计
    List<BslReportSemiInfo> selectSemiReportInfoTJ(QueryCriteria queryCriteria);
    
    //纵剪机组生产报表合计
    List<BslSemiReportHJInfo> selectSemiReportInfoHJ(QueryCriteria queryCriteria);
    
    int countNormSemiReportInfoHJ(QueryCriteria queryCriteria);
}