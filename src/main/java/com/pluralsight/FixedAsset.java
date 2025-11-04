package com.pluralsight;
import com.pluralsight.finance.*;
public abstract class FixedAsset implements Valuable{
    private String name;
    private Double marketValue;

    public FixedAsset(String name, Double marketValue) {
        this.name = name;
        this.marketValue = marketValue;
    }

    public double getvalue(){
        return marketValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMarketValue() {
        return marketValue;
    }

    public void setMarketValue(Double marketValue) {
        this.marketValue = marketValue;
    }
}
