package nhanxuatdatavatoantu;

import java.util.Scanner;

public class NhanDataTuBanPhim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ho va ten: ");
        String fullName = sc.nextLine();

        System.out.println("Nhap tuoi cua ban: ");
        int age = sc.nextInt();

        System.out.println("Nhap can nang: ");
        double weight = sc.nextDouble();

        System.out.println("Nhap MSSV: ");
        long student_id = sc.nextLong();

        System.out.println(fullName);
        System.out.println(age);
        System.out.println(weight);
        System.out.println(student_id);
    }
}
