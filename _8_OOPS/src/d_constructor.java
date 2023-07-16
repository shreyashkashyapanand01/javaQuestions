public class d_constructor {
    public static void main(String[] args) {
        /*
         * instead of writing s1.rollNumber
         * s1.name
         * s1.collegeName
         *
         * we can write it as below
         *
         * MJA HII AA JAEGA
         *
         * note:- we have to write constructor code in Student1.file
         * */


        Student1 s1 = new Student1("shreyash","btech",3333);
        System.out.println(s1.name);
        //i can even change my name later
        s1.name="akshay";
        System.out.println(s1.name);
        System.out.println(s1.stream);
        System.out.println(s1.rollNumber);
        s1.percentage=90.99; //note :- i haven't declared it above function, i declared it now , we can also do this
        System.out.println(s1.percentage);



        //use of final keywords datatype can't be changed later
        //for example
        //  s1.college="kiit";--> //this is not allowed because i have used final keyword int the student1 class

        System.out.println(s1.college);  //this is always be same --> kiit
    }
}
