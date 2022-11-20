package lecture04;

public class Exercise4_1 {
    public static void main(String[] args) {
        Fighter cl1 = new Fighter(18,6,"A");
        Fighter cl2 = new Fighter(10,8,"B");

        while (true){
            cl1.attack(cl2);
            System.out.println( cl2.getName() + "の残りHPは" + cl2.getHitPoint());
            if(cl2.Alive() != true){
                System.out.println(cl2.getName() + "は倒れた…!!");
                break;
            }
            cl2.attack(cl1);
            System.out.println( cl2.getName() + "の残りHPは" + cl2.getHitPoint());
            if(cl1.Alive() != true){
                System.out.println(cl1.getName() + "は倒れた…!!");
                break;
            }
        }
    }
}
