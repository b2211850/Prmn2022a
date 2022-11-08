package lecture03;

import java.util.Scanner;

public class Exercise3_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("何行分入力しますか？");
        int l = Integer.parseInt(input.nextLine());
        String[] line = new String[l];

        for(int n = 0; n < l; n++ ){
            System.out.println( n+1 + "行目:");
            line[n] = input.nextLine();
        }
        System.out.println("入力した文字列:");

        for(int m = 0 ; m < l ; m++ ){
            System.out.println("["+m+"] "+ line[m] );
        }
    }
}
