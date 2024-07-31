package com.eCom.eComGenius.Service;

import com.eCom.eComGenius.Dao.UserDao;
import com.eCom.eComGenius.Dto.UserRequest;
import com.eCom.eComGenius.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;
    public User createNewUser(UserRequest userRequest){
        User user=new User(userRequest);
        return userDao.save(user);
    }
}
