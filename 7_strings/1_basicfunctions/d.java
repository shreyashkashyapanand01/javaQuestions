public class d {
    public static void main(String[] args) {
        String s1="hello"; 
        String s3 ="hello";
        String s4 =new String("hello");

        System.out.println(s1==s3);  //true
        System.out.println(s1==s4);  //false                                    

        System.out.println();
        // == sirf addres ko dekhta hai
        // .equals address aur har ek char ko v check karta hai
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
    }
}
