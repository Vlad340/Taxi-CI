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

}