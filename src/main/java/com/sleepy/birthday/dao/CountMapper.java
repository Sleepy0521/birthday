package com.sleepy.birthday.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sleepy.birthday.bean.Count;
import com.sleepy.birthday.bean.Coupon;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CountMapper extends BaseMapper<Count> {
}