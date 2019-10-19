package ru.itpark.amounttrip;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TripServiceTest {

    @Test
    public void calculationAmountZero() {
        Tariff tariff=new Tariff(60_00L,20_00L,1_000_00L,5,100_00);
        TripService trip = new TripService();
        long amount = trip.calculationAmount(0, tariff) / 100;
        assertEquals(0, amount);
    }

    @Test
    public void calculationAmountNoBonus() {
        Tariff tariff=new Tariff(60_00L,20_00L,1_000_00L,5,100_00);
        TripService trip = new TripService();
        long amount = trip.calculationAmount(25, tariff)/100;
        assertEquals(560,amount);
    }

    @Test
    public void calculationAmountWithBonus() {
        Tariff tariff=new Tariff(60_00L,20_00L,1_000_00L,5,100_00);
        TripService trip = new TripService();
        long amount = trip.calculationAmount(50, tariff)/100;
        assertEquals(1_007,amount);
    }

    @Test
    public void calculationAmountWithLimitBonus() {
        Tariff tariff=new Tariff(60_00L,20_00L,1_000_00L,5,100_00);
        TripService trip = new TripService();
        long amount = trip.calculationAmount(100, tariff)/100;
        assertEquals(1_960,amount);
    }
}