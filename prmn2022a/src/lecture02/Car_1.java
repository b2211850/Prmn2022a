package lecture02;

public class Car_1 {
    int fuel = 0;

    void run() {

        if (fuel > 0) {
            fuel--;
            System.out.println("燃料を1消費して走りました。");
        } else {
            System.out.println("燃料不足で走ることができませんでした。");
        }

    }
}
