

class sol{
    static int sum (int array []){
        int ans = -1;

        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i]%2 !=0  && array[j]%2 != 0) {
                    ans = array[i]+ array [j];

                    return ans;
                }
            }
        }
return ans;
    }
}

public class b {
    public static void main(String[] args) {
        // Given an integer array arr, return the number of consecutive sequences(subarrays) with odd sum
        //input :- int array []= {1,3,5}
        //output :- 4;

        int array []= {1,3,5,8,10};


        System.out.println("sum = "+ sol.sum(array));
      
    }
}
