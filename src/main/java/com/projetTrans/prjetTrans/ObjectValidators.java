package com.projetTrans.prjetTrans;

import com.projetTrans.prjetTrans.exceptions.ObjectValidationException;
import net.bytebuddy.implementation.bytecode.Throw;
import org.springframework.stereotype.Service;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;
import java.util.stream.Collectors;
//cette class est geenerique et elle permet de valider les objets ou leus valeurs qui sont entrées dans les objectDTO sont entrées
@Service
public class ObjectValidators <T>{
    private  final ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
    private  final Validator validator = validatorFactory.getValidator();
    public void validate (T objectValidate){
        Set<ConstraintViolation<T>> violations = validator.validate(objectValidate);
        if (!violations.isEmpty()){
            Set<String> errorMessage = violations.stream()
                    .map(ConstraintViolation::getMessage)
                    .collect(Collectors.toSet());
            throw new ObjectValidationException(errorMessage, objectValidate.getClass().getName());
        }

    }
}
