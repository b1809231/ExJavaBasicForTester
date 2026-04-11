package BaiTapOOP.BaiTapJavaOOP5.testcasesb5;


import BaiTapOOP.BaiTapJavaOOP5.commonb5.BaseTestb5;
import BaiTapOOP.BaiTapJavaOOP5.modelsb5.Walletb5;

public class TestWalletb5 extends BaseTestb5 {

    // TC01 - Deposit
    public void testDeposit() {
        startTest("Deposit");

        System.out.println("Step 1: Create wallet");
        Walletb5 wallet = new Walletb5("W01", "Summi", 1000);

        System.out.println("Step 2: Deposit 500");
        wallet.deposit(500);

        System.out.println("Step 3: Display wallet");
        wallet.displayWallet();

        endTest("Deposit");
    }

    // TC02 - Withdraw
    public void testWithdraw() {
        startTest("Withdraw");

        System.out.println("Step 1: Create wallet");
        Walletb5 wallet = new Walletb5("W02", "Summi", 1000);

        System.out.println("Step 2: Withdraw 200");
        wallet.withdraw(200);

        System.out.println("Step 3: Display wallet");
        wallet.displayWallet();

        endTest("Withdraw");
    }

    // TC03 - Withdraw Fail
    public void testWithdrawFail() {
        startTest("Withdraw Fail");

        System.out.println("Step 1: Create wallet with 100");
        Walletb5 wallet = new Walletb5("W03", "Summi", 100);

        System.out.println("Step 2: Withdraw 500");
        wallet.withdraw(500);

        System.out.println("Step 3: Display wallet");
        wallet.displayWallet();

        endTest("Withdraw Fail");
    }

    public static void main(String[] args) {
        TestWalletb5 test = new TestWalletb5();

        test.testDeposit();
        System.out.println("----------------------");

        test.testWithdraw();
        System.out.println("----------------------");

        test.testWithdrawFail();
    }
}
