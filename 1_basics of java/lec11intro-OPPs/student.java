import javax.management.ObjectName;

public class student {
    int rollNo;
  
    String studentName;

    public static void main(String[] args) {
        
        student object1 = new student();

        object1.rollNo = 1 ;
        object1.studentName="shreyash";

        System.out.println(object1.rollNo);
        System.out.println(object1.studentName);

        System.out.println();
        
        student object2 = new student();

        object2.rollNo = 10 ;
        object2.studentName="shreyash kashyap";

        System.out.println(object2.rollNo);
        System.out.println(object2.studentName);
    }
}
