package com.eCom.eComGenius.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {

    private String name;
    private String email;
    private String date_of_birth;
    private String gender;
    private String phone;
    private String address;
    private String password;
}
