public class Truck extends Vehicle {
    public Truck(String modelName) {
        super(modelName, 6);
    }
    @Override
    public void check() {
        System.out.println("Обслуживаем грузовик " + getModelName());
        updateTyre();
        checkEngine();
        checkTrailer();
    }
    public void checkEngine() {
        System.out.println("Проверяем двигатель грузовика " + getModelName());
    }
    public void checkTrailer() {
        System.out.println("Проверяем прицеп грузовика " + getModelName());
    }
}