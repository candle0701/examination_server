//package com.examination.controller;
//
//import com.jh.entity.Menu;
//import com.jh.service.MenuService;
//import org.apache.commons.lang.StringUtils;
//import org.apache.shiro.SecurityUtils;
//import org.apache.shiro.authc.IncorrectCredentialsException;
//import org.apache.shiro.authc.UnknownAccountException;
//import org.apache.shiro.authc.UsernamePasswordToken;
//import org.apache.shiro.subject.Subject;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Controller
//public class LoginController {
//
//    @Autowired
//    private MenuService menuService;
//
//    @RequestMapping("/index")
//    public String index(Model model){
//        List<Menu> result = this.contextLoads();
//        model.addAttribute("menuList", result);
//        return "index";
//    }
//
//    @RequestMapping("/toLogin")
//    public String toLogin() {
//        return "login";
//    }
//
//    // 这里如果不写method参数的话，默认支持所有请求，如果想缩小请求范围，还是要添加method来支持get, post等等某个请求。
//    @RequestMapping("/login")
//    public String login(String username, String password, Model model) throws Exception {
//        //1 获取subject
//        Subject subject = SecurityUtils.getSubject();
//        //2 封装用户数据
//        if (StringUtils.isNotEmpty(username) && StringUtils.isNotEmpty(password)) {
//            UsernamePasswordToken token = new UsernamePasswordToken(username, password);
//            //3 执行登陆方法
//            try {
//                //执行subject.login后进入MyShiroRealm认证逻辑
//                subject.login(token);
//                //登陆成功
//                return "redirect:index";
//            } catch (UnknownAccountException e) {
//                //登陆失败:用户名不存在
//                model.addAttribute("msg", "用户名不存在");
//                return "login";
//            } catch (IncorrectCredentialsException e) {
//                //登陆失败：用户名错误
//                model.addAttribute("msg","密码错误");
//                return "login";
//            }
//        }else{
//            return "login";
//        }
//    }
//
//    @RequestMapping("/welcome")
//    public String welcome(){
//        return "welcome";
//    }
//
//    @RequestMapping("/403")
//    public String unauthorizedRole(){
//        System.out.println("------没有权限-------");
//        return "403";
//    }
//
//    public List<Menu> contextLoads() {
//        // 原始的数据
//        List<Menu> rootMenu = menuService.findAllMenuByRoleId(1);
//        // 查看结果
//        for (Menu menu : rootMenu) {
//            System.out.println(menu);
//        }
//        // 最后的结果
//        List<Menu> menuList = new ArrayList<Menu>();
//        // 先找到所有的一级菜单
//        for (int i = 0; i < rootMenu.size(); i++) {
//            // 一级菜单没有parentId
//            if (StringUtils.isBlank(rootMenu.get(i).getExtendsMenuId())) {
//                menuList.add(rootMenu.get(i));
//            }
//        }
//        // 为一级菜单设置子菜单，getChild是递归调用的
//        for (Menu menu : menuList) {
//            menu.setChildMenus(getChild(menu.getId().toString(), rootMenu));
//        }
//        return menuList;
//    }
//
//    private List<Menu> getChild(String id, List<Menu> rootMenu) {
//        // 子菜单
//        List<Menu> childList = new ArrayList<>();
//        for (Menu menu : rootMenu) {
//            // 遍历所有节点，将父菜单id与传过来的id比较
//            if (StringUtils.isNotBlank(menu.getExtendsMenuId())) {
//                if (menu.getExtendsMenuId().equals(id)) {
//                    childList.add(menu);
//                }
//            }
//        }
//        // 把子菜单的子菜单再循环一遍
//        for (Menu menu : childList) {// 没有url子菜单还有子菜单
//            if (StringUtils.isBlank(menu.getUrl())) {
//                // 递归
//                menu.setChildMenus(getChild(menu.getId().toString(), rootMenu));
//            }
//        } // 递归退出条件
//        if (childList.size() == 0) {
//            return null;
//        }
//        return childList;
//    }
//}