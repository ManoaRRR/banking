package com.projetTrans.prjetTrans.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class Address extends AbstractEntity{
    private String street;
    private Integer houseNumber;
    private String city;
    private String zipCode;
    private String country;

    @OneToOne
    @JoinColumn(name = "id_user")
    private User user;
}
