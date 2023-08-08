import java.util.*;

public class _2_Queue_Interface {

    public static void QueueExamples(){
        System.out.println("Queues :- ");
        Queue<Integer>q=new LinkedList<>();

        q.offer(10); //q.offer(element) --> is used to add element in the Queue
        q.offer(20);
        q.offer(50);

        System.out.println(q.peek());//q.peek() --> is used to view the first added element in the queue
        System.out.println(q.poll());//q.poll() --> is used to view as well as remove the first element of the Queue
        System.out.println(q.peek());//now first element is 20

        System.out.println(q.isEmpty()); //checks if the queue is empty or not
        System.out.println(q.size()); //finds the size of the queue
    }

    static  void PriorityQueueExamples(){
        System.out.println("Min PriorityQueue");
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        pq.add(50);
        pq.add(100);
        pq.add(20);
        pq.add(10);


        System.out.println(pq.peek());//note:- in priorityQueue the first element of the queue automatically becomes the smallest element in the Queue;
        System.out.println(pq);

        System.out.println(pq.poll());
        System.out.println(pq);

        PriorityQueue<Integer>pq1=new PriorityQueue<>(Comparator.reverseOrder());
        System.out.println("Max PriorityQueue");
        pq1.add(50);
        pq1.add(100);
        pq1.add(20);
        pq1.add(10);


        System.out.println(pq1.peek());//note:- in this priorityQueue the first element of the queue automatically becomes the largest element in the Queue;
        System.out.println(pq1);

        System.out.println(pq1.poll());
        System.out.println(pq1);

    }

    static void dequeExamples(){
        System.out.println("Doubley Ended Queues :-  ");
        Deque<Integer>dq=new ArrayDeque<>();

        dq.addFirst(10); //10  -->add elements to zeroth index of the queue
        dq.addFirst(20);//20 10
        dq.addLast(50);//20 10 50
        System.out.println(dq); //-->add elements to last index of the queue
        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());

        System.out.println(dq.pollFirst());//prints as well as deletes the zeroth index element
        System.out.println(dq.pollLast());//prints as well as deletes the last index element

        System.out.println(dq);
    }

    public static void main(String[] args) {
//        QueueExamples();
//        PriorityQueueExamples();
        dequeExamples();


    }
}
