package cn.lcdiao.sbj.service.serviceImpl;

import cn.lcdiao.sbj.pojo.User;
import cn.lcdiao.sbj.repository.UserJPA;
import cn.lcdiao.sbj.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserJPA userjpa;

    @Override
    public List<User> getUser() {
        return userjpa.findAll();
    }
}
