class student {

    String name;
    int rollNumber ;       
}

public class q1 {
    public static void main(String[] args) {
        //Create a class named 'Student'
        // with String variable 'name' and integer
        // variable 'roll_no'. 
        //Assign the value of roll_no as '2' and that 
        //of name as "John" by creating an object of the 
        //class Student.

        student s = new student();
        s.name="shreyash kashyap";
        s.rollNumber=22051797;

        System.out.println("student roll number is "+ s.rollNumber+" student name is "+s.name);
    }
}
