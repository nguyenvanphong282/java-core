package nhanxuatdatavatoantu;

import java.util.Scanner;

public class LopMath {
    public static void BaiTapHinhTron(double r) {
        double chuVi = 2*Math.PI*r;
        System.out.println("Chu vi hinh tron = "+ chuVi);
        System.out.println("Can bac hai cua ket qua = "+Math.sqrt(chuVi));
        System.out.println("Lam tron den so nguyen gan nhat = "+ Math.round(chuVi));

        double dienTich = Math.PI * Math.pow(r,2);
        System.out.println("Dien tich hinh tron = "+ dienTich);
        System.out.println("Can bac hai cua ket qua dien tich = "+ Math.sqrt(dienTich));
        System.out.println("Lam tron len (tra ve so nguyen nho nhat lon hon hoac bang x) = "+Math.ceil(dienTich));
        System.out.println("Lam tron xuong (tra ve so nguyen lon nhat nho hon hoac bang x) = "+ Math.floor(dienTich));
    }
    public static void BaiTapHinhVuong(double r){
        //tuong tu
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r;
        System.out.print("Nhap r: ");
        r=sc.nextDouble();
        BaiTapHinhTron(r);
        //BaiTapHinhVuong(r);
    }
}
