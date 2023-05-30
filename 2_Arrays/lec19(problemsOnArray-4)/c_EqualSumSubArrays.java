import java.util.Scanner;

public class c_EqualSumSubArrays {
   static void takeinput (int arr[]){
        for (int i = 0; i < arr.length; i++) {
            Scanner sc = new Scanner(System.in);
            arr[i]=sc.nextInt();
        }
    }

  static  void print (int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

 static  int findArraySum(int arr[]){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }

    static boolean EqualSumPartition(int arr[]){

        int totalSum = findArraySum(arr);
        int prefSum =0;

        for (int i = 0; i < arr.length; i++) {
            prefSum+=arr[i];
            int suffixSum =totalSum-prefSum;
            if (suffixSum==prefSum) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println("enter the size of the array :-");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("entr the elements of the array :- ");
        int arr []= new int [n];
        takeinput(arr);

        System.out.println("original array :- ");
        print(arr);

        System.out.print("\nis equal prtittion into two arrays possible? ");
        System.out.println("\n"+EqualSumPartition(arr));
    }
}
