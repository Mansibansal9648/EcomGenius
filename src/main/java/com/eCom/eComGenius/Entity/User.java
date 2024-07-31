package com.eCom.eComGenius.Entity;

import com.eCom.eComGenius.Dto.UserRequest;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String email;
    private String date_of_birth;
    private String gender;
    private String phone;
    private String address;
    private String password;

    public User(UserRequest userRequest) {
        this.name=userRequest.getName();
        this.email=userRequest.getEmail();
        this.date_of_birth=userRequest.getDate_of_birth();
        this.gender=userRequest.getGender();
        this.phone=userRequest.getPhone();
        this.address=userRequest.getAddress();
        this.password=userRequest.getPassword();
    }
}
