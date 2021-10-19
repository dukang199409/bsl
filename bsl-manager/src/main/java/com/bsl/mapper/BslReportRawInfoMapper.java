package com.bsl.mapper;

import com.bsl.pojo.BslReportRawInfo;
import com.bsl.pojo.BslReportRawInfoExample;
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
}