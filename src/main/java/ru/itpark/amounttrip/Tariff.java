package ru.itpark.amounttrip;

public class Tariff {
    private long landingPrice;
    private long tripPrice;
    private long amountToCalculateDiscount;
    private int discount;
    private long maximumAmountDiscount;

    public Tariff(long landingPrice, long tripPrice, long amountToCalculateDiscount, int discount, long maximumAmountDiscount) {
        this.landingPrice = landingPrice;
        this.tripPrice = tripPrice;
        this.amountToCalculateDiscount = amountToCalculateDiscount;
        this.discount = discount;
        this.maximumAmountDiscount = maximumAmountDiscount;
    }

    public long getLandingPrice() {
        return landingPrice;
    }

    public void setLandingPrice(long landingPrice) {
        this.landingPrice = landingPrice;
    }

    public long getTripPrice() {
        return tripPrice;
    }

    public void setTripPrice(long tripPrice) {
        this.tripPrice = tripPrice;
    }

    public long getAmountToCalculateDiscount() {
        return amountToCalculateDiscount;
    }

    public void setAmountToCalculateDiscount(long amountToCalculateDiscount) {
        this.amountToCalculateDiscount = amountToCalculateDiscount;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public long getMaximumAmountDiscount() {
        return maximumAmountDiscount;
    }

    public void setMaximumAmountDiscount(long maximumAmountDiscount) {
        this.maximumAmountDiscount = maximumAmountDiscount;
    }
}
