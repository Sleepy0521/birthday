package com.sleepy.birthday.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

@NoArgsConstructor //无参构造器
@AllArgsConstructor //全参构造器
@Data //get set 方法
@Accessors(chain=true) //链式调用
@ToString
public class Count {
    Integer id;
    String message;
}
