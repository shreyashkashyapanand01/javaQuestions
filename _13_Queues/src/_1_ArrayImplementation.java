import java.util.LinkedList;
import java.util.Queue;

public class _1_ArrayImplementation {

    public static class QueueArray{
        int front = -1;
        int rear = -1;
        int size = 0;
        int arr[]=new int[100];

        public void add(int val){
            if(rear==arr.length-1){
                System.out.println("Queue is full");
                return;
            }
            if(front==-1){ //queue is currently empty
                front=rear=0;
                arr[0]=val;
            }else {
                arr[++rear]=val;
            }
            size++;
        }

        public int remove(){
            if(size==0){
                System.out.println("queue is empty");
                return -1;
            }
            front++;
            size--;
            return  arr[front-1];
        }
        public int peek(){
            if(size==0){
                System.out.println("queue is empty!");
                return -1;
            }
            return arr[front];
        }
        public boolean isEmpty(){
            if (size==0) return true;
            else return false;
        }
        public void display(){
            if(size==0){
                System.out.println("queue is empty!");
            }else {
                for (int i = front; i < rear; i++) {
                    System.out.print(arr[i] + " ");
                }
            }
        }

    }

    public static void main(String[] args) {
        QueueArray q = new QueueArray();
        q.display();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(50);
        q.add(100);

        q.display();
        q.remove();
        System.out.println();
        q.display();
        System.out.println();
        System.out.println(q.peek());
        System.out.println(q.size);
    }
}
