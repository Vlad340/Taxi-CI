package ru.itpark.amounttrip;

public class TripService {
    private long amount;

    public long calculationAmount(long distance, Tariff tariff ) { //new Tariff(60_00L,20_00L,1_000_00L,5,100_00L)) {
        int oneHundredPercent = 100;

        if (distance == 0) {
            return 0;
        }
//        Tariff tariff = new Tariff(60_00L,20_00L,1_000_00L,5,100_00L);
        amount =tariff.getLandingPrice()  +tariff.getTripPrice() * distance;
        if (amount <= tariff.getAmountToCalculateDiscount()) {
            return amount;
        }
        long amountDiscount =tariff.getDiscount()*amount/oneHundredPercent;
        if (amountDiscount >tariff.getMaximumAmountDiscount()) {
            amountDiscount =tariff.getMaximumAmountDiscount();
        }
        amount -=amountDiscount;
        return amount;
    }
}
