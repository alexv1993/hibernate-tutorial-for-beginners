package com.github.alexv1993.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import java.util.Date;

/**
 * Created by vendin on 10.10.2017.
 */

@Entity
@Table(name = "EMPLOYEE", uniqueConstraints = {@UniqueConstraint(columnNames = {"ID"})})
public class Employee1 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false, unique = true, length = 11)
    private int ID;


    @Column(name = "NAME", length = 20, nullable = true)
    private String NAME;

    @Column(name = "ROLE", length = 20, nullable = true)
    private String ROLE;

    @Column(name = "INSERT_TIME", nullable = true)
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
