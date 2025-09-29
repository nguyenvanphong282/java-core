package classandconstructor;

public class MyDate {
    private int ngay;
    private int thang;
    private int nam;

    public MyDate(int d, int m, int y) {
        this.ngay = d;
        this.thang = m;
        this.nam = y;
    }
    public void printDay() {
        System.out.println("Ngày "+this.ngay);
    }
    public void printMonth() {
        System.out.println("Tháng "+this.thang);
    }
    public void printYear(){
        System.out.println("Năm "+this.nam);
    }
    public void printFull() {
        System.out.println("Ngày "+this.ngay+"/"+this.thang+"/"+this.nam);
    }
}
