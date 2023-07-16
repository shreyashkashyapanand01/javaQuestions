import java.util.Scanner;


public class a_intro {

    static void change(Student s){
        s.name="akshay";
        s.rollNumber=21212;
        s.stream="mba";
        s.percentage=1000;
    }

    static void print(Student s){
        System.out.println(s.name);
        System.out.println(s.rollNumber);
        System.out.println(s.stream);
        System.out.println(s.percentage);
    }
    public static void main(String[] args){
        Student s=new Student();
        s.name="shreyash";
        s.stream="btech";
        s.rollNumber=22051797;
        s.percentage=90;
        s.collegeName=("kalinga instiute of industrial technology");

        System.out.println("before changing");
        print(s);
        System.out.println("after changing");
        //updation
        change(s);
        print(s);

        System.out.println(s.collegeName);
    }
}
