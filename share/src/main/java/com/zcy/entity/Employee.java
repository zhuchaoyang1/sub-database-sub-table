package com.zcy.entity;

import lombok.Data;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "employee")
public class Employee {

    @Id
    private Long eId;

    @Basic
    private Long dId;

    @Basic
    private boolean eGender;

    @Basic
    private String eName;


}
