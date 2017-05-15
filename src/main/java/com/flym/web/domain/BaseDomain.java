package com.flym.web.domain;

import java.io.Serializable;

/**
 * Created by Carlis on 5/15/2017.
 */
public class BaseDomain implements Serializable {
    protected Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
