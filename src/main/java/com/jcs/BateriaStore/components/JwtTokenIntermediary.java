package com.jcs.BateriaStore.components;

import com.jcs.BateriaStore.entities.User;
import com.jcs.BateriaStore.repositories.EnderecoRepository;
import com.jcs.BateriaStore.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class JwtTokenIntermediary implements TokenEnhancer {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Override
    public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {

        User user = userRepository.findByEmail(authentication.getName());

        Map<String, Object> map = new HashMap<>();
        map.put("id", user.getId());
        map.put("firstName", user.getFirstName());
        map.put("lastName", user.getLastName());
        map.put("email", user.getEmail());
        map.put("username", user.getUsername());
        map.put("cpf", user.getCpf());
        map.put("birthDay", user.getBirthDay());
        map.put("phone", user.getPhone());
        map.put("roles", user.getProfiles());

        DefaultOAuth2AccessToken token = (DefaultOAuth2AccessToken) accessToken;
        token.setAdditionalInformation(map);

        return accessToken;
    }
}