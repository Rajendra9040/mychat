package com.example.mychat.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User extends BaseModel {
    private String name;
    private String email;
    private String phone;
    private String hashedPassword;
    private String imageUrl;
    private Boolean isActive;
    private Boolean isVerified;

}
