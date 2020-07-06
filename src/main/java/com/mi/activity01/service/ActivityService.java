package com.mi.activity01.service;

import com.mi.activity01.pojo.Activity;


import java.util.List;

public interface ActivityService {
    //查询所有信息
    List<Activity> selectAll();
    //根据id查询
    int deleteById(long id);
//    插入新纪录
    int insert(Activity activity);
//    根据id查询信息
    Activity selectById(Long id);
    //5.根据id修改信息
    int updateById(Activity activity);
}
