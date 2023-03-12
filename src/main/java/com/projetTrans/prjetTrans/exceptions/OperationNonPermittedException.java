package com.projetTrans.prjetTrans.exceptions;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class OperationNonPermittedException extends RuntimeException{
    private String errorMsg;
    private String operationId;
    private String source;
    private String dependency;
}
