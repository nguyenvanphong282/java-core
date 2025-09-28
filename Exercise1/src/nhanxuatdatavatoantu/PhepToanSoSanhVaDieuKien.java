package nhanxuatdatavatoantu;

import java.util.Scanner;

public class PhepToanSoSanhVaDieuKien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        System.out.print("Nhap a: ");
        a = sc.nextInt();
        System.out.print("Nhap b: ");
        b = sc.nextInt();

        System.out.println(a +" > "+ b +" : "+ (a>b));
        System.out.println(a +" < "+ b +" : "+ (a<b));
        System.out.println(a +" >= "+ b +" : "+ (a>=b));
        System.out.println(a +" <= "+ b +" : "+ (a<=b));
        System.out.println(a +" = "+ b +" : "+ (a==b));

        System.out.println("----------------------------");
        System.out.println("Ca hai deu la so chan: "+ ((a%2==0) && (b%2==0)));
        System.out.println("Co it nhat mot so chan: "+ ((a%2==0) || (b%2==0)));
    }
}
