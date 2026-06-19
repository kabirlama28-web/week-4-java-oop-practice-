class Patient {
    private String name;
    private int age;

    Patient(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void getTreatmentPlan() {
        System.out.println("General Treatment Plan");
    }

    public String getName() {
        return name;
    }
}

class InPatient extends Patient {
    private int roomNumber;

    InPatient(String name, int age, int roomNumber) {
        super(name, age);
        this.roomNumber = roomNumber;
    }

    @Override
    void getTreatmentPlan() {
        System.out.println("InPatient Room: " + roomNumber);
    }
}

class OutPatient extends Patient {
    private String appointmentDate;

    OutPatient(String name, int age, String appointmentDate) {
        super(name, age);
        this.appointmentDate = appointmentDate;
    }

    @Override
    void getTreatmentPlan() {
        System.out.println("Appointment Date: " + appointmentDate);
    }
}

public class HospitalRecords {
    public static void main(String[] args) {

        Patient p1 = new InPatient("Ram",25,101);
        Patient p2 = new OutPatient("Hari",30,"15 June");

        p1.getTreatmentPlan();
        p2.getTreatmentPlan();
    }
}