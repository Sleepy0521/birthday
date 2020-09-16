package com.sleepy.birthday.controller;

import com.sleepy.birthday.bean.Count;
import com.sleepy.birthday.bean.Coupon;
import com.sleepy.birthday.bean.Lipstick;
import com.sleepy.birthday.dao.CountMapper;
import com.sleepy.birthday.dao.CouponMapper;
import com.sleepy.birthday.dao.LipstickMapper;
import com.sleepy.birthday.msg.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

@RestController
public class AnswerController {

    @Autowired
    CouponMapper couponMapper; //操作券

    @Autowired
    CountMapper countMapper; //操作算术题

    @Autowired
    LipstickMapper lipstickMapper; //操作口红

    /*算术题相关接口*/
    //真确定按钮接口
    @PostMapping("/count/answer")
    public Msg countAnswer(@RequestBody Map map){
        String answer = String.valueOf(map.get("answer"));
        if(answer!=null&&answer.equals("19970724")){
            //找到搓澡券将其置成可被领取的
            Map<String,Object> columnMap = new HashMap<>();
            columnMap.put("type","小仙女搓澡券");
            Coupon coupon = couponMapper.selectByMap(columnMap).get(0);
            System.out.println("coupon = " + coupon);
            coupon.setIspass(1);
            couponMapper.updateById(coupon);
            return Msg.success().setMsg("恭喜回答正确");
        }else {
            return Msg.fail().setMsg("回答错误请再接再厉");
        }
    }
    //假确定按钮接口
    @GetMapping("/count/none")
    public Msg countNone(){
        List<Count> counts = countMapper.selectByMap(new HashMap<>());
        Random random = new Random();
        Integer id = random.nextInt(counts.size());
        Count count = counts.get(id);
        return Msg.success().setMsg(count.getMessage());
    }


    /*口红色号相关接口*/
    //获取口红的相关数据
    @GetMapping("/lipstick/getLipstick")
    public Msg getLipstick(){
        List<Lipstick> lipsticks = lipstickMapper.selectByMap(new HashMap<>());
        return Msg.success().add("lipsticks",lipsticks);
    }
    //口红提交答案接口——不对前对的数据进行校验
    @PostMapping("/lipstick/answer")
    public Msg lipstickAnswer(){
        Map<String,Object> columnMap = new HashMap<>();
        columnMap.put("type","小仙女贪吃券");
        Coupon coupon = couponMapper.selectByMap(columnMap).get(0);
        coupon.setIspass(1);
        couponMapper.updateById(coupon);
        return Msg.success().setMsg("恭喜回答正确");
    }

    
}
