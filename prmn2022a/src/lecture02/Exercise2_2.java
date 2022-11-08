package lecture02;

public class Exercise2_2 {
   public static void main(String[] args) {
        Car_1 car = new Car_1();
        GasStation_1 gs = new GasStation_1();

        car.run();
        gs.refuel(car);
        car.run();

    }
}
