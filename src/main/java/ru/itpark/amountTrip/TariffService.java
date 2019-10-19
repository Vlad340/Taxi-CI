package ru.itpark.amountTrip;

public class TariffService {
    private long landingPrice;
    private long tripPrice;
    private long amountToCalculateDiscount;
    private int discount;
    private long maximumAmountDiscount;

    public TariffService() {
        this.landingPrice = 60_00L;
        this.tripPrice = 20_00L;
        this.amountToCalculateDiscount = 1_000_00L;
        this.discount = 5;
        this.maximumAmountDiscount = 100_00L;
    }
}