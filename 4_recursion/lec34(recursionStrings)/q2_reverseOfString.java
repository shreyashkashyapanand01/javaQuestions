public class q2_reverseOfString {
    static String reverse(String s , int idx){
        //base case
        if(s.length()==idx) return "";

        //recursive work
       String smallAns = reverse(s, idx+1);

        //self work
        return smallAns+s.charAt(idx);

       

    }
    

    public static void main(String[] args) {
        String s = "abcde";

        System.out.println("reverse of the given string is :- "+reverse(s, 0));


        
    }
}
