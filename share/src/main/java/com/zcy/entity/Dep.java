package com.zcy.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "depment")
public class Dep {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long dId;

    @Basic
    private Long cId;

    @Basic
    private String dName;

    @Basic
    private String dManager;

}
