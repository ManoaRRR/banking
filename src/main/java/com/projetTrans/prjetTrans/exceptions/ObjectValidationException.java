package com.projetTrans.prjetTrans.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import java.util.Set;
@RequiredArgsConstructor
public class ObjectValidationException extends RuntimeException{
    @Getter
    private final Set<String> validation;
    @Getter
    private final String violationSource;
}
