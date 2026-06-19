class Student {
    private String name;
    private int rollNumber;
    private int[] marks;

    Student(String name, int rollNumber, int[] marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    double calculateAverage() {
        int sum = 0;

        for (int mark : marks) {
            sum += mark;
        }

        return (double) sum / marks.length;
    }

    public String getName() {
        return name;
    }
}

class GraduateStudent extends Student {
    private String thesisTopic;

    GraduateStudent(String name, int rollNumber, int[] marks, String thesisTopic) {
        super(name, rollNumber, marks);
        this.thesisTopic = thesisTopic;
    }

    void printThesisTitle() {
        System.out.println("Thesis Topic: " + thesisTopic);
    }
}

public class GradeBook {
    public static void main(String[] args) {
        Student s1 = new Student("Ram", 1, new int[]{70,80,90});

        GraduateStudent s2 = new GraduateStudent(
                "Hari",
                2,
                new int[]{85,90,95},
                "Artificial Intelligence"
        );

        System.out.println(s1.calculateAverage());
        System.out.println(s2.calculateAverage());

        s2.printThesisTitle();
    }
}