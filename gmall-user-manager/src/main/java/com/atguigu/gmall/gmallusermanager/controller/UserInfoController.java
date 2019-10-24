package com.atguigu.gmall.gmallusermanager.controller;

import com.atguigu.gmall.gmallusermanager.bean.UserInfo;
import com.atguigu.gmall.gmallusermanager.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by 刘江楠 on 2019/10/24
 */
@RestController
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @GetMapping("findAll")
    public List<UserInfo> findAll(){
        return userInfoService.findAll();
    }

    @GetMapping("findAllByProperty")
    public List<UserInfo> findAllByProperty(UserInfo userInfo){
        return userInfoService.findAllByProperty(userInfo);
    }

    @GetMapping("findAllByExample")
    public List<UserInfo> findAllByExample(UserInfo userInfo){
        return userInfoService.findAllByExample(userInfo);
    }

    @GetMapping("selectOne")
    public UserInfo selectOne(UserInfo userInfo){
        return userInfoService.selectOne(userInfo);
    }

    @GetMapping("selectByPrimaryKey")
    public UserInfo selectByPrimaryKey(String id){
        return userInfoService.selectByPrimaryKey(id);
    }

    @PostMapping("addUser")
    public void addUser(UserInfo userInfo){
        userInfoService.addUser(userInfo);
    }

    @GetMapping("delUser")
    public void delUser(UserInfo userInfo){
        userInfoService.delUser(userInfo);
    }

    @PostMapping("updateUser")
    public void updateUser(UserInfo userInfo){
        userInfoService.updateUser(userInfo);
    }



}
