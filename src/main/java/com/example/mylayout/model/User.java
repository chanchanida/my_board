package com.example.mylayout.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name="tb_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    private String username;
//    private String password;
//    private Boolean enabledYn;

    private String usr_name;
    private String password;
    private Boolean enabled_yn;

    // 양방향 맵핑
    @ManyToMany
    @JoinTable(
            name = "tb_user_role_rl",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))

    private List<Role> roles = new ArrayList<>();

}
