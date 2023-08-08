import java.util.Deque;
import java.util.LinkedList;

public class _0_ImplementationDEQUE {

    //Doubly Ended Queue is used to add/remove elements from either side of the queue

    public static void main(String[] args) {
        Deque<Integer>dq = new LinkedList<>();
        //or
        Deque<Integer>dq1 = new LinkedList<>();
        dq.addLast(10);
        dq.addLast(20);
        dq.addLast(30);
        dq.addLast(40);
        System.out.println(dq);
        dq.addFirst(0);
        System.out.println(dq);
        dq.removeLast();
        System.out.println(dq);
        dq.removeFirst();
        System.out.println(dq);
        System.out.println(dq.getFirst());
        System.out.println(dq.getLast());;
    }
}
