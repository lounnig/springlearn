package cn.tokiz.service;

import cn.tokiz.domain.User;
import cn.tokiz.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User selectUser(Integer id){
        return userMapper.selectById(id);
    }

    public boolean insertUser(User user){
        Long res = userMapper.insertUser(user);
        return res>0;
    }

    public boolean deleteUser(Integer id){
        return userMapper.deleteUserById(id)>0;
    }

    public boolean updateUser(User user){
        return userMapper.updateByPrimaryKeySelective(user)>0;
    }

    public List<User> allUser(){
        return userMapper.selectAllUser();
    }
}
