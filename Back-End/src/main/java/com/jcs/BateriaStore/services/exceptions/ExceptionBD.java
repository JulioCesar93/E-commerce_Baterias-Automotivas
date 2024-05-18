package com.jcs.BateriaStore.services.exceptions;

public class ExceptionBD extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public ExceptionBD(String msg) {
        super(msg);
    }
}