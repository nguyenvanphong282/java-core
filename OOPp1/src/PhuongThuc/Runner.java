package PhuongThuc;

public class Runner {
    public static void main(String[] args) {
        HoaDonCaPhe hoaDonCaPhe1 = new HoaDonCaPhe("Ca Phe Sai Gon", 500, 2);
        HoaDonCaPhe hoaDonCaPhe2 = new HoaDonCaPhe("Ca Phe Trung Nguyen", 500, 2);
        System.out.println("Gia hoa don ca pha cua khach hang 1 la: "+hoaDonCaPhe1.tinhTongTien());
        System.out.println("Gia hoa don ca pha cua khach hang 2 la: "+hoaDonCaPhe2.tinhTongTien());
        System.out.println("------------------");
        System.out.println("Check khoi luong ca phe cua hoa don 1: "+hoaDonCaPhe1.kiemTraKhoiLuongCaPhe(20));
        System.out.println("Check khoi luong ca phe cua hoa don 2: "+hoaDonCaPhe2.kiemTraKhoiLuongCaPhe(1));
        System.out.println("-------------------");
        System.out.println("Check tong tien lon hon 500k: "+hoaDonCaPhe1.tongTienLonHon(500));
        System.out.println("Check tong tien lon hon 600k: "+hoaDonCaPhe2.tongTienLonHon(60));
        System.out.println("--------------------");
        System.out.println("Quy khach duoc giam: "+hoaDonCaPhe1.giamGiaCaPhe(20));
        System.out.println("Quy khach thu 2 duoc giam: "+ hoaDonCaPhe2.giamGiaCaPhe(30));
        System.out.println("---------------------");
        System.out.println("Gia khach hang thu nhat sau khi giam gia la: "+hoaDonCaPhe1.giaSauKhiGiam(20));
        System.out.println("Gia khach hang thu hai sau khi giam gia la: "+hoaDonCaPhe2.giaSauKhiGiam(30));
    }
}
