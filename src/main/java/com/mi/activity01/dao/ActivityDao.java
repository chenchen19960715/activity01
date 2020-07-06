package com.mi.activity01.dao;

import com.mi.activity01.pojo.Activity;
import jdk.nashorn.internal.objects.annotations.Setter;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ActivityDao {
    //1.查询所有信息
    @Select("SELECT * FROM tb_activity ")
    List<Activity> selectAll();

    //2.根据id查询记录
    @Select("SELECT * FROM tb_activity WHERE id=#{id}")
    Activity selectById(long id);

    //3.根据Id删除活动记录
    @Delete("DELETE FROM tb_activity WHERE id=#{id}")
    int deleteById(long id);

    //4.插入新的活动记录
    int insert(Activity activity);

    //5.根据id修改信息
    int updateById(Activity activity);

}
