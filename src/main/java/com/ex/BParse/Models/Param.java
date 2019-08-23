package com.ex.BParse.Models;


import lombok.Data;

import javax.persistence.*;
import javax.xml.bind.annotation.*;

@Data
@XmlRootElement(name = "param")
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name = "params")
public class Param {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    @XmlAttribute(name = "name")
    private String name;

    @Column(name = "unit")
    @XmlAttribute(name = "unit")
    private String unit;

    @Column(name = "value")
    @XmlValue
    private String value;

}
