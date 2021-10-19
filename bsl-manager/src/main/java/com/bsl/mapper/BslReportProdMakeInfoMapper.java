package com.bsl.mapper;

import com.bsl.pojo.BslReportProdMakeInfo;
import com.bsl.pojo.BslReportProdMakeInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BslReportProdMakeInfoMapper {
    int countByExample(BslReportProdMakeInfoExample example);

    int deleteByExample(BslReportProdMakeInfoExample example);

    int insert(BslReportProdMakeInfo record);

    int insertSelective(BslReportProdMakeInfo record);

    List<BslReportProdMakeInfo> selectByExample(BslReportProdMakeInfoExample example);

    int updateByExampleSelective(@Param("record") BslReportProdMakeInfo record, @Param("example") BslReportProdMakeInfoExample example);

    int updateByExample(@Param("record") BslReportProdMakeInfo record, @Param("example") BslReportProdMakeInfoExample example);
}