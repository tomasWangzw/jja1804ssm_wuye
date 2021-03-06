package com.ssm.wuye.service;



import com.ssm.wuye.domain.ChWaterMeter;
import com.ssm.wuye.domain.ChWaterMeterExample;
import com.ssm.wuye.vo.WaterAndOwer;


import java.util.List;

/**
 * time：2019/4/27--16:17
 * Author:蓝鑫杰
 * desc:
 * version:1.3.22
 */
public interface ChWaterService {
    List<ChWaterMeter> selectByExample(ChWaterMeterExample example);

    /**
     * 查询水费加用户信息
     * @return
     */
    List<WaterAndOwer> selectAll();

    ChWaterMeter selectByPrimaryKey(Integer waterid);

    int insertSelective(ChWaterMeter record);

    int updateByExampleSelective(ChWaterMeter record,ChWaterMeterExample example);

    int deleteByPrimaryKey(Integer waterid);

}
