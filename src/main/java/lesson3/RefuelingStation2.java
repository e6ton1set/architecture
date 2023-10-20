package lesson3;

public class RefuelingStation2 implements Refueling{

    public void processCarFuel(FuelType fuelType) {
        switch (fuelType){
            case Diesel -> System.out.println("Заправка дизелем");
            case Gasoline -> System.out.println("Заправка бензином");
        }
    }

    @Override
    public void fuel(FuelType fuelType) {processCarFuel(fuelType);
    }
}
