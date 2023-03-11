package com.projetTrans.prjetTrans.model;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "_user")
public class User extends AbstractEntity {

    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private boolean active;

    @OneToOne
    private Address address;

    @OneToMany(mappedBy = "user")
    private List<Transaction> transaction;

    @OneToMany(mappedBy = "user")
    private List<Contact> contact;

    @OneToOne
    private Account account;

    @OneToOne
    private Role role;
}
