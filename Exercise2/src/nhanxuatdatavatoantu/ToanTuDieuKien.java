package nhanxuatdatavatoantu;

import java.util.Scanner;

public class ToanTuDieuKien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        String b;
        System.out.print("Nhap a: ");
        a=sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap chuoi String b: ");
        b=sc.nextLine();

        String ketQua = (a%2==0)?"Dung":"Sai";
        int kq1 = (a%2==1)?1:0;
        String kq2 = (b.equals("Hello")?"Yes":"No");
        System.out.println("Ket qua cua ketQua: "+ketQua);
        System.out.println("Ket qua cua kq1 la: "+kq1);
        System.out.println("Ket qua cua kq2 la: "+kq2);
    }
}
