package com.zcy.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "company")
public class Company {

    @Id
    @EmbeddedId
    private Long cId;

    @Basic
    private Long cName;

}
