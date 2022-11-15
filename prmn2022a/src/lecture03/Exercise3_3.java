package lecture03;

import java.util.Scanner;

public class Exercise3_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String in1 , in2 ;

        System.out.println("1つ目の整数を入力してください");
        in1 = input.next();
        System.out.println("2つ目の整数を入力してください");
        in2 = input.next();

        int ans;

        ans = Integer.parseInt(in1)+Integer.parseInt(in2);


        System.out.println( in1 + " + " + in2 + " = " + ans );
    }
}
