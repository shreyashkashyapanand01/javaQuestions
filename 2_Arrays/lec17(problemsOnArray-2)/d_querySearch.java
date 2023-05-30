import java.util.Scanner;

public class d_querySearch {

   public static int[] makeFrequencyArray(int [] array){
        int[] freq = new int [100001]; //size of int

        for (int i = 0; i < array.length; i++) {
            freq[array[i]]++;  // freq[arr[i]]=frq[arr[i]]+1
        }
        return freq;
        
   }


    public static void main(String[] args) {
        
        System.out.print("enter the size of the array :- ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int array []= new int [n];
        
        System.out.print("\n Enter the elements of the array :- ");

        for (int i = 0; i < n; i++) {
            array[i]=sc.nextInt();
        }
        
        int [] freq = makeFrequencyArray(array);

        System.out.print("\n Enter number of queries :- ");
        int q = sc.nextInt();

        while (q>0) {
            System.out.print("Enter number to be searched :- ");
            int x = sc.nextInt();

            if(freq [x] >0){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
            q--;
        }
    }
}

