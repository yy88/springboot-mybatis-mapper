package com.yy.springbootmybatismapper.com.controller;

import com.github.pagehelper.PageHelper;
import com.yy.springbootmybatismapper.com.dao.CountryDao;
import com.yy.springbootmybatismapper.com.dao.UserInfoDao;
import com.yy.springbootmybatismapper.com.entity.Country;
import com.yy.springbootmybatismapper.com.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {
    @Autowired
    private CountryDao countryDao;

    @Autowired
    private UserInfoDao userInfoDao;


    @RequestMapping("/hi")
    public Country hi(){
        Country country = countryDao.selectByPrimaryKey(1);
        System.out.println("country:"+country);
        return country;
    }

    @RequestMapping("/user/list")
    public List<UserInfo> list(){
        return userInfoDao.selectAll();
    }

    /**
     * 使用分页插件com.github.pagehelper.PageHelper进行，分页查询
     * @return
     */
    @RequestMapping("/user/page")
    public List<UserInfo> pageList(){
        //设置分页信息，分别是当前页数和每页显示的总记录数【记住：必须在mapper接口中的方法执行之前设置该分页信息】
        PageHelper.startPage(1, 2);
        return userInfoDao.selectAll();
    }

}
