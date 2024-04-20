package com.jcs.BateriaStore.controllers.exceptions;

import lombok.Getter;
import java.io.Serializable;
import java.time.Instant;

@Getter
public class StandardError implements Serializable {
    private static final long serialVersionUID = 1L;

    private String error;
    private String message;
    private Integer status;
    private String path;
    private Instant timestamp;

    public StandardError() {}

    public void setTimestamp (Instant timestamp) {
        this.timestamp = timestamp;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setError(String error) {
        this.error = error;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void addError(String field, String defaultMessage) {
    }
}
