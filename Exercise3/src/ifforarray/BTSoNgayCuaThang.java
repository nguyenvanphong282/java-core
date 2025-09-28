package ifforarray;

import java.util.Scanner;

public class BTSoNgayCuaThang {
    public static void main(String[] args) {
        int thang;
        int nam;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap thang: ");
        thang = sc.nextInt();
        System.out.print("Nhap nam: ");
        nam = sc.nextInt();

        switch (thang){
            case 2:
                if((nam%4==0 && nam%100!=0) || (nam%400==0)){
                    System.out.println("Có 29 ngày!");
                }else {
                    System.out.println("Có 28 ngày!");
                }
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Có 31 ngày!");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Có 30 ngày!");
                break;
            default:
                System.out.println("Lỗi input!");
        }
    }
}
