package com.zcy.entity;

import lombok.Data;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "company")
public class Company {

    @Id
    private Long cId;

    @Basic
    private Long cName;

}
