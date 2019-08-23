package com.ex.BParse.Models.ParseHelpModels;

import lombok.Data;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAttribute;


@Data
@Entity
@Table(name = "query_rules")
public class QueryRule {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @XmlAttribute(name = "id")
    private long id;

    @Column(name = "is_simple")
    private boolean isSimple;


}
