package com.eCom.eComGenius.Service;

import com.eCom.eComGenius.DAO.UserDao;
import com.eCom.eComGenius.DTO.UserRequest;
import com.eCom.eComGenius.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;
    public User createNewUser(UserRequest userRequest){

        User user=new User();
        user.setName(userRequest.getName());
        user.setEmail(userRequest.getEmail());
        user.setDateOfBirth(userRequest.getDateOfBirth());
        user.setGender(userRequest.getGender());
        user.setPhone(userRequest.getPhone());
        user.setAddress(userRequest.getAddress());
        user.setPassword(userRequest.getPassword());

        boolean isEmail= userDao.existsByEmail(user.getEmail());
        boolean isPhone=userDao.existsByPhone(user.getPhone());

        if(isEmail && isPhone){
            throw new IllegalArgumentException("Email and Phone no already exists");
        }

        if(isEmail){
            throw new IllegalArgumentException("Email already exists");
        }

        if(isPhone){
            throw new IllegalArgumentException("Phone no already exists");
        }

        return userDao.save(user);
    }
}
