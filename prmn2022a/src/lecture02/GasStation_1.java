package lecture02;

public class GasStation_1 {

    Car_1 car = new Car_1();

    void refuel(Car_1 car){
        car.fuel += 20;
        System.out.println("給油によりfuelが20回復しました。");
    }
}
