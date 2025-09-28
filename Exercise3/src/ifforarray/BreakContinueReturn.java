package ifforarray;

public class BreakContinueReturn {
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <=10; j++) {
                if(j>5)break;//continue, return
                System.out.println(i + " x " + j + " = " + (i*j));
            }
            System.out.println("Bang cuu chuong " + i);
        }
        System.out.println("Break!");
//        int a = 10;
//        for (int i = 0; i <= a; i++) {
//            if(i>5)break;
//            System.out.println("I = A = "+i);
//        }
//        System.out.println("Hello");
    }
}
