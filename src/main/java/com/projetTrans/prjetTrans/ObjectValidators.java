package com.projetTrans.prjetTrans;

import org.springframework.stereotype.Service;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class ObjectValidators <T>{
    private  final ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
    private  final Validator validator = validatorFactory.getValidator();
    public void validate (T objectTovalidate){
        Set<ConstraintViolation<T>> violations = validator.validate(objectTovalidate);
        if (!violations.isEmpty()){
            Set<String> errorMessage = violations.stream()
                    .map(ConstraintViolation::getMessage)
                    .collect(Collectors.toSet());
        }
    }
}
