package BaiTapOOP.BaiTapJavaOOP3.common;

public class BaseTest {
    //- Tại package "common" :
//        + Tạo class "Constants" lưu các thông tin dạng static:
//        browser (String), report (boolean), headless (boolean)
//	+ Tạo class "BaseTest" để tạo hàm createDriver và closeDriver



    public void createDriver(){
        System.out.println("Create browser" + Constants.browser);
        System.out.println("Create report " + Constants.report);
        System.out.println("Create headless" + Constants.haedless);
        System.out.println("Open browser manually...");
    }
    public void closeDriver() {
        System.out.println("Closed browser: " + Constants.browser);
    }
}
