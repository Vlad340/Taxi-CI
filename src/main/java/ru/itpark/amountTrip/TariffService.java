package ru.itpark.amountTrip;

public class TariffService {
    private long landingPrice;
    private long tripPrice;
    private long amountToCalculateDiscount;
    private int discount;
    private long maximumAmountDiscount;

    public TariffService(long landingPrice, long tripPrice, long amountToCalculateDiscount, long amountToCalculateDiscount, int discount, long maximumAmountDiscount) {
        this.landingPrice = landingPrice;
        this.tripPrice = tripPrice;
        this.amountToCalculateDiscount = amountToCalculateDiscount;
        this.discount = discount;
        this.maximumAmountDiscount = maximumAmountDiscount;
    }
}