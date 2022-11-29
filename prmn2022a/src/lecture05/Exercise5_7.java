package lecture05;

public class Exercise5_7 {
    public static void main(String[] args) {
        Insect[] in = new Insect[4];
        in[0] = new Insect();
        in[1] = new Butterfly();
        in[2] = new Locust();
        in[3] = new SwallowtailButterfly();

        for(int i = 0 ; i<4 ; i++){
            in[i].move();
        }
    }
}
