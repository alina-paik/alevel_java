package ua.paik.hw8;

class Student {
    public String firstName;
    public String lastName;
    public String group;
    public double averageMark;

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public double getScholarship() {
        return (averageMark == 5) ? 100 : 80;
    }
}
class Aspirant extends Student {
    public String scientificWork;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String scientificWork) {
        super(firstName, lastName, group, averageMark);
        this.scientificWork = scientificWork;
    }

    @Override
    public double getScholarship() {
        return (averageMark == 5) ? 200 : 180;
    }
}

public class ScholarshipExample {
    public static void main(String[] args) {
        Student student = new Student("Ann", "Smith", "GroupA", 4.5);
        Aspirant aspirant = new Aspirant("Bob", "Bob", "GroupB", 5, "Documentation work");

        Student[] students = {student, aspirant};

        for (Student s : students) {
            System.out.println(s.getScholarship());
        }
    }
}
