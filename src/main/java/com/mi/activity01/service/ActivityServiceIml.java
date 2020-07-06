package com.mi.activity01.service;

import com.mi.activity01.dao.ActivityDao;
import com.mi.activity01.pojo.Activity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ActivityServiceIml implements ActivityService {
    @Resource
    private ActivityDao ad;

    @Override
    public List<com.mi.activity01.pojo.Activity> selectAll() {
        List<com.mi.activity01.pojo.Activity> list = ad.selectAll();
        return list;
    }

    @Override
    public int deleteById(long id) {
        int rows = ad.deleteById(id);
        return rows;
    }

    @Override
    public int insert(Activity activity) {
        int rows = ad.insert(activity);
        return rows;
    }

    @Override
    public Activity selectById(Long id) {
        return ad.selectById(id);
    }

    @Override
    public int updateById(Activity activity) {
        return ad.updateById(activity);
    }


}
