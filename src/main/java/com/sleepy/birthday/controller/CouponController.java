package com.sleepy.birthday.controller;

import com.baomidou.mybatisplus.core.conditions.AbstractWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.sleepy.birthday.bean.Coupon;
import com.sleepy.birthday.dao.CouponMapper;
import com.sleepy.birthday.msg.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@RestController
public class CouponController {
    @Autowired
    CouponMapper couponMapper;


  /*  //获取所有券的信息
    @GetMapping("/get2")
    public Msg get2(){
        IPage<Coupon> page = couponMapper.selectPage(new Page<>(), null);
        page.getRecords()


        System.out.println("===============获取分页相关的一些信息======================");
        System.out.println("总条数:" +page.getTotal());
        System.out.println("当前页码: "+  page.getCurrent());
        System.out.println("总页码:" + page.getPages());
        System.out.println("每页显示的条数:" + page.getSize());

        return Msg.success().add("coupons",coupons);
    }*/

    //获取所有券的信息
    @GetMapping("/get")
    public Msg get(){
        List<Coupon> coupons = couponMapper.selectByMap(new HashMap<>());
        return Msg.success().add("coupons",coupons);
    }



    //领取券接口
    @GetMapping("/getCoupon")
    public Msg getCoupon(String type){
        //String type = String.valueOf(map.get("type"));
        Map<String,Object> columnMap = new HashMap<>();
        columnMap.put("type",type);
        Coupon coupon = couponMapper.selectByMap(columnMap).get(0);
        if(coupon.getIspass()==1){
            if(coupon.getState()==0){
                coupon.setState(1);
                couponMapper.updateById(coupon);
                return Msg.success().setMsg("领取成功").add("coupon",coupon);
            }else{
                return Msg.fail().setMsg("该券已被您领取小仙女可不要贪心哦，贪心胖三斤！！！").add("coupon",coupon);
            }
        }else {
            return Msg.fail().setMsg("不玩完游戏就想领券，想得美~！");
        }
    }

}
