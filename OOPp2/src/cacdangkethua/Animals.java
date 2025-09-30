package cacdangkethua;

public class Animals {
    private String name;

    public Animals(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println("an an an an an an ....");
    }

    public void sleep() {
        System.out.println("kho kho kho kho kho ....");
    }
}
