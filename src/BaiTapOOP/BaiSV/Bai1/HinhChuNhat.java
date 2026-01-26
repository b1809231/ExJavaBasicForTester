package BaiTapOOP.BaiSV.Bai1;

public class HinhChuNhat {
//    Bài 1:Viết chương trình tính diện tích, chu vi hình chữ nhật.
//        - Hãy viết lớp HinhChuNhat gồm có: Attributes : chiều dài, chiều rộng.
//        - Phương thức thiết lập (set), và lấy (get) thông tin chiều dài, chiều rộng.
//        - Phương thức tính diện tích, chu vi. Phương thức toString gồm các thông tin dài, rộng,
//        diện tích, chu vi.
//        - Xây dựng lớp chứa hàm main cho phần kiểm nghiệm. Dài rộng có thể nhập từ bàn phím

    private float cd;
    private float cr;

    public float getCd() {
        return cd;
    }

    public void setCd(float cd) {
        this.cd = cd;
    }

    public float getCr() {
        return cr;
    }

    public void setCr(float cr) {
        this.cr = cr;
    }

    public float DienTich(){
        return cd*cr;
    }

    public float ChuVi(){
        return (cd+cr)*2;
    }

    @Override
    public String toString(){
        return"Chiều dài: " + cd+
                ", Chiều rộng: " + cr+
                ", Diện tích: " + DienTich() +
                ", Chu vi: " + ChuVi();
    }
}
