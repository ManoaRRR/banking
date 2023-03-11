package com.projetTrans.prjetTrans.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
@Entity
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class Transaction extends  AbstractEntity{

    private BigDecimal amount;
    @Enumerated(EnumType.STRING)
    private TransactionType type;
    private String destinationIban;
    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;
}
