package lesson3;

public class WipingStation implements Wiping{

    public void processComplexWiping(CarType carType) {
        switch (carType){
            case Sport -> System.out.println("Приняли ваш авто типа Спорт");
            case Sedan -> System.out.println("Приняли ваш авто типа Седан");
            case Pickup -> System.out.println("Приняли ваш авто типа Пикап");
            case Hatchback -> System.out.println("Приняли ваш авто типа Хэтчбек");
        }
        wipMirrors();
        wipWindshield();
        wipHeadLights();
    }

    @Override
    public void wipMirrors() {
        System.out.println("Зеркала помыты");
    }

    @Override
    public void wipWindshield() {
        System.out.println("Лобовое стекло помыто");
    }

    @Override
    public void wipHeadLights() {
        System.out.println("Фары помыты");
    }
}
