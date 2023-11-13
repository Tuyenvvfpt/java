import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Student {
    private String code;
    private String name;
    private String address;

    private int age;

    public Student() {
    }

    public Student(String code, String name, String address, int age) {
        this.code = code;
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" + "code='" + code + '\'' + ", name='" + name + '\'' + ", address='" + address + '\'' + ", age=" + age + '}';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> listStudent = new ArrayList<>();

        System.out.print("Class Student. Enter number student: ");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            Student student = new Student();
            System.out.println("Enter student " + (i + 1));
            System.out.print("Enter code " + (i + 1) + " : ");
            student.setCode(scanner.nextLine());
            System.out.print("Enter name " + (i + 1) + " : ");
            student.setName(scanner.nextLine());
            System.out.print("Enter address " + (i + 1) + " : ");
            student.setAddress(scanner.nextLine());
            System.out.print("Enter age " + (i + 1) + " : ");
            student.setAge(Integer.parseInt(scanner.nextLine()));
            listStudent.add(student);
        }

        int count1 = 1;
        for (Student student : listStudent) {
            System.out.println("Infor student " + count1 + " : " + student);
            count1++;
        }

//        Collections.sort(listStudent, (d1, d2) -> {
//            return d1.getCode().compareTo(d2.getCode());
//        });

        Collections.sort(listStudent, (n1, n2) -> {
            return n1.getName().compareTo(n2.getName());
        });

        int count2 = 1;
        for (Student student : listStudent) {
            System.out.println("Infor sorted student " + count2 + " : " + student);
            count2++;
        }

        ////HERE
        System.out.print("Tim kiem ten: ");
        String inputName = scanner.nextLine();
        for (Student student : listStudent) {
            if (inputName.equals(student.getName())) {
                System.out.println("Ton tai ten");
                System.out.println(student.toString());
            } else {
                System.out.println("Ko ton tai ten");
            }
        }

        System.out.print("Tim kiem tuoi: ");
        String inputAge = scanner.nextLine();
        for (Student student : listStudent) {
            if (inputAge == student.getName()) {
                System.out.println("Ton tai tuoi");
                System.out.println(student.toString());
            } else {
                System.out.println("Ko ton tai tuoi");
            }
        }
    }
}
