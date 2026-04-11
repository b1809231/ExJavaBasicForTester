package BaiTapOOP.BaiTapJavaOOP5.modelsb5;

import BaiTapOOP.BaiTapJavaOOP5.commonb5.Constantsb5;

public class Walletb5 {
//    Thuộc tính:
//    walletId (String)
//    ownerName (String)
//    balance (double)
//    Hàm:
//            👉 Constructor
//    Wallet(String walletId, String ownerName, double balance)
//    👉 deposit(double amount)
//    Cộng tiền vào balance
//    👉 withdraw(double amount)
//    Trừ tiền
//    Nếu không đủ tiền → in:
//    Not enough balance
//    👉 displayWallet()
//
//    In:
//
//    WalletID: W01
//    Owner: Summi
//    Balance: 1000 VND

    public String walletID;
    public String ownerName;
    public double balance;

    public Walletb5(String walletID, String ownerName, double balance) {
        this.walletID = walletID;
        this.balance = balance;
        this.ownerName = ownerName;
    }

    public void deposit(double amount){
       if (amount <= 0){
           System.out.println("Invalid amount");
       return;
       }
       balance += amount;
        System.out.println("Deposit success: "+ amount);

    }

    public void withdraw(double amount){
        if(amount <= 0){
            System.out.println("Invalid amount");
            return;
        }
        if(amount > balance ){
            System.out.println("not enough balance");
        } else {
            balance -= amount;
            System.out.println("With success: " + amount);
        }
    }

    // Display
    public void displayWallet() {
        System.out.println("WalletID: " + walletID);
        System.out.println("Owner: " + ownerName);
        System.out.println("Balance: " + balance + " " + Constantsb5.currency);
    }



}
