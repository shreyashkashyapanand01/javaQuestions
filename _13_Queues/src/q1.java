import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class q1 {
    //you have to print all the elements in the given queue without using inbuilt function

    public static void main(String[] args) {
        Queue<Integer>q=new ArrayDeque<>();
        q.add(10);
        q.add(20);
        q.add(50);
        q.add(100);
        q.add(200);

        int n = q.size();

        Queue<Integer>q1=new LinkedList<>();
        for(int i = 0 ; i<n; i++){
            System.out.print(q.peek()+" ");
            q1.add(q.remove());
        }
        System.out.println();

        for(int i = 0 ; i<n; i++){
            q.add(q1.remove());
        }






    }
}
