package nhanxuatdatavatoantu;

import java.util.Scanner;

public class GanDuLieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        int a = sc.nextInt();
        System.out.print("Nhap b: ");
        int b = sc.nextInt();

        a+=2;
        System.out.println("A + 2 = "+ a);
        b+=2;
        System.out.println("B + 2 = "+b);
        a+=b;
        System.out.println("A + B = "+a);
        a-=b;
        System.out.println("A - B = "+a);
        System.out.println("------------------------");
        a*=2;
        System.out.println("A x 2 = "+a);
        b*=2;
        System.out.println("B x 2 = "+b);
        a+=b;
        System.out.println("A + B = "+a);
        System.out.println("---------------------");
        a/=b;
        System.out.println("A : B = "+a);
        a*=7;
        System.out.println("A x 7 = "+a);
        a%=b;
        System.out.println("A % B = "+a);
    }
}
