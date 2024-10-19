public class Bicycle extends Vehicle {
    public Bicycle(String modelName) {
        super(modelName, 2);
    }

    @Override
    public void check() {
        System.out.println("Обслуживаем велосипед " + getModelName());
        updateTyre();
    }
}