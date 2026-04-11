package BaiTapOOP.BaiTapJavaOOP4.modelsb4;

//📁 2. Package models
//    🔹 Class Order
//Thuộc tính:
//orderId (String)
//productName (String)
//price (double)
//    👉 Yêu cầu:
//Constructor
//Getter / Setter
//Hàm:
//displayOrder()
//    👉 In ra:
//OrderID: 001
//Product: iPhone
//Price: 1000


public class Orderb4 {
    public String orderId;
    public String productName;
    public double price;

    public Orderb4(String orderId, String productName, double price){
        this.orderId = orderId;
        this.productName = productName;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }


    //displayOrder()
//    👉 In ra:
//OrderID: 001
//Product: iPhone
//Price: 1000

    public void displayOrder(){
        System.out.println("OrderId: " + orderId);
        System.out.println("Product: " + productName);
        System.out.println("Price: "+ price);
    }

}
