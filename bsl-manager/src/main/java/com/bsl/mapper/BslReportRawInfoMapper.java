package com.bsl.mapper;

import com.bsl.pojo.BslReportRawInfo;
import com.bsl.pojo.BslReportRawInfoExample;
import com.bsl.reportbean.BslRawReportHJInfo;
import com.bsl.select.QueryCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BslReportRawInfoMapper {
    int countByExample(BslReportRawInfoExample example);

    int deleteByExample(BslReportRawInfoExample example);

    int insert(BslReportRawInfo record);

    int insertSelective(BslReportRawInfo record);

    List<BslReportRawInfo> selectByExample(BslReportRawInfoExample example);

    int updateByExampleSelective(@Param("record") BslReportRawInfo record, @Param("example") BslReportRawInfoExample example);

    int updateByExample(@Param("record") BslReportRawInfo record, @Param("example") BslReportRawInfoExample example);

    //原料进项报表统计
    List<BslReportRawInfo> selectRawReportInfoTH(QueryCriteria queryCriteria);
    //原料进项报表合计
    List<BslRawReportHJInfo> selectRawReportInfoHJ(QueryCriteria queryCriteria);
    
    int countNormRawReportInfoHJ(QueryCriteria queryCriteria);
    
}