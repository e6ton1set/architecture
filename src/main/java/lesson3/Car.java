package lesson3;
import java.awt.*;

public abstract class Car {

    //region Методы


    // добавить заправочную станцию
    public void setRefuelingStation(Refueling refuelingStation){
        this.refueling = refuelingStation;
    }

    // добавить станцию мойки
    public void setWiping(Wiping wiping) {
        this.wiping = wiping;
    }

    // Заправить автомобиль
    public void fuel() {
        if(refueling != null){
            refueling.fuel(fuelType);
        }
    }

    // Количество колёс
    protected void setWheelsCount(int wheelsCount){
        this.wheelsCount = wheelsCount;
    }

    public int getWheelsCount() {return wheelsCount;}

    // Движение
    public abstract void movement();

    // Обслуживание
    public abstract void maintenance();

    // Переключение передачи
    public abstract boolean gearShifting();

    // Включение фар
    public abstract boolean switchHeadLights();

    // Включение дворников
    public abstract boolean switchWipers();

    //endregion

    //region Конструкторы

    public Car(String make, String model, Color color) {
        this.make = make;
        this.model = model;
        this.color = color;
    }

    //endregion

    //region Поля

    private Refueling refueling;

    private Wiping wiping;

    // Марка автомобиля
    private String make;

    // Модель
    private String model;

    // Цвет
    private Color color;

    // Тип
    protected CarType type;

    // Число колес
    private int wheelsCount;

    // Тип топлива
    protected FuelType fuelType = FuelType.Diesel;

    // Тип коробки передач
    private GearboxType gearboxType;

    // Объем двигателя
    private double engineCapacity;

    // Состояние противотуманных фар
    private boolean fogLights = false;

    //endregion
}
