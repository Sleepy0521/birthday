package com.sleepy.birthday.controller;

import com.sleepy.birthday.bean.Count;
import com.sleepy.birthday.bean.Coupon;
import com.sleepy.birthday.dao.CountMapper;
import com.sleepy.birthday.dao.CouponMapper;
import com.sleepy.birthday.msg.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.UUID;

public class InitController {
    @Autowired
    CouponMapper couponMapper;
    @Autowired
    CountMapper countMapper;


    @GetMapping("/init")
    public Msg init(){
        //初始化券表
        initCoupon();
        //初始化算数题表
        initCount();
        return Msg.success();
    }
    public void initCount() {
//        Count count=new Count(0,"未通关");
//        countMapper.updateById(count);
    }
    @GetMapping("/initCoupon")
    public void initCoupon(){
        //删除所有券
        couponMapper.deleteByMap(new HashMap<>());
        //插入洗碗券
        String uuid = UUID.randomUUID().toString().substring(0,20).toUpperCase();
        Coupon coupon=new Coupon(uuid,"可爱老公刷碗券",0,"该券可在休息日令老公洗碗一次",1);
        couponMapper.insert(coupon);
        //插入餐饮券
        uuid = UUID.randomUUID().toString().substring(0,20).toUpperCase();
        coupon=new Coupon(uuid,"小仙女贪吃券",0,"该券可在一起吃饭时未满200元的情况下令老公全额支付",0);
        couponMapper.insert(coupon);
        //插入整理券
        uuid = UUID.randomUUID().toString().substring(0,20).toUpperCase();
        coupon=new Coupon(uuid,"小仙女整洁券",0,"家里脏乱差，全不怕！该券可令老公在休息日，进行全家性质整理",0);
        couponMapper.insert(coupon);
        //插入搓澡券
        uuid = UUID.randomUUID().toString().substring(0,20).toUpperCase();
        coupon=new Coupon(uuid,"小仙女搓澡券",0,"进行全身服务搓澡一次",0);
        couponMapper.insert(coupon);
    }
}
