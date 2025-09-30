package quanlybophim;

public class Runner {
    public static void main(String[] args) {
        NgayChieu ngayChieu1 = new NgayChieu(1,1,1997);
        NgayChieu ngayChieu2 = new NgayChieu(2,2,1998);
        NgayChieu ngayChieu3 = new NgayChieu(3,3,1990);

        HangSanXuat hangSanXuat1 = new HangSanXuat("Rudkell", "Hoa Ky");
        HangSanXuat hangSanXuat2 = new HangSanXuat("Lindin", "Tay Ban Nha");
        HangSanXuat hangSanXuat3 = new HangSanXuat("KaiCi", "Vuong Quoc Anh");

        BoPhim boPhim1 = new BoPhim("Sieu Xa Thu", ngayChieu1, hangSanXuat1, 2005, 20, 6);
        BoPhim boPhim2 = new BoPhim("Dung Si Dau Bo", ngayChieu2, hangSanXuat2, 2002, 30, 1);
        BoPhim boPhim3 = new BoPhim("Tham Tu Lung Danh", ngayChieu3, hangSanXuat3, 2000, 10, 10);

        System.out.println(boPhim1.giamGia(20));
        System.out.println(boPhim1.tongTien());
        System.out.println(boPhim1.giaSauKhiGiam(20));
        System.out.println("--------------------------------");
        System.out.println(boPhim2.giamGia(20));
        System.out.println(boPhim2.tongTien());
        System.out.println(boPhim2.giaSauKhiGiam(20));
        System.out.println("---------------------------------");
        System.out.println(boPhim3.giamGia(20));
        System.out.println(boPhim3.tongTien());
        System.out.println(boPhim3.giaSauKhiGiam(20));
    }
}
