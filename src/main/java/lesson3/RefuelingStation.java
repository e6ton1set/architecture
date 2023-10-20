package lesson3;

public class RefuelingStation implements Refueling{

    @Override
    public void fuel(FuelType fuelType) {
        switch (fuelType){
            case Diesel -> System.out.println("Заправка дизелем");
            case Gasoline -> System.out.println("Заправка бензином");
        }
    }
}
