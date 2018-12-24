package cn.lcdiao.sbj.Controller;

import cn.lcdiao.sbj.pojo.User;
import cn.lcdiao.sbj.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {
    @Autowired
    IUserService userService;

    @GetMapping("/get")
    public List<User> getUser(){
        return userService.getUser();
    }
}
