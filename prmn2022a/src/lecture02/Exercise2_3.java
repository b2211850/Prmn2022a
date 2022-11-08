package lecture02;

public class Exercise2_3 {
    public static void main(String[] args) {
        Tire[] tires;
        tires = new Tire[4];
        for (int i = 0 ; i < 4 ; i++){
            tires[i] = new Tire(65);
        }
        Engine engine = new Engine(4000);

        Car car = new Car(tires , engine);
        GasStation gs = new GasStation();

        gs.refuel(car);
        car.startEngine();
        car.run();

    }
}
