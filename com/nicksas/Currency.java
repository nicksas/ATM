package com.nicksas;

import java.util.HashMap;
import java.util.Map;

public class Currency {
    private final Map<String, Double> currencies = new HashMap<>();

    public Currency() {
        currencies.put("GEL", 22.0);
        currencies.put("USD", 63.0);
        currencies.put("EURO", 54.0);
    }

    public String getCurrency(int index) {
        return (String) currencies.keySet().toArray()[index];
    }

    public Double getCurrencyRate(int index) {
        if (currencies.size() - 1 < index){
            return -1.0;
        }
        return currencies.get(getCurrency(index));
    }

    public void show() {
        for (int i = 0; i < currencies.size(); i++) {
            System.out.println(i + " - " + currencies.keySet().toArray()[i]);
        }
    }


}
