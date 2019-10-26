import ru.itpark.amounttrip.Tariff;
import ru.itpark.amounttrip.TripService;

public class Main {
    public static void main(String[] args) {
        int oneHundredPenny=100;
        long distance = 100;
        long landingPrice=60_00L;
        long tripPrice=20_00L;
        long amountToCalculateDiscount=1_000_00L;
        int discount=5;
        long maximumAmountDiscount=100_00L;
        Tariff tariff=new Tariff(landingPrice,tripPrice,amountToCalculateDiscount,discount,maximumAmountDiscount);
        TripService trip = new TripService();
        System.out.println("Стоимость поездки "+trip.calculationAmount(distance, tariff)/oneHundredPenny+" руб.");
    }
}
