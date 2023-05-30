

public class b_arrayReference {
    public static void main(String[] args) {
        int a []= {1,2,3,4};
        int b []=a;
        b[0]=0;
        b[1]=0;

        System.out.println("original array is :- ");
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i]+" ");
            }
        System.out.println(" ");
        System.out.println("referenced array is :- ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]+" ");
        }
        }
    }

