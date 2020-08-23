package com.zcy.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @EmbeddedId
    private Long eId;

    @Basic
    private Long dId;

    @Basic
    private boolean eGender;

    @Basic
    private String eName;


}
