package com.eCom.eComGenius.DAO;

import com.eCom.eComGenius.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Long> {

    boolean existsByEmail(String email);
    boolean existsByPhone(String phone);

}
