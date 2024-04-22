package com.jcs.BateriaStore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;

public class WebSecurityConfiguration {

    private String jwtSecret;

    BCryptPasswordEncoder passwordEncoder() {
        return null;
    }

    JwtAccessTokenConverter accessTokenConverter() {
        return null;
    }

    JwtTokenStore tokenStore() {
        return null;
    }

    AuthenticationManager authenticationManager () {
        return null;
    }
}