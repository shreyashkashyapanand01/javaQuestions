import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class _0_Intro {
    //queues based on the principle of FIFO(First In First Out)

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        //or
        Queue<Integer> q1 = new ArrayDeque<>();

        q.add(10);
        q.add(20);
        q.add(50);
        q.add(100);
        System.out.println("size = "+q.size());//to find out the size of the queue
        System.out.println("is empty = "+q.isEmpty()); //to check whether the queue is empty or not
        System.out.println(q);
        q.remove();//used for removing the first element
        System.out.println(q);
        q.poll();   //also used for removing the first element of the queue
        System.out.println(q);
        System.out.println(q.peek());//ued for viewing the first element of the queue
        System.out.println(q.element());//also used for viewing the first element of the queue

        //TYPES OF OPERATIONS PERFORMED IN THE QUEUE
        /*
        * 1)add
        * 2)remove()/poll()
        * 3)peek() / element()
        * 4)size()
        * 5)isEmpty()
        * */


    }
}
