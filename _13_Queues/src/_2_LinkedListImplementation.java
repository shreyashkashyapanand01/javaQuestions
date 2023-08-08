import java.util.LinkedList;
import java.util.Queue;

public class _2_LinkedListImplementation {
    public static class Node { //user defined data type
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public static class QueueLL {
        Node head = null;
        Node tail = null;
        int size = 0;

        public void add(int x) {
            Node temp = new Node(x);
            if (size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        public int peek() {
            if (size == 0) {
                System.out.println("Queue is empty!");
                return -1;
            } else return head.val;
        }

        public int remove() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            } else {
                int x = head.val;
                head = head.next;
                size--;
                return x;
            }
        }
        public void display(){
            if(size==0){
                System.out.println("Queue is empty");
                return;
            }
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        public boolean isEmpty(){
            if (size==0) return true;
            else return false;
        }
    }

    public static void main(String[] args) {
        QueueLL q = new QueueLL();
        q.display();
        System.out.println(q.isEmpty());;
        q.add(10);
        q.add(20);
        q.add(50);
        q.add(100);
        q.add(200);
        q.display();
        q.remove();
        q.display();
        System.out.println(q.peek());
        System.out.println(q.isEmpty());

    }
}
