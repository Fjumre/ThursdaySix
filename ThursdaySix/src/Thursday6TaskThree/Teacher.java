package Thursday6TaskThree;

import java.util.ArrayList;
import java.util.Collection;

public class Teacher extends Person{
    java.util.ArrayList<Integer> canTeach;
    ArrayList<String> currentCourses;
    String course;


    public Teacher(String name) {
        super(name);
        this.canTeach = new ArrayList<>();
        this.currentCourses = new ArrayList<>();
    }

    public Teacher(String name, ArrayList<Integer> canTeach) {
        super(name);
        this.canTeach = canTeach;
        this.currentCourses = new ArrayList<>();
    }

    @Override
    public boolean addCourse(String course){
        this.course = String.valueOf(canTeach);
        return true;
        } Object[currentCourses] toArray(canTeach);
    }
