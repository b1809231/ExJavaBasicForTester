package BaiTapOOP.BaiTapJavaOOP4.commonb4;
// 🔹 Class BaseTest
//Hàm:
//startTest(String testName)
//endTest(String testName)
// 👉 Yêu cầu:
//In:
//Start Test: Login Test
//App: Order System
//Và:
//End Test: Login Test

public class BaseTestb4 {

    public void startTest(String testName){
        System.out.println("Start Test" +testName);
        System.out.println("App: " +Contantsb4.appName);
    }

    public void endTest(String testName){
        System.out.println("End Test: "+ testName);
    }

}
