package com.examination.controller;

import com.examination.model.Userinfo;
import com.examination.service.UserinfoService;
import com.examination.utils.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("userinfo")
public class UserinfoController {
    @Autowired
    private UserinfoService userinfoService;

    @RequestMapping("insertSelective")
    public Userinfo insertSelective(String nickname,String address,String age,String grade,String telephone,
                               String gender,String province,String city,String area,String gradeIndex,String ageIndex) {
        Userinfo record = new Userinfo();
        record.setNickname(nickname);
        record.setAddress(address);
        record.setAge(age);
        record.setGrade(grade);
        record.setTelephone(telephone);
        record.setGender(gender);
        record.setProvince(province);
        record.setCity(city);
        record.setArea(area);
        record.setGradeIndex(gradeIndex);
        record.setAgeIndex(ageIndex);
        record.setId(UUIDUtil.getUUID());
        userinfoService.insertSelective(record);
        return record;
    }

    @RequestMapping("updateByPrimaryKeySelective")
    public Userinfo updateByPrimaryKeySelective(String nickname,String address,String age,String grade,String telephone,
                                            String gender,String province,String city,String area,String id,
                                            String gradeIndex,String ageIndex) {
        Userinfo record = new Userinfo();
        record.setNickname(nickname);
        record.setAddress(address);
        record.setAge(age);
        record.setGrade(grade);
        record.setTelephone(telephone);
        record.setGender(gender);
        record.setProvince(province);
        record.setCity(city);
        record.setArea(area);
        record.setGradeIndex(gradeIndex);
        record.setAgeIndex(ageIndex);
        record.setId(id);
        userinfoService.updateByPrimaryKeySelective(record);
        return record;
    }

    @RequestMapping("selectByPrimaryKey")
    public Userinfo selectByPrimaryKey(String id) {
        return userinfoService.selectByPrimaryKey(id);
    }
}
