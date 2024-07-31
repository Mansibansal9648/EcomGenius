package com.eCom.eComGenius.Service;

import com.eCom.eComGenius.Dto.UserRequest;
import com.eCom.eComGenius.Entity.User;

public interface UserService {
    public User createNewUser(UserRequest userRequest);
}
