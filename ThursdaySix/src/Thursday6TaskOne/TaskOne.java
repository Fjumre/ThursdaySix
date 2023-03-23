package Thursday6TaskOne;

public class TaskOne {

    public boolean methodA(String input) {
        System.out.println("a");
        if (!input.equals("never")) {
            System.out.println("b");
            methodB("never");
        } else {
            System.out.println("d");
            System.out.println(methodC(input));
        }
        System.out.println("i");
        return false;
    }
    public boolean methodB(String never){
        System.out.println("c");
        return false;
    }
    public int methodC(String input){
        System.out.println("e");
        methodD(input.length());
        return input.length()*2;
    }
    public int methodD(int number){
        System.out.println("f");
        if(number>30){
            System.out.println("g");
        }
        System.out.println("h");
        return number;
    }
}
