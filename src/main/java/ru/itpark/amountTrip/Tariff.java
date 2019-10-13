package ru.itpark.amountTrip;

public class Tariff {
    long landingPrice = 60_00L;
    long tripPrice = 20_00L;
    long amountToCalculateDiscount = 1_000_00L;
    int discount = 5;
    long maxAmountDiscount = 100_00L;

    public Tariff() {
        this.landingPrice = 60_00L;
        this.tripPrice = 20_00L;
        this.amountToCalculateDiscount = 1_000_00L;
        this.discount = 5;
        this.maxAmountDiscount = 100_00L;
    }
    public Tariff(long landingPrice, long tripPrice, long amountToCalculateDiscount, int discount, long maxAmountDiscount) {
        this.landingPrice = landingPrice;
        this.tripPrice = tripPrice;
        this.amountToCalculateDiscount = amountToCalculateDiscount;
        this.discount = discount;
        this.maxAmountDiscount = maxAmountDiscount;
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

    public long getMaxAmountDiscount() {
        return maxAmountDiscount;
    }

    public void setMaxAmountDiscount(long maxAmountDiscount) {
        this.maxAmountDiscount = maxAmountDiscount;
    }
}