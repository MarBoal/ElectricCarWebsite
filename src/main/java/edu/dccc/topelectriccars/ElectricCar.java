package edu.dccc.topelectriccars;

import java.text.NumberFormat;
import java.util.ArrayList;

public class ElectricCar implements Comparable<ElectricCar>{
    String model;
    String imgSrc;
    double basePrice;
    int epaMaxRange;
    String epaFuelEconomy;
    int rank;

    public ElectricCar(String model, String imgSrc, double basePrice, int epaMaxRange, String epaFuelEconomy, int rank) {
        this.model = model;
        this.imgSrc = imgSrc;
        this.basePrice = basePrice;
        this.epaMaxRange = epaMaxRange;
        this.epaFuelEconomy = epaFuelEconomy;
        this.rank = rank;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getImgSrc() {
        return imgSrc;
    }

    public void setImgSrc(String imgSrc) {
        this.imgSrc = imgSrc;
    }
    public double getBasePrice() {
        return basePrice;
    }
    public int getEpaMaxRange() {
        return epaMaxRange;
    }
    public String getEpaFuelEconomy() {
        return epaFuelEconomy;
    }
    public int getRank() {
        return rank;
    }

    public String getFormattedBasePrice() {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        return formatter.format(basePrice);
    }
    @Override
    public int compareTo(ElectricCar other) {
        return Double.compare(this.rank, other.rank);
    }

    NumberFormat nf = NumberFormat.getCurrencyInstance();

    public String toString() {
        return imgSrc +
                "\n--------------------------------------------------\n" +
                "Model name: " + model + "\n" +
                "Car Price: " + nf.format(basePrice) + "\n" +
                "Max Range: " + epaMaxRange + "\n" +
                "Fuel Efficiency: " + epaFuelEconomy + "\n" +
                "Final Ranking: " + rank + "\n" +
                "--------------------------------------------------\n";
    }
}
