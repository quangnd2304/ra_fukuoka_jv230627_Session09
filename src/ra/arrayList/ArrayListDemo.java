package ra.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        //Khởi tạo danh sách từ List Interface và lớp ArrayList
        List<Student> listStudents = new ArrayList<>();
        //add(object o): thêm một phần tử vào cuối danh sách
        Student student1 = new Student("SV001", "Nguyễn Văn A", 24);
        Student student2 = new Student("SV002", "Nguyễn Văn C", 22);
        Student student3 = new Student("SV003", "Nguyễn Văn B", 25);
        listStudents.add(student1);
        listStudents.add(student2);
        listStudents.add(student3);
        //addAll(list): thêm một danh sách vào danh sách hiện tại
        List<Student> listStudentNew = new ArrayList<>();
        Student student4 = new Student("SV004", "Nguyễn Văn D", 20);
        listStudentNew.add(student4);
        listStudentNew.addAll(listStudents);
        //clear(): Xóa hết dữ liệu trong danh sách:
        listStudentNew.clear();
        //contains(object o): Kiểm tra đối tượng o có trong danh sách hay không --> true: có - false: không
        System.out.println("Kiểm tra sinh viên 1 có trong listStudents hay không: "+listStudents.contains(student1));
        //isEmpty(): Kiểm tra danh sách có phần tử hay không --> true: có - false: không
        System.out.println("Kiểm tra danh sách listStudents có phần tử hay không: "+listStudents.isEmpty());
        //remove(Object o): xóa phần tử o trong danh sách
        listStudents.remove(student2);
        //remove(int index): xóa phần tử theo chỉ số của phần tử
        listStudents.remove(0);
        //size(): trả ra số phần tử của danh sách
        System.out.println("Số phần tử của listStudents: "+listStudents.size());
        //add(int index, Object o): Thêm một phần tử vào chỉ số index
        listStudents.add(0,student4);
        //get(int index): lấy phần tử tại chỉ số index
        System.out.println("Sinh viên tại chỉ số 1 là: "+listStudents.get(1).toString());
        //set(int index, Object o): Đè đối tượng o vào chỉ số index
        listStudents.set(0,student1);
        //In ra thông tin sinh viên
        System.out.println("Danh sách sinh vên của listStudent:");
        for (Student student : listStudents) {
            System.out.println(student.toString());
        }
        System.out.println("Danh sách sinh viên của listStudentNew:");
        for (Student student : listStudentNew) {
            System.out.println(student.toString());
        }
    }
}
