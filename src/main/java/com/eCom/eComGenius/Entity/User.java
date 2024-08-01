package com.eCom.eComGenius.Entity;

import com.eCom.eComGenius.DTO.UserRequest;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String email;
    private String dateOfBirth;
    private String gender;
    private String phone;
    private String address;
    private String password;

}
