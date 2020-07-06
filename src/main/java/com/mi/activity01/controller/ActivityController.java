package com.mi.activity01.controller;

import com.mi.activity01.pojo.Activity;
import com.mi.activity01.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/index/")
public class ActivityController {
    @Autowired
    private ActivityService as;

    //跳转修改页面
    @RequestMapping("doUpdateUI")
    public String doUpdateUI(Long id, Model model) {
        Activity aty = as.selectById(id);
        model.addAttribute("aty", aty);
        return "updateActivity";
    }

    //修该记录
    @RequestMapping(value = "doUpdateById",method = RequestMethod.POST)
    public String doUpDateById(Activity activity){
        System.out.println(activity);
            as.updateById(activity);
        return "redirect:doActivityUI";
    }
    //跳转添加活动的页面
    @RequestMapping("addActivity.html")
    public String doActivity() {
        return "addActivity";
    }

    @RequestMapping("doActivityUI")
    public String doActivityUI(Model model) {
        List<Activity> acList = as.selectAll();
        model.addAttribute("acList", acList);
        return "index";
    }

    @RequestMapping("doDeleteById")
    public String doDeleteById(Long id) {
        as.deleteById(id);
        return "redirect:doActivityUI";
    }

    @RequestMapping(value = "doAddActivity", method = RequestMethod.POST)
    public String doActivityAddUI(Activity activity) {
        System.out.println(activity);
        System.out.println(activity.getClass().getName() + "测试");
        if (activity.getCategory() != null && activity.getTitle() != null && activity.getStartTime() != null) {
            int rows = as.insert(activity);
            if (rows == 1) {
                System.out.println("新建一条活动");
            } else {
                System.out.println("新建活动失败");
            }
        } else {
            System.out.println("输入信息为空");
        }
        return "redirect:doActivityUI";
    }
}
