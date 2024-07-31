package com.eCom.eComGenius.Dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {

    @NotEmpty(message = "Name is required field")
    @Pattern(regexp = "^[a-zA-Z\\s]{3,25}$",message = "Invalid name format")
    private String name;

    @NotEmpty(message = "Email is required field")
    @Email(message = "Invalid email address")
    private String email;

    @NotEmpty(message = "Date of birth is required field")
    @Pattern(regexp = "^\\d{4}-\\d{2}-\\d{2}$",message = "Date of birth must be in the format yyyy-mm-dd")
    private String date_of_birth;

    @NotEmpty(message = "Gender is required field")
    private String gender;

    @NotEmpty(message = "Phone No. is required field")
    @Pattern(regexp="^[6789]\\d{9}$",message = "Invalid phone number")
    private String phone;

    @NotEmpty(message = "Address is required field")
    private String address;

    @NotEmpty(message = "Password is required field")
    private String password;
}
