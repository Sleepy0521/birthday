package com.sleepy.birthday.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sleepy.birthday.bean.Coupon;
import com.sleepy.birthday.bean.Lipstick;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LipstickMapper extends BaseMapper<Lipstick> {
}
