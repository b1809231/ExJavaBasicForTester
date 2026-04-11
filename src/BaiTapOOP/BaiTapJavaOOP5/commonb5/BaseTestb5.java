package BaiTapOOP.BaiTapJavaOOP5.commonb5;

public class BaseTestb5 {
//    Tạo 2 hàm:
//    startTest(String testName)
//    endTest(String testName)
//    👉 In:
//
//    Start Test: Deposit
//    Currency: VND

    public String testName = "Deposit";


    public void startTest(String testName){
        System.out.println("Start Test " + testName);
        System.out.println("Currency: " + Constantsb5.currency);
    }

    public void endTest(String testName){
        System.out.println("End Test "+ testName);
    }
}
