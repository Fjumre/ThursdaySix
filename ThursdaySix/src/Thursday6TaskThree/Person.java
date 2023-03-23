package Thursday6TaskThree;

public class Person {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name) {
        this.name = name;
    }

    public boolean addCourse(String course) {
        return true;
        //Eller kan skrives som: public abstract boolean addCourse(String course);
    }
}
