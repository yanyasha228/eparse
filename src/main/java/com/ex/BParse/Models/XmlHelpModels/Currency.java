package com.ex.BParse.Models.XmlHelpModels;

import com.ex.BParse.Models.Enums.MoneyCurrency;
import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlRootElement(name = "currency")
@XmlAccessorType(XmlAccessType.FIELD)
public class Currency {

    @XmlAttribute(name = "code")
    private MoneyCurrency code;

    @XmlAttribute(name = "rate")
    private double rate;
}
