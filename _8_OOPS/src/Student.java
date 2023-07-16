public class Student {

        String name;
        String stream;
        int rollNumber;
        double percentage;

        String collegeName;
        private int contactNumber;

        //getter
        public int getContactNumber(){
                return contactNumber;
        }

        //setter
        public void setContactNumber(int contact){
                contactNumber=contact;

        }

//         Above setContactNumber can also be done using this keyword
//                       example:-
//               public void setContactNumber(int contactNumber ){
//                this.contactNumber=contactNumber;
//
//        }

        //default constructor
        public Student(){

        }

        //valued constructor
        public  Student(String namee , String streamm, int rollNumberr, double percentagee){
                name=namee;
                stream = streamm;
                rollNumber = rollNumberr;
                percentage = percentagee;
        }

    }


