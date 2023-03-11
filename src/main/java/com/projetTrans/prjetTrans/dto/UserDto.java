package com.projetTrans.prjetTrans.dto;

import com.projetTrans.prjetTrans.model.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class UserDto {
    private Integer id;
    private String firstName;
    private String lastName;
    private String password;
    private String email;


    public static UserDto fromEntity(User user){
        return UserDto.builder()
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .password(user.getPassword())
                .email(user.getEmail())
                .build();
    }
    public static User toEntity(UserDto user){
        return User.builder()
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .password(user.getPassword())
                .email(user.getEmail())
                .build();
    }
}
