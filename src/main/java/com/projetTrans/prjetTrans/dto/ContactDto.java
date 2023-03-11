package com.projetTrans.prjetTrans.dto;

import com.projetTrans.prjetTrans.model.Contact;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ContactDto {
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private String iban;
    private UserDto user;


    public static ContactDto fromEntity(Contact contact){
        return ContactDto.builder()
                .id(contact.getId())
                .firstName(contact.getFirstName())
                .lastName(contact.getLastName())
                .email(contact.getEmail())
                .user(UserDto.fromEntity(contact.getUser()))
                .build();
    }
    public  static Contact toEntity(ContactDto contact){
        return Contact.builder()
                .id(contact.getId())
                .firstName(contact.getFirstName())
                .lastName(contact.getLastName())
                .email(contact.getEmail())
                .user(UserDto.toEntity(contact.getUser()))
                .build();
    }
}
