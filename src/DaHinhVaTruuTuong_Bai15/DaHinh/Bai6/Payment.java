package DaHinhVaTruuTuong_Bai15.DaHinh.Bai6;

public class Payment {
//    🔵 Bài 6 – Đa hình + override nâng cao chút
//    Yêu cầu:
//    Class Payment
//    method pay(double amount)
//    Class con:
//    CashPayment
//            CreditCardPayment
//    EWalletPayment
//    Test:
//    Payment p = new CreditCardPayment();
//    p.pay(500000);
//
//
//👉 Mỗi loại thanh toán in ra cách trả tiền khác nhau

    public void pay(double amount){
        System.out.println("Tra" + amount);
    }

}
