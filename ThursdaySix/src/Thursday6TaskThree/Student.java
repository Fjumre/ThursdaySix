package Thursday6TaskThree;

import java.util.ArrayList;

public class Student extends Person {
    ArrayList<String> passedCourses;
    ArrayList<String> currentCourses;
    String course;

    public Student(String name) {
        super(name);
        this.passedCourses = new ArrayList<>();
        this.currentCourses = new ArrayList<>();
    }

    public Student(String name, ArrayList<String> passedCourses) {
        super(name);
        this.passedCourses = passedCourses;
        this.currentCourses = new ArrayList<>();
    }

    @Override
    public boolean addCourse(String course) {
        this.course = String.valueOf(passedCourses);
        return false;
    }
}
