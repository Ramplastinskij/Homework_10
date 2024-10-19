public class Main {
    public static void main(String[] args) {
        Vehicle car1 = new Car("car1");
        Vehicle car2 = new Car("car2");
        Vehicle truck1 = new Truck("truck1");
        Vehicle truck2 = new Truck("truck2");
        Vehicle bicycle1 = new Bicycle("bicycle1");
        Vehicle bicycle2 = new Bicycle("bicycle2");

        ServiceStation station = new ServiceStation();
        station.check(car1);
        station.check(car2);
        station.check(bicycle1);
        station.check(bicycle2);
        station.check(truck1);
        station.check(truck2);
    }
}