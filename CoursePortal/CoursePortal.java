class Course {
    private String title;
    private int duration;
    private String instructor;

    Course(String title, int duration, String instructor) {
        this.title = title;
        this.duration = duration;
        this.instructor = instructor;
    }

    void getCourseInfo() {
        System.out.println(title + " by " + instructor);
    }
}

class LiveCourse extends Course {
    String scheduleTime;

    LiveCourse(String title, int duration, String instructor, String scheduleTime) {
        super(title, duration, instructor);
        this.scheduleTime = scheduleTime;
    }

    @Override
    void getCourseInfo() {
        System.out.println("Live Course at " + scheduleTime);
    }
}

class RecordedCourse extends Course {
    int videoCount;

    RecordedCourse(String title, int duration, String instructor, int videoCount) {
        super(title, duration, instructor);
        this.videoCount = videoCount;
    }

    @Override
    void getCourseInfo() {
        System.out.println("Recorded Course Videos: " + videoCount);
    }
}

public class CoursePortal {
    public static void main(String[] args) {

        Course c1 = new LiveCourse("Java",30,"Ram","7 PM");
        Course c2 = new RecordedCourse("Python",25,"Hari",50);

        c1.getCourseInfo();
        c2.getCourseInfo();
    }
}