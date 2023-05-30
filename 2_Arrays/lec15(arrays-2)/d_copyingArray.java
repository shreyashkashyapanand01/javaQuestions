import java.util.Arrays;

//package 0revision(Arrays).lec15(arrays-2);

public class d_copyingArray {
    public static void main(String[] args) {
        int a []= {1,2,3,4,5};
        int b []= Arrays.copyOf(a,a.length);
        b[0]=0;
        b[1]=4;
        b[2]=0;

        System.out.println("original array is :- ");
        for(int i = 0 ; i<a.length;i++){
            System.out.print(a[i]+" ");
        }
System.out.println();
        System.out.println("copied array is :- ");
        for(int i = 0 ; i<a.length;i++){
            System.out.print(b[i]+" ");
        }
    }

}
