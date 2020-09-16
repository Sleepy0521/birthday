package com.sleepy.birthday.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;

@NoArgsConstructor //无参构造器
@AllArgsConstructor //全参构造器
@Data //get set 方法
@Accessors(chain=true) //链式调用
@ToString
public class Coupon extends Model<Coupon> {
    @TableId(value="uuid")
    String uuid;
    String type;
    Integer state;//是否被领取
    String brief;
    Integer ispass; //对应游戏是否通关(是否可被领取)

  /*  @Override
    protected Serializable pkVal() {
        return uuid;
    }*/
}
