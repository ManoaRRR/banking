package com.projetTrans.prjetTrans.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@SuperBuilder
@AllArgsConstructor
public class Account extends AbstractEntity {
    private String iban;

    @OneToOne
    @JoinColumn(name = "id_user")
    private User user;
}
