/**
 * example1
 */
public class example1 {
    static boolean binarySearch(int arr[], int target){
        int n = arr.length;
        int start = 0 , end=n-1;

        while(start<=end){
            int mid=(start+end)/2;
            if(target==arr[mid]) 
            {return true;}
            else if(target<=arr[mid]){
                end = mid-1; //target se chota hai to left side move karenge
            }else{
                start=mid+1;  //target se bada hai to right side move karenge
            }
        }
        return false; //element nhi mila last tak to false
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
       
        int target=0;
        while(target !=11){
             System.out.printf("is %d exists in the given array = %b \n",target,binarySearch(arr, target));
             target++;
        }

    }
}