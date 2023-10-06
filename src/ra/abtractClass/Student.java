package ra.abtractClass;

public class Student extends Person{

    @Override
    public void hello() {
        System.out.println("Phương thức triển khai của phương thức trừu tượng Person");
    }

    @Override
    public void add(int number1, int number2) {
        System.out.println("Phương thức triển khai của phương thức trừu tượng Person");
    }
}
