//package lec17(problemsOnArray-2);

class sol {
    static void print (int [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ " ");
        }
    }
}

public class b_reverseArray {
    public static void main(String[] args) {
        int array [] = {1,2,3,4,5,6};
System.out.print("original array :- ");
        sol.print(array);
        int n = array.length;
        int reverseArray []= new int [n];

        for (int i = 0; i < n; i++) 
        {
            reverseArray[n-1-i]=array[i]; 
        }
System.out.print(" reverse array :- ");
sol.print(reverseArray);
    }
}
