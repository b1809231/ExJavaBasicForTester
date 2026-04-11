package BaiTapOOP.BaiTapJavaOOP3.testcases;

import BaiTapOOP.BaiTapJavaOOP3.common.BaseTest;

public class TestCases extends BaseTest {
    public void testLogin() {
        createDriver();

        System.out.println("Step 1: Open browser and go to https://cms.anhtester.com/login");
        System.out.println("Step 2: Enter email: admin@example.com");
        System.out.println("Step 3: Enter password: 123456");
        System.out.println("Step 4: Click Login button");
        System.out.println("Step 5: Verify login success");

        closeDriver();
    }

    public void testAddCategory() {
        createDriver();

        System.out.println("Step 1: Open browser and go to https://cms.anhtester.com/login");
        System.out.println("Step 2: Login with admin account");
        System.out.println("Step 3: Navigate to Category page");
        System.out.println("Step 4: Click Add New Category");
        System.out.println("Step 5: Enter category name: Test Category");
        System.out.println("Step 6: Click Save");
        System.out.println("Step 7: Verify category added successfully");

        closeDriver();
    }
    public static void main(String[] args) {
        TestCases tc = new TestCases();
        tc.testLogin();
        System.out.println("-----------------------");
        tc.testAddCategory();
    }

}
