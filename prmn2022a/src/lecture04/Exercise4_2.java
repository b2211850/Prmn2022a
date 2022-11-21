package lecture04;

public class Exercise4_2 {
    public static void main(String[] args) {
        ATM atm = new ATM();
        String name = "田中幸助";
        String number = "12345";
        long nokori;

        if(atm.existsAccount(name,number)==true){
            System.out.println("名前: "+name+" 口座番号:　" +number+"は存在します");
        }else{
            System.out.println("名前: "+name+" 口座番号:　" +number+"は存在しません");
        }
        atm.registerAccount(name,number);
        atm.deposit(number,1000);
        nokori = atm.withdraw(number,2000);
        System.out.println("残高:" + nokori + " 円");
        nokori = atm.withdraw(number,500);
        System.out.println("残高:" + nokori + " 円");
    }
}
