package com.pluralsight;

public class Gold extends FixedAsset {
    private double weight;

    public Gold(String name, Double marketValue, double weight) {
        super(name, marketValue);
        this.weight = weight;
    }

    @Override
    public double getValue(){
        return weight;
    }
}
