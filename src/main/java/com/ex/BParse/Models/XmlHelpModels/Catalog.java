package com.ex.BParse.Models.XmlHelpModels;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@Data
@XmlRootElement(name = "catalog")
@XmlAccessorType(XmlAccessType.FIELD)
public class Catalog {

    @XmlElement
    private List<Category> categories;

}
