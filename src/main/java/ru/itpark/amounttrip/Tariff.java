package ru.itpark.amounttrip;

public class Tariff {
    private long landingPrice;
    private long tripPrice;
    private long amountToCalculateDiscount;
    private int discount;
    private long maximumAmountDiscount;

    public Tariff(long landingPrice, long tripPrice, long amountToCalculateDiscount, long amountToCalculateDiscount, int discount, long maximumAmountDiscount) {
        this.landingPrice = landingPrice;
        this.tripPrice = tripPrice;
        this.amountToCalculateDiscount = amountToCalculateDiscount;
        this.discount = discount;
        this.maximumAmountDiscount = maximumAmountDiscount;
    }
}