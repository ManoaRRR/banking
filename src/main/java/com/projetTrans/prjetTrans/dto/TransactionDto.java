package com.projetTrans.prjetTrans.dto;

import com.projetTrans.prjetTrans.model.Transaction;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class TransactionDto {
    private BigDecimal amount;

    public TransactionDto fromEntity(Transaction transaction){
        return TransactionDto.builder()
                .amount(transaction.getAmount())
                .build();
    }
    public Transaction toEntity(TransactionDto transaction){
        return Transaction.builder()
                .amount(transaction.getAmount())
                .build();
    }
}
