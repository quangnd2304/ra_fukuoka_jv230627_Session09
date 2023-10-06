package ra.ud;

import java.util.*;

public class StudentImp {
    //Khai báo và khởi tạo danh sách sinh viên
    static List<Student> listStudents = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("**************MENU***************");
            System.out.println("1. Nhập thông tin n sinh viên");
            System.out.println("2. Hiển thị thông tin sinh viên");
            System.out.println("3. Sắp xếp sinh viên theo tuổi giảm dần");
            System.out.println("4. Sắp xếp sinh viên theo tuổi tăng dần");
            System.out.println("5. Sắp xếp sinh viên theo tên giảm dần");
            System.out.println("6. Thoát");
            System.out.print("Lựa chọn của bạn:");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    StudentImp.inputListStudent(scanner);
                    break;
                case 2:
                    StudentImp.displayListStudent();
                    break;
                case 3:
                    StudentImp.sortStudentByAge();
                    break;
                case 4:
                    StudentImp.sortStudentByAge_Comparable();
                    break;
                case 5:
                    StudentImp.sortStudentByName_Comparator();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.err.println("Vui lòng nhập từ 1-4");
            }
        } while (true);
    }

    public static void inputListStudent(Scanner scanner) {
        System.out.println("Nhập số sinh viên cần nhập dữ liệu:");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            //Khởi tạo đối tượng sv cần nhập thông tin
            Student student = new Student();
            student.inputData(scanner);
            //Thêm vào danh sách
            listStudents.add(student);
        }
    }

    public static void displayListStudent() {
        for (Student student : listStudents) {
            student.displayData();
        }
    }

    public static void sortStudentByAge() {
        for (int i = 0; i < listStudents.size() - 1; i++) {
            for (int j = i + 1; j < listStudents.size(); j++) {
                if (listStudents.get(i).getAge() < listStudents.get(j).getAge()) {
                    Student temp = listStudents.get(i);
                    listStudents.set(i, listStudents.get(j));
                    listStudents.set(j, temp);
                }
            }
        }
    }

    public static void sortStudentByAge_Comparable(){
        Collections.sort(listStudents);
    }

    public static void sortStudentByName_Comparator(){
        Collections.sort(listStudents, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getStudentName().compareTo(o1.getStudentName());
            }
        });
    }

    public static void sortStudentByAgeASC_Comparator(){
        Collections.sort(listStudents, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge()-o2.getAge();
            }
        });
    }
}
