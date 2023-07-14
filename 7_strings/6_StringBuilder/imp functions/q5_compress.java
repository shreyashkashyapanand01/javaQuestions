/*teh string should be compressed such that consecutive
 * duplicates of charachters are replaced with the charachter and
 * followed by the number of consecutive duplicates.
 * 
 * input:- aaabbbccddde
 * output:- a3b4c23e
 */

public class q5_compress {
    public static void main(String[] args) {
        String str = "aaabbbccdddee";
        System.out.println(str);
        String ans = ""+str.charAt(0);
        int count =1;
        for(int i = 1 ; i<str.length(); i++){
            char curr=str.charAt(i);
            char prev = str.charAt(i-1);
            if(curr==prev){
                count ++;
            }else{
                if(count>1) 
                ans+=count;
                count = 1;
                ans += curr;
            }
        }

    if(count>1) ans+= count;
        System.out.println(ans);
    }
}
