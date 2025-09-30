package quanlybophim;

public class BoPhim {
    private String tenPhim;
    private NgayChieu ngayChieu;
    private HangSanXuat hangSanXuat;
    private int namSanXuat;
    private double giaVe;
    private int soLuongVe;

    public BoPhim(String tenPhim, NgayChieu ngayChieu, HangSanXuat hangSanXuat, int namSanXuat, double giaVe, int sl) {
        this.tenPhim = tenPhim;
        this.ngayChieu = ngayChieu;
        this.hangSanXuat = hangSanXuat;
        this.namSanXuat = namSanXuat;
        this.giaVe = giaVe;
        this.soLuongVe = sl;
    }

    public String getTenPhim() {
        return tenPhim;
    }

    public void setTenPhim(String tenPhim) {
        this.tenPhim = tenPhim;
    }

    public NgayChieu getNgayChieu() {
        return ngayChieu;
    }

    public void setNgayChieu(NgayChieu ngayChieu) {
        this.ngayChieu = ngayChieu;
    }

    public HangSanXuat getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(HangSanXuat hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public double getGiaVe() {
        return giaVe;
    }

    public void setGiaVe(double giaVe) {
        this.giaVe = giaVe;
    }

    public int getSoLuongVe() {
        return soLuongVe;
    }

    public void setSoLuongVe(int soLuongVe) {
        this.soLuongVe = soLuongVe;
    }

    public double tongTien(){
        return this.giaVe *  this.soLuongVe;
    }

    public double giamGia(double chiSo){
        if(this.giaVe > 5){
            return this.giaVe * (chiSo/100);
        }else {
            return 0;
        }
    }

    public double giaSauKhiGiam(double chiSo){
        return this.tongTien() - this.giamGia(chiSo);
    }
}
