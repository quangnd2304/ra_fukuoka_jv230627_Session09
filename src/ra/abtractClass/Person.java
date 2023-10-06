package ra.abtractClass;

public abstract class Person {
    private String id;
    private String name;
    private String age;

    public void inputData(){
        System.out.println("Nhập thông tin người");
    }

    public void displayData(){
        System.out.println("Hiển thị thông tin người");
    }

    //Phương thức trừu tượng
    public abstract void hello();
    public abstract void add(int number1, int number2);
}
