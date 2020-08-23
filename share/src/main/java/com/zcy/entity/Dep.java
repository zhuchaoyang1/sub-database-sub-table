package com.zcy.entity;

import lombok.Data;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "depment")
public class Dep {

    @Id
    private Long dId;

    @Basic
    private Long cId;

    @Basic
    private String dName;

    @Basic
    private String dManager;

}
