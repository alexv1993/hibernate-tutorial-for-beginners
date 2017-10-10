package com.github.alexv1993.hibernate.model;

import java.util.Date;

/**
 * Created by vendin on 10.10.2017.
 */
public class Employee {
    private int ID;
    private String NAME;
    private String ROLE;
    private Date INSERT_TIME;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getROLE() {
        return ROLE;
    }

    public void setROLE(String ROLE) {
        this.ROLE = ROLE;
    }

    public Date getINSERT_TIME() {
        return INSERT_TIME;
    }

    public void setINSERT_TIME(Date INSERT_TIME) {
        this.INSERT_TIME = INSERT_TIME;
    }
}
