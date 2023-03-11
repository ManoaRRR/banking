package com.projetTrans.prjetTrans.dto;

import com.projetTrans.prjetTrans.model.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Access;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class RoleDto {
    @NotNull
    @NotBlank
    private String name;

    public static RoleDto fromEntity(Role role){
        return RoleDto.builder()
                .name(role.getName())
                .build();
    }
    public static Role toEntity (RoleDto role){
        return Role.builder()
                .name(role.getName())
                .build();
    }
}
