package com.nelioalves.workshopmongo.dto;

import java.io.Serial;
import java.io.Serializable;

import com.nelioalves.workshopmongo.domain.User;

public class AuthorDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = -5201141472434191230L;
    
    private String id;
    private String name;

    public AuthorDTO() {
    }

    public AuthorDTO(User obj) {
        id = obj.getId();
        name = obj.getName();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
