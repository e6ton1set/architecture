package lesson3;
import java.awt.*;

public class Harvester extends Car{

    //автомобиль-уборщик
    public Harvester(String make, String model, Color color) {
        super(make, model, color);
        setWheelsCount(6);
        this.fuelType = FuelType.Gasoline;
        this.type = CarType.Sedan;
    }
    // Принцип открытости и закрытости
    private boolean fogLights = false;
    public boolean switchFogLights(){
        fogLights = !fogLights;
        return fogLights;
    }

    // Прицип единой ответственности (SRP) -> мы не стали добавлять ещё один абстрактный метод в родительский класс Car, т.к. не все автомобили умеют подметать улицы. Поэтому мы создали отдельный метод для наследника Harvester (уборщик).
    public void sweeping() {
        System.out.println("Автомобиль метёт улицу.");
    }

    @Override
    public void movement() {

    }

    @Override
    public void maintenance() {

    }

    @Override
    public boolean gearShifting() {
        return false;
    }

    @Override
    public boolean switchHeadLights() {
        return false;
    }

    @Override
    public boolean switchWipers() {
        return false;
    }
}
