package com.berk.exception;
import lombok.Getter;

@Getter
public class AlisverisManagerException extends RuntimeException{
    private final EErrorType errorType;

    public AlisverisManagerException(EErrorType errorType){
        super(errorType.getMessage());
        this.errorType = errorType;
    }

    public AlisverisManagerException(EErrorType errorType, String message){
        super(message);
        this.errorType = errorType;
    }

}