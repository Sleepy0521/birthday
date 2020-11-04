package com.sleepy.birthday.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sleepy.birthday.bean.Coupon;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CouponMapper extends BaseMapper<Coupon> {
}
