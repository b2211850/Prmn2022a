package lecture04;

public class ATM {
    Account[] accountList = new Account[10];
    int i = 0;

    public void registerAccount(String name,String number){
        accountList[i] = new Account(name, number);
        System.out.println( name + " さんのアカウントを口座番号: " + number + " で登録しました");
        i++;
    }

    public boolean existsAccount(String name,String number){
        if(i!=0) {
            for (int j = 0; j <= i; j++) {
                if (accountList[j].name == name && accountList[j].number == number) {
                    return true;
                }
            }
        }
        return false;
    }

    public void deposit(String number,long money){
        for(int j=0;j<=i-1;j++){
            if(accountList[j].number == number){
                accountList[j].balance += money;
                System.out.println("口座番号 " + accountList[j].number + " に " + money + " 円入金しました");
            }
        }
    }

    public long withdraw(String number,long money){
        for(int j=0;j<=i;j++){
            if(accountList[j].number == number){
                if (accountList[j].balance >= money){
                    accountList[j].balance -= money;
                    System.out.print("口座番号 " + accountList[j].number + " から " + money + " 円出金しました。");
                }else{
                    System.out.print("口座番号 " + accountList[j].number + " から " + money + " 円出金できませんでした。");
                }
                return accountList[j].balance;
            }
        }
        return 0;
    }
}
