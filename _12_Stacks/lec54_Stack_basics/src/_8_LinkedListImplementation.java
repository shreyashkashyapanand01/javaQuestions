public class _8_LinkedListImplementation {
    //node class creation
    public static  class Node {
        int val;
        Node next;

        Node(int val){
            this.val=val;
        }
    }

    //implementation of Stack using LinkedList
    public  static  class Stack{ //user defined data structure
        Node head;
        int size = 0;

        void push(int x){
            Node temp= new Node(x);
            temp.next=head;
            head=temp;
            size++;
        }

        int pop(){
            if(head==null){
                System.out.println("Stack is empty");
                return  -1;
            }
            int x = head.val;
            head=head.next;
            return  x;
        }
        int peek(){
            if(head==null){
                System.out.println("stack is empty");
                return -1;
            }
            return head.val;

        }


        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        int size(){
            return size;
        }
        boolean isEmpty(){
            if(size == 0){
                return true;
            }
            else return false;
        }


    }



    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(10);
        st.display();
        st.push(20);
        st.display();

        System.out.println(st.peek());
        st.pop();
        st.display();
        System.out.println(st.size);
        System.out.println(st.isEmpty());

    }
}
