package com.bsl.mapper;

import com.bsl.pojo.BslReportSemiInfo;
import com.bsl.pojo.BslReportSemiInfoExample;
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
}