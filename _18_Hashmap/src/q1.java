import java.util.HashMap;
import java.util.Map;

public class q1 {
    /*
    given an array, find the most frequency element in it. If there are multiple elements that
    appear a maximum number of times, print any one of them.

    INPUT:- n=6 , arr[]={1,3,2,1,4,1}
    OUTPUT:- 1
    * */
    public static void main(String[] args) {
        int arr[]={1,4,2,5,1,4,4,4,6,2,3,4,4,6,10,10,12};

        Map<Integer,Integer>freq=new HashMap<>();

        for(int el : arr){
            if(!freq.containsKey(el)){
                freq.put(el,1);
            }else{
                freq.put(el, freq.get(el)+1);
            }
        }
        System.out.println(freq.entrySet());
        int maxFreq=0, ansKey=-1;
        for (var e :freq.entrySet()){
            if(e.getValue()>maxFreq){
                maxFreq = e.getValue();
                ansKey=e.getKey();
            }
        }
        System.out.println(ansKey+" has the maximum frequency and it occurs "+maxFreq+" times");
        maxFreq=0; ansKey=-1;
        //method 2
        for(var key : freq.keySet()){
            if(freq.get(key) > maxFreq){
                maxFreq = freq.get(key);
                ansKey=key;
            }
        }
        System.out.println(ansKey+" has the maximum frequency and it occurs "+maxFreq+" times");
    }

}
