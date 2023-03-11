package com.projetTrans.prjetTrans.dto;

import com.projetTrans.prjetTrans.model.Account;
import lombok.*;
import lombok.experimental.SuperBuilder;
@AllArgsConstructor
@SuperBuilder
@Getter
@Setter
public class AccountDto {
    private Integer id;
    private String iban;
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
