package com.sleepy.birthday.config;



import com.sleepy.birthday.injector.ISqlInjectorImp;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//Spring boot方式
@EnableTransactionManagement
@Configuration
@MapperScan("com.baomidou.cloud.service.*.mapper*")
public class MybatisPlusConfig {

    /**
     * SQL执行效率插件
     */
   /* @Bean
    @Profile({"dev","test"})// 设置 dev test 环境开启
    public PerformanceInterceptor performanceInterceptor() {
        //设置最大的毫秒值
        return new PerformanceInterceptor().setMaxTime(100);
    }*/
    @Bean
    public ISqlInjectorImp iSqlInjectorImp(){
        return new ISqlInjectorImp();
    }
}