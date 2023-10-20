package lesson3;
import java.awt.*;

public class Harvester extends Car{

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

    //автомобиль-уборщик
    public Harvester(String make, String model, Color color) {
        super(make, model, color);
    }
}
