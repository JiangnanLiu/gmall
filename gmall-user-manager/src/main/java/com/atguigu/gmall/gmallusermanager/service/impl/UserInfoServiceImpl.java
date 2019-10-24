package com.atguigu.gmall.gmallusermanager.service.impl;

import com.atguigu.gmall.gmallusermanager.bean.UserInfo;
import com.atguigu.gmall.gmallusermanager.mapper.UserInfoMapper;
import com.atguigu.gmall.gmallusermanager.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * Created by 刘江楠 on 2019/10/24
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> findAll() {
        return userInfoMapper.selectAll();
    }

    @Override
    public List<UserInfo> findAllByProperty(UserInfo userInfo) {
        return userInfoMapper.select(userInfo);
    }

    @Override
    public List<UserInfo> findAllByExample(UserInfo userInfo) {
        Example example = new Example(UserInfo.class);
            example.createCriteria().andLike("loginName", "%"+userInfo.getLoginName()+"%");
        return userInfoMapper.selectByExample(example);
    }

    @Override
    public UserInfo selectOne(UserInfo userInfo) {
        return userInfoMapper.selectOne(userInfo);
    }

    @Override
    public UserInfo selectByPrimaryKey(String id) {
        return userInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public void addUser(UserInfo userInfo) {
        userInfoMapper.insertSelective(userInfo);
    }

    @Override
    public void delUser(UserInfo userInfo) {
        userInfoMapper.delete(userInfo);
    }

    @Override
    public void updateUser(UserInfo userInfo) {
        userInfoMapper.updateByPrimaryKeySelective(userInfo);
    }
}
