package BaiTapOOP.BaiTapJavaOOP4.testcasesb4;


//📁 3. Package testcases
//    🔹 Class TestOrder (extends BaseTest)
//    🧪 TC01 - Create Order
//    - startTest("Create Order")
//
//    - Tạo object Order
//    - Gán dữ liệu
//    - Gọi displayOrder()
//
//    - endTest("Create Order")
//    🧪 TC02 - Update Order
//    - startTest("Update Order")
//
//    - Tạo Order
//    - Update productName
//    - In lại thông tin
//
//    - endTest("Update Order")

import BaiTapOOP.BaiTapJavaOOP4.commonb4.BaseTestb4;
import BaiTapOOP.BaiTapJavaOOP4.modelsb4.Orderb4;

public class TestOrder extends BaseTestb4 {

   //TC1
    public void testCreateOrder(){
        startTest("Create Order");

        System.out.println("Step 1: Create Order Object");
        Orderb4 Order = new Orderb4("001", "iPhone", 1000);
        System.out.println("Step 2: Display Order ");
        Order.displayOrder();

        endTest("Create Order");
    }

    //TC2
    public void testUpdateOrder(){
        startTest("Update Order");

        System.out.println("Step 1: Create Order Object");
        Orderb4 Order1 = new Orderb4("002", "iPhone", 6000);
        System.out.println("Step 2: Update Product Name ");
        Order1.setProductName("SamSung S24");
        System.out.println("Step 3: Display Update Order ");
        Order1.displayOrder();

        endTest("Update Order");
    }

    public static void main(String[] args) {

        TestOrder test = new TestOrder();
        test.testCreateOrder();
        System.out.println("-------");
        test.testUpdateOrder();

    }


}
