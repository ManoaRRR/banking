package com.projetTrans.prjetTrans.dto;

import com.projetTrans.prjetTrans.model.Transaction;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class TransactionDto {
    @NotNull
    @NotBlank
    @Max(value = 1000000000)
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
