public class b_calling {
    public static void main(String[] args) {
        Student s3=new Student();
        s3.collegeName="KIIT";
        s3.rollNumber=90909;
        System.out.println(s3.collegeName);
        System.out.println(s3.rollNumber); //not initialised so it will print null/default value

        //accessing private by getter
        System.out.println("contactNumber = "+s3.getContactNumber());

        /*  s3.ContactNumber==99999999;
            this is not allowed because contactNumber is private
         */

        //but we can change by writing setter function in student file
        //accessing and changing private method int by setter
        s3.setContactNumber(9999999);
        System.out.println("contactNumber = "+s3.getContactNumber());
    }
}
