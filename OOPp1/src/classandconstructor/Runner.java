package classandconstructor;

public class Runner {
    public static void main(String[] args) {
        MyDate myDate = new MyDate(28,2,2005);
        myDate.printDay();
        myDate.printMonth();
        myDate.printYear();
        myDate.printFull();
    }
}
