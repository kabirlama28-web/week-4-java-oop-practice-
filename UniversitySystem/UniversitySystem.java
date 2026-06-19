class Person {
    private String name;
    private int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void getRoleDetails() {
        System.out.println("Person");
    }

    public String getName() {
        return name;
    }
}

class Student extends Person {
    String program;

    Student(String name, int id, String program) {
        super(name, id);
        this.program = program;
    }

    @Override
    void getRoleDetails() {
        System.out.println("Program: " + program);
    }
}

class Teacher extends Person {
    String subject;

    Teacher(String name, int id, String subject) {
        super(name, id);
        this.subject = subject;
    }

    @Override
    void getRoleDetails() {
        System.out.println("Subject: " + subject);
    }
}

class Admin extends Person {
    String department;

    Admin(String name, int id, String department) {
        super(name, id);
        this.department = department;
    }

    @Override
    void getRoleDetails() {
        System.out.println("Department: " + department);
    }
}

public class UniversitySystem {
    public static void main(String[] args) {

        Person[] people = {
                new Student("Ram",1,"BCSIT"),
                new Teacher("Hari",2,"Java"),
                new Admin("Shyam",3,"Accounts")
        };

        for(Person p : people) {
            p.getRoleDetails();
        }
    }
}