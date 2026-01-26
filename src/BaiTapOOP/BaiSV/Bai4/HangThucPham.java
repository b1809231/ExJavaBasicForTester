package BaiTapOOP.BaiSV.Bai4;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class HangThucPham {
    private final String maHang;
    private String tenHang;
    private double donGia;
    private Date ngaySX;
    private Date ngayHH;

    // Constructor chỉ có mã hàng
    public HangThucPham(String maHang) {
        this.maHang = (maHang == null || maHang.isEmpty()) ? "UNKNOWN" : maHang;
        this.tenHang = "Chưa xác định";
        this.donGia = 1;
        this.ngaySX = new Date();
        this.ngayHH = new Date();
    }

    // Constructor đầy đủ
    public HangThucPham(String maHang, String tenHang, double donGia, Date ngaySX, Date ngayHH) {
        this.maHang = (maHang == null || maHang.isEmpty()) ? "UNKNOWN" : maHang;
        setTenHang(tenHang);
        setDonGia(donGia);
        setNgaySX(ngaySX);
        setNgayHH(ngayHH);
    }

    // Getter / Setter
    public String getMaHang() {
        return maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = (tenHang == null || tenHang.isEmpty()) ? "Chưa xác định" : tenHang;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = (donGia > 0) ? donGia : 1;
    }

    public void setNgaySX(Date ngaySX) {
        this.ngaySX = (ngaySX == null) ? new Date() : ngaySX;
    }

    public void setNgayHH(Date ngayHH) {
        if (ngayHH == null || ngayHH.before(ngaySX))
            this.ngayHH = ngaySX;
        else
            this.ngayHH = ngayHH;
    }

    // Kiểm tra hết hạn
    public boolean isExpired() {
        return ngayHH.before(new Date());
    }

    @Override
    public String toString() {
        NumberFormat nf = NumberFormat.getInstance(new Locale("vi", "VN"));
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

        return "Mã hàng: " + maHang +
                ", Tên hàng: " + tenHang +
                ", Đơn giá: " + nf.format(donGia) +
                ", Ngày SX: " + df.format(ngaySX) +
                ", Ngày HH: " + df.format(ngayHH) +
                ", Hết hạn: " + (isExpired() ? "Có" : "Không");
    }
}
