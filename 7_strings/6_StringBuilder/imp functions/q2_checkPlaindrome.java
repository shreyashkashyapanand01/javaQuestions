//check a string is palindrome or not

public class q2_checkPlaindrome {
    public static void main(String[] args) {
        String str = "shreYASH";
        String str1 = "nayanx";

        int i =0, j=str1.length()-1;
        boolean flag = true;
        while(i<j){
            if(str1.charAt(i)!=str1.charAt(j)){
                flag = false;
                break;
            }
            i++;j--;
        }

        if(flag==true){
             System.out.println("palindrome");
        }
        else{System.out.println("not palindrome");
    }
    }
}