package PhuongThuc;

public class HoaDonCaPhe {
    private String tenLoaiCaPhe;
    private float giaTien1Kg;
    private float khoiLuong;

    public HoaDonCaPhe(String tenLoaiCaPhe, float giaTien1Kg, float khoiLuong) {
        this.tenLoaiCaPhe = tenLoaiCaPhe;
        this.giaTien1Kg = giaTien1Kg;
        this.khoiLuong = khoiLuong;
    }
    public float tinhTongTien(){
        return this.giaTien1Kg*this.khoiLuong;
    }
    public boolean kiemTraKhoiLuongCaPhe(float kl){
        return this.khoiLuong > kl;
    }
    public boolean tongTienLonHon(float mucTieu){
        return this.tinhTongTien() > mucTieu;
    }
    public float giamGiaCaPhe(float chiSo){
        if(this.tinhTongTien() > 500){
            return (chiSo/100) * this.tinhTongTien();
        }else {
            return 0;
        }
    }
    public float giaSauKhiGiam(float chiSo){
        return this.tinhTongTien() - this.giamGiaCaPhe(chiSo);
    }
}
