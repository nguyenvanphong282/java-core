package ifforarray;

import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a;
        float b;
        float c;
        System.out.print("Nhap so a: ");
        a = sc.nextFloat();
        System.out.print("Nhap so b: ");
        b = sc.nextFloat();
        try{
            if(b==0){
                throw new Exception("Khong the chia so b=0! ");
            }
            c = a/b;
            System.out.println("Ket qua khi chia: "+ c);
        }catch (Exception e){
            System.out.println("Error! "+ e.getMessage());
        } finally {
            System.out.println("Finally!"); //luon luon print
        }
    }
}
