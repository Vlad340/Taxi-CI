package ru.itpark.amountTrip;

public class TripService {

    public long calculationAmount(long distance, new Tariff()) {
        int oneHundredPercent = 100;

        if (distance == 0) {
            return 0;
        }
        Tariff tariff = new Tariff(60_00L,20_00L,1_000_00L,5,100_00L);
        long amount = tariff.landingPrice + tariff.tripPrice * distance;
        if (amount <= tariff.amountToCalculateDiscount) {
            return amount;
        }
        long discount = tariff.discount*amount/oneHundredPercent;
        if (discount > tariff.maximumAmountDiscount) {
            discount = tariff.maximumAmountDiscount;
        }
        amount -=discount;
        return amount;
    }
}
