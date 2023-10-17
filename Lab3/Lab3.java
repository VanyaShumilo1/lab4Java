package Lab3;

import java.util.Scanner;
import java.util.Vector;
import java.util.Collections;
import java.util.Comparator;

public class Lab3 {
    public static void lab3() {
        Scanner sc = new Scanner(System.in);

        Vector<Student> students = new Vector<Student>();

        while (true) {
            System.out.println("1: Add student");
            System.out.println("2: Print students");
            System.out.println("3: Most successful student");
            System.out.println("4: Find by faculty");
            System.out.println("5: Delete student by id");
            System.out.println("6: Exit\n");

            String operation = sc.nextLine();
            if (operation.equals("1")) {
                System.out.println("First name: ");
                String firstName = sc.nextLine();
                System.out.println("Lastname: ");
                String lastName = sc.nextLine();
                System.out.println("Faculty: ");
                String faculty = sc.nextLine();
                System.out.println("Avg mark: ");
                double avgMark = Double.parseDouble(sc.nextLine());
                System.out.println("Age: ");
                int age = Integer.parseInt(sc.nextLine());
                Student student = new Student(firstName, lastName, faculty, avgMark, age);
                students.add(student);
            } else if (operation.equals("2")) {
                for (Student student : students) {
                    student.printInfo();
                }
            } else if (operation.equals("3")) {
                Comparator<Student> scoreComparator = Comparator.comparingDouble(Student::getAvgMark);
                Student mostSuccessfulStudent = Collections.max(students, scoreComparator);
                mostSuccessfulStudent.printInfo();
            } else if (operation.equals("4")) {
                System.out.println("Enter faculty: ");
                String faculty = sc.nextLine();
                for (Student student : students) {
                    if (student.getFaculty().equals(faculty)) {
                        student.printInfo();
                    }
                }
            } else if (operation.equals("5")) {
                System.out.println("Enter id: ");
                int id = Integer.parseInt(sc.nextLine());
                int cur = 0;
                for (Student student : students) {
                    if (student.getId() == id) {
                        students.remove((cur));
                        break;
                    }
                    cur++;
                }
            } else if (operation.equals("6")) {
                break;
            }
        }
    }
}