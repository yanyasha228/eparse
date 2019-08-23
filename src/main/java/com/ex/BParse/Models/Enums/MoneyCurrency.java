package com.ex.BParse.Models.Enums;

public enum MoneyCurrency {

    UAH, USD, EUR;

    public String getCurrencySymbol() {
        String curSymb = "";
        switch (name()) {
            case "UAH":
                curSymb = "₴";
                break;
            case "USD":
                curSymb = "$";
                break;
            case "EUR":
                curSymb = "€";
                break;
        }
        return curSymb;
    }
}
