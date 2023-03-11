package com.projetTrans.prjetTrans.model;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Entity
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class Contact extends  AbstractEntity{

    private String firstName;
    private String lastName;
    private String email;
    private String iban;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;
}
