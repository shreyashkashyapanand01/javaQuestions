public class _5_InsertAtAnyIndex {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class LinkedList {
        Node head = null;
        Node tail = null;


        //function to add element at the end/tail of the LinkedList
        void insertAtEnd(int val){
           Node temp = new Node(val);
            if(head==null){
                head = temp;
                tail = temp;
            }else {
                tail.next=temp;
                tail = temp;
            }
        }

        //function to insert any element at the head of the linked list
        void insertAtHead(int val){
            Node temp = new Node(val);
            if(head==null){
                head = tail=temp;

            }else {
                tail.next=head;
                head = temp;
            }
        }

        //function to insert any element at the given index
        void insertAt(int idx, int val) {
            Node t = new Node(val);
            Node temp = head;
            //last index pe without any problem insert ho jaye
            if(idx==size()){
                insertAtEnd(val);
                return;
            }
            //zeroth index pe insert ho jaye isliye
            else if(idx==0){
                insertAtHead(val);
                return;
            }
            //galat input k liye
            else if (idx<0 || idx>size()) {
                System.out.println("wrong index");
                return;
            }

            for (int i = 1; i <= idx - 1; i++) {
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
        }

        //function to print the value of element at the particular index
        int getAt(int idx){
            Node temp = head;
            for(int i = 1 ; i<=idx ; i++){
                temp = temp.next;
            }
            return temp.data;
        }

        //function to display the Linked List
        void display(){
            Node temp =head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }
        //function to calculate the size of the given index
        int size(){
            Node temp = head;
            int count =0;
            while(temp!=null){
               count ++;
               temp = temp.next;
            }
            return count;
        }

        //function to delete any element at any index
        void deleteAt(int idx){
            if (idx==0){
                head=head.next;
            }
            Node temp = head;
            for(int i = 1 ; i<=idx-1 ; i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            tail=temp; //tail ko update karna important hai
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAt(0,145);
        ll.insertAt(1,144);
        ll.insertAt(2,143);
        ll.insertAt(3,142);
        ll.insertAt(4,141);

        System.out.print("Linked List = ");
        ll.display();
        System.out.println("size = "+ll.size());
        System.out.println("Linked List after deleting an element");
        ll.deleteAt(0);
        System.out.print("Linked List = ");
        ll.display();
        System.out.println("size = "+ll.size());


    }
}
