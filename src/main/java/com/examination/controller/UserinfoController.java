package com.examination.controller;

import com.examination.model.Message;
import com.examination.model.Userinfo;
import com.examination.service.UserinfoService;
import com.examination.utils.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("userinfo")
public class UserinfoController {
    @Autowired
    private UserinfoService userinfoService;

    @RequestMapping("login")
    public Message login(String username, String password){
        List<Userinfo> userinfo = userinfoService.getUserinfoByUsernameAndPassword(username, password);
        Message message = new Message();
        if(userinfo.size()>0){
            message.setList(userinfo);
            message.setMsg("登陆成功");
            message.setStatus(true);
        }else{
            message.setMsg("账号或密码错误!");
            message.setStatus(false);
        }
        return  message;
    }

    @RequestMapping("wxlogin")
    public Message wxlogin(String img, String nickname,String gender,String openid,String session_key){
        //微信登陆时，先根据openid查看用户是否存在
        //如果存在，获取用户信息并返回；
        //如果不存在，在数据库中插入用户，并返回用户信息
        List<Userinfo> userinfo = userinfoService.getUserinfoByOpenid(openid);
        Message message = new Message();
        if(userinfo.size()>0){
            message.setList(userinfo);
            message.setMsg("登陆成功");
            message.setStatus(true);
        }else{
            Userinfo record = new Userinfo();
            record.setId(UUIDUtil.getUUID());
            record.setImg(img);
            record.setNickname(nickname);
            record.setGender(gender);
            record.setOpenid(openid);
            record.setSessionKey(session_key);
            userinfoService.insertSelective(record);
            List list = new ArrayList();
            list.add(record);
            message.setList(list);
            message.setMsg("微信登陆账户创建成功!");
            message.setStatus(true);
        }
        return  message;
    }

    @RequestMapping("register")
    public Message register(String username,String password){
        List<Userinfo> userinfo = userinfoService.getUserinfoByUsernameAndPassword(username, null);
        Message message = new Message();
        if(userinfo.size()>0){
            message.setMsg("要注册的账号已经存在!");
            message.setStatus(false);
        }else{
            Userinfo record = new Userinfo();
            record.setUsername(username);
            record.setPassword(password);
            record.setId(UUIDUtil.getUUID());
            userinfoService.insertSelective(record);
            List list = new ArrayList();
            list.add(record);
            message.setList(list);
            message.setMsg("注册成功");
            message.setStatus(true);
        }
        return message;
    }

    @RequestMapping("insertSelective")
    public Userinfo insertSelective(String username,String password) {
        Userinfo record = new Userinfo();
        record.setUsername(username);
        record.setPassword(password);
        record.setId(UUIDUtil.getUUID());
        userinfoService.insertSelective(record);
        return record;
    }

    @RequestMapping("updateByPrimaryKeySelective")
    public Message updateByPrimaryKeySelective(String nickname,String address,String age,String grade,String telephone,
                                            String gender,String province,String city,String area,String id,String img) {
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
        record.setImg(img);
        record.setId(id);
        userinfoService.updateByPrimaryKeySelective(record);
        List list = new ArrayList();
        list.add(record);
        Message message = new Message();
        message.setList(list);
        return message;
    }

    @RequestMapping("selectByPrimaryKey")
    public Userinfo selectByPrimaryKey(String id) {
        return userinfoService.selectByPrimaryKey(id);
    }
}
