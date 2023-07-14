
/**
 * given a string s,return the numeber of palindrome sunstrings in it
 * input:- s="abc"
 * output:- 3
 */
public class q3_substringPlaindrome {

    static boolean isPalindrome(String s ){
        int i =0 , j=s.length()-1;
        while(i<j){
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;j--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "nitin";
        int count =0;
        for(int i = 0 ; i<s.length();i++){
            for(int j=i+1 ; j<=s.length();j++){
                if(isPalindrome(s.substring(i,j))==true){
                    System.out.println(s.substring(i, j)+" ");
                    count ++;
                }
            }
        }
    }
}
