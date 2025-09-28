package ifforarray;

import java.util.Scanner;

public class BaiTapPTBacHai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a;
        double b;
        double c;
        double x1;
        double x2;
        double delta;
        System.out.print("Nhap a: ");
        a=sc.nextDouble();
        System.out.print("Nhap b: ");
        b=sc.nextDouble();
        System.out.print("Nhap c: ");
        c=sc.nextDouble();
        delta = Math.pow(b,2) - 4*a*c;
        if(a==0){
            System.out.println("Lỗi! Do A = 0");
        }else {
            if(delta<0){
                System.out.println("PT vo nghiem!");
            }else if(delta==0){
                System.out.println("PT nghiem kep!");
                x1=x2=-b/(2*a);
                System.out.println("PT nghiem kep co ket qua la: "+x1);
            }else {
                System.out.println("PT co 2 nghiem phan biet!");
                x1 = (-b-Math.sqrt(delta))/(2*a);
                x2 = (-b+Math.sqrt(delta))/(2*a);
                System.out.println("x1 = "+x1);
                System.out.println("x2 = "+x2);
            }
        }
    }
}
