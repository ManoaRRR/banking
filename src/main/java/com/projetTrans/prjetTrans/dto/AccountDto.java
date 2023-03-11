package com.projetTrans.prjetTrans.dto;

import com.projetTrans.prjetTrans.model.Account;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@AllArgsConstructor
@SuperBuilder
@Getter
@Setter
public class AccountDto {
    @NotNull
    @NotBlank
    private Integer id;
    @NotNull
    @NotBlank
    private String iban;
    @NotNull
    @NotBlank
    private UserDto user;

    public static AccountDto fromEntity(Account account){
        return AccountDto.builder()
                .id(account.getId())
                .iban(account.getIban())
                .user(UserDto.fromEntity(account.getUser()))
                .build();
    }

    public static Account toEntity(AccountDto account){
        return Account.builder()
                .iban(account.getIban())
                .user(UserDto.toEntity(account.getUser()))
                .build();
    }

}
