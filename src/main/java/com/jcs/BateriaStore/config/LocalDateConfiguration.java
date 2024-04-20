package com.jcs.BateriaStore.config;

import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;

public class LocalDateConfiguration {

    private static final String datePattern = "dd/MM/yyyy";
    private static final String dateTimePattern = "dd/MM/yyyy HH:mm:ss";

    public Jackson2ObjectMapperBuilderCustomizer localDateCustomizer() {
        return null;
        // builder
    }
}
