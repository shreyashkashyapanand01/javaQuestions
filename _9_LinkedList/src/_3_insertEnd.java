public class _3_insertEnd {
    public static class Node{
        int data;
        Node next;

        Node (int data){
            this.data = data;
        }
    }
    public static class LinkedList{
        Node head = null;
        Node tail = null;

        //function to add numbers at the end of the linked list
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

        //making function inside the Linked List function for displaying the Linked List
        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
        int size(){
             int count = 0;
             Node temp = head;
             while(temp!=null){
                 count ++;
                 temp = temp.next;
             }
             return  count;
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAtEnd(5);
        ll.insertAtEnd(5+3);
        ll.insertAtEnd(5+4);
        ll.insertAtEnd(5+5);
        ll.insertAtEnd(5+6);
        ll.insertAtEnd(5+7);

        //printing the linked list
        ll.display();
        //printing the size of the linked List
        System.out.println("\nsize = "+ll.size());

    }
}
