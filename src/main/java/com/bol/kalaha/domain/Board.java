package com.bol.kalaha.domain;

import org.springframework.stereotype.Component;

@Component
public class Board {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
