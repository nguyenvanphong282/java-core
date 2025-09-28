package nhanxuatdatavatoantu;

import java.util.Scanner;

public class PhepToanCoBan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        int a = sc.nextInt();
        System.out.print("Nhap b: ");
        int b = sc.nextInt();

        int tong = a+b;
        System.out.println("Tong cua "+a+" va "+b+" la: " +tong);

        int hieu = a-b;
        System.out.println("Hieu cua "+a+" va "+b+" la: "+ hieu);

        int nhan = a*b;
        System.out.println(a+ " x "+b+" = "+nhan);

        int chiaNguyen = a/b;
        System.out.println(a+" : "+b+" = "+chiaNguyen);

        float chiaNguyen2 = (float)a/b;
        System.out.println(a+" : "+b+" = "+chiaNguyen2);

        int chiaDu = a%b;
        System.out.println(a+" % "+b +" = "+ chiaDu);
    }
}
