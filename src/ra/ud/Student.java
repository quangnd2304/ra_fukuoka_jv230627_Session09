package ra.ud;

import java.util.Scanner;

public class Student implements IStudent,Comparable<Student> {
    private String studentId;
    private String studentName;
    private int age;
    private boolean sex;

    public Student() {
    }

    public Student(String studentId, String studentName, int age, boolean sex) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.sex = sex;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    @Override
    public void inputData(Scanner scanner) {
        System.out.println("Nhập vào mã sinh viên:");
        this.studentId = scanner.nextLine();
        System.out.println("Nhập vào tên sinh viên:");
        this.studentName = scanner.nextLine();
        System.out.println("Nhập vào tuổi sinh viên:");
        this.age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào giới tính:");
        this.sex = Boolean.parseBoolean(scanner.nextLine());
    }

    @Override
    public void displayData() {
        System.out.printf("Mã SV: %s - Tên SV: %s - Tuổi: %d - Giới tính: %b\n", this.studentId, this.studentName, this.age, this.sex);
    }

    @Override
    public int compareTo(Student o) {
        //Cài đặt theo tuổi tăng dần
//        if (this.age>o.getAge()){
//            return 1;
//        }else if(this.age==o.getAge()){
//            return 0;
//        }else{
//            return -1;
//        }
        return this.getAge()-o.getAge();
    }
}
