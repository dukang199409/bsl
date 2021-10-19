package com.bsl.mapper;

import com.bsl.pojo.BslReportSaleInfo;
import com.bsl.pojo.BslReportSaleInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BslReportSaleInfoMapper {
    int countByExample(BslReportSaleInfoExample example);

    int deleteByExample(BslReportSaleInfoExample example);

    int insert(BslReportSaleInfo record);

    int insertSelective(BslReportSaleInfo record);

    List<BslReportSaleInfo> selectByExample(BslReportSaleInfoExample example);

    int updateByExampleSelective(@Param("record") BslReportSaleInfo record, @Param("example") BslReportSaleInfoExample example);

    int updateByExample(@Param("record") BslReportSaleInfo record, @Param("example") BslReportSaleInfoExample example);
}