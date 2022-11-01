package lecture01;

public class kadai5 {
    public static void main(String[] args) {
        int[] score = {41,85,72,38,80};

        for(int i = 0 ; i < score.length ; i++) {
            System.out.print(i + "番　" + score[i] + "点　");
            if (score[i] < 60) {
                System.out.println("不可");
            } else if (score[i] < 70) {
                System.out.println("可");
            } else if (score[i] < 80) {
                System.out.println("良");
            } else if (score[i] < 90) {
                System.out.println("優");
            } else if (score[i] <= 100) {
                System.out.println("秀");
            } else {
                System.out.println("Error");
            }

        }

        int max = max(score);
        int min = min(score);
        double ave = average(score);

        System.out.println("");
        System.out.println("最高点：" + max);
        System.out.println("最低点：" + min);
        System.out.println("平均点：" + ave);


    }

    public static int max(int a[]) {
        int max = a[0];
        for(int i = 1 ; i < a.length ; i++){
            if(max < a[i]){
                max = a[i];
            }
        }
        return max;
    }
     public static int min(int a[]) {
        int min = a[0];
        for(int i = 1 ; i < a.length ; i++){
            if(min > a[i]){
                min = a[i];
            }
        }
        return min;
    }

    public static double average(int a[]) {
        int sum = 0;
        for(int i = 0 ; i < a.length ; i++){
            sum = sum + a[i];
        }
        double ave = (double) sum / a.length;
        return ave;
    }

}
