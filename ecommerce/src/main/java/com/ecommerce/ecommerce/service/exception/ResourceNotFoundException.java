package com.ecommerce.ecommerce.service.exception;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException( String msg) {
        super(msg);
    }
}