package lecture06;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Exercise6_2_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        ArrayList<Integer> dise = new ArrayList<>();

        for(int i=0 ; i<5 ; i++ ) {
            dise.add(random.nextInt(6) + 1);
        }
        System.out.println("さいころを5つ振りました");

        System.out.println("何番目のさいころの値を確認しますか？");

        try{
            int k = input.nextInt();
            int a = dise.get(k);
            System.out.println(k+"番目のさいころの目は"+a+"です");

        } catch (InputMismatchException e){
            System.out.println("整数以外の値が入力されました");
            System.out.println("プログラムを終了します");
            System.exit(0);

        } catch (IndexOutOfBoundsException e){

            System.out.println("ArrayListの範囲外アクセスを確認しました");
            System.out.println("プログラムを終了します");
            System.exit(0);

        }

    }



}
