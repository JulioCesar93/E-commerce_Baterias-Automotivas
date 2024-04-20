package com.jcs.BateriaStore.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;

@Configuration
public class ResourceServerConfig {

    private String corsOrigins;
    private Environment envWork;
    private JwtTokenStore tokenStoreJwt;

    private static final String[] USER = {
          // inserir EndPoints
    };

    //private static final String[] OPERATOR = { account's ** };
    private static final String[] ADMIN = { "/admin/**" };

    public void configure (ResourceServerSecurityConfigurer resources) throws Exception {
        resources.tokenStore(tokenStoreJwt);
    }

    public void configure(HttpSecurity http) throws Exception { }
    // Implementar requisições / http - H2

    // CorsConfigurationSource corsConfigurationSource() {}
    // FilterRegistrationBean<CorsFilter> corsFilter() {};
}
