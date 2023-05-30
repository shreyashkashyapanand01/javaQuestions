
 class solution
 {
static int repetingValue(int array []){



    for (int i = 0; i < array.length; i++) {
        for (int j = i+1; j < array.length; j++) {
            if(array[i]==array[j]){
              
                return array[i];
            }
        }
    }
    return -1;
}
    
}
public class e_repeatingNum {
    public static void main(String[] args) {
        //find the first repeating number in the given array 

        int array []= {1,2,3,4,1,6,8,4,7,10};
       

        System.out.println("first repeating element in the given array is "+ solution.repetingValue(array));
    }
}
