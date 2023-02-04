package com.bsl.mapper;

import com.bsl.pojo.BslReportProdInfo;
import com.bsl.pojo.BslReportProdInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BslReportProdInfoMapper {
    int countByExample(BslReportProdInfoExample example);

    int deleteByExample(BslReportProdInfoExample example);

    int insert(BslReportProdInfo record);

    int insertSelective(BslReportProdInfo record);

    List<BslReportProdInfo> selectByExample(BslReportProdInfoExample example);

    int updateByExampleSelective(@Param("record") BslReportProdInfo record, @Param("example") BslReportProdInfoExample example);

    int updateByExample(@Param("record") BslReportProdInfo record, @Param("example") BslReportProdInfoExample example);
}