package quanlysinhvien;

public class SinhVien {
    private String hoTen;
    private String mssv;
    private NgaySinh ngaySinh;
    private LopHoc lopHoc;
    private String gioiTinh;
    private double diemTrungBinh;

    public SinhVien(String hoTen, String mssv, NgaySinh ngaySinh, LopHoc lopHoc, String gioiTinh, double diemTrungBinh) {
        this.hoTen = hoTen;
        this.mssv = mssv;
        this.ngaySinh = ngaySinh;
        this.lopHoc = lopHoc;
        this.gioiTinh = gioiTinh;
        this.diemTrungBinh = diemTrungBinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public NgaySinh getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(NgaySinh ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public LopHoc getLopHoc() {
        return lopHoc;
    }

    public void setLopHoc(LopHoc lopHoc) {
        this.lopHoc = lopHoc;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    public void hocLuc(){
        if (this.diemTrungBinh >= 3.5 && this.diemTrungBinh <=4) {
            System.out.println("Gioi!");
        } else if (this.diemTrungBinh >= 2.5 && this.diemTrungBinh <=3.4) {
            System.out.println("Kha!");
        } else if (this.diemTrungBinh >= 2.0 && this.diemTrungBinh <=2.4) {
            System.out.println("Trung Binh!");
        } else {
            System.out.println("Hoc Lai!");
        }
    }
}
