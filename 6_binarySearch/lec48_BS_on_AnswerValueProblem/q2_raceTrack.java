public class q2_raceTrack {

    static boolean isPossible(int a[], int k, int dist){
        int kidsPlaced=1;
        int lastKid=a[0];

        for(int i=0; i<a.length;i++){
            if(a[i]-lastKid>=dist){
                kidsPlaced++;
                lastKid=a[i];
            }
        }return kidsPlaced>=k;
    }
    
    static int raceTrack(int a[], int k){
        if (k>a.length) return-1;

        int st=0, end=(int)1e9;
        int ans=-1;

        while(st<=end){
            int mid =st+(end-st)/2;

            if(isPossible(a, k, mid)){
                ans=mid;
                st=mid+1;
            }else{
                end=mid-1;
            }
        }return ans;
    }

    public static void main(String[] args) {
        int arr[]={1,2,4,8,9};
        int kids=2;

        System.out.println("\nmaximum-minimum distance between two kids on the race track will be = "+raceTrack(arr, kids));
        System.out.println();
    }
}
