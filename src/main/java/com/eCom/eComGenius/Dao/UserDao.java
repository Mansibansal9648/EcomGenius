package com.eCom.eComGenius.Dao;

import com.eCom.eComGenius.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Long> {
}
