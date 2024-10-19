public class Car extends Vehicle {
    public Car(String modelName) {
        super(modelName, 4);
    }
    @Override
    public void check() {
        System.out.println("Обслуживаем автомобиль " + getModelName());
        updateTyre();
        checkEngine();
    }
    public void checkEngine() {
        System.out.println("Проверяем двигатель автомобиля " + getModelName());
    }
}