package com.yy.springbootmybatismapper;

import com.github.pagehelper.PageHelper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import tk.mybatis.spring.annotation.MapperScan;

import java.util.Properties;

@SpringBootApplication
@MapperScan(basePackages = "com.yy.springbootmybatismapper.com.dao")
public class SpringbootMybatisMapperApplication {
    //配置mybatis的分页插件pageHelper
//    @Bean
  /*  public PageHelper pageHelper(){
        PageHelper pageHelper = new PageHelper();
        Properties properties = new Properties();
        properties.setProperty("offsetAsPageNum","true");
        properties.setProperty("rowBoundsWithCount","true");
        properties.setProperty("reasonable","true");
        properties.setProperty("dialect","mysql");    //配置mysql数据库的方言
        pageHelper.setProperties(properties);
        return pageHelper;
    }*/
    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatisMapperApplication.class, args);
    }
}
