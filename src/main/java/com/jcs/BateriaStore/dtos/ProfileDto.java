package com.jcs.BateriaStore.dtos;

import com.jcs.BateriaStore.entities.Profile;
import java.io.Serializable;

public class ProfileDto implements Serializable {

    private Long id;
    private String authority;

    public ProfileDto(){}

    public ProfileDto (Long id, String authority) {
        super();
        this.id = id;
        this.authority = authority;
    }

    public ProfileDto(Profile profile) {
        super();
        id = profile.getId();
        authority = profile.getAuthority();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }
}