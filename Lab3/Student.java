package Lab3;

public class Student {
    private String firstName;
    private String lastName;
    private String faculty;
    private double avgMark;
    private int age;
    private int id;

    public Student(String firstName, String lastName, String faculty, double avgMark, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.faculty = faculty;
        this.avgMark = avgMark;
        this.age = age;
        this.id = (int) Math.floor(Math.random() * (1000 - 1 + 1) + 1);
    }

    public String getFirstName() {
        return this.firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getFaculty() {
        return faculty;
    }
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
    public int getAge() {
        return age;
    }
    public double getAvgMark() {
        return this.avgMark;
    }
    public void setAvgMark(double avgMark) {
        this.avgMark = avgMark;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getId() {
        return this.id;
    }
    public void printInfo() {
        System.out.println("Student's first name: " + getFirstName());
        System.out.println("Student's last name: " + getLastName());
        System.out.println("Faculty: " + getFaculty());
        System.out.println("Avg mark: " + getAvgMark());
        System.out.println("Student's age: " + getAge());
        System.out.println("ID: " + getId());
        System.out.println();
    }
}