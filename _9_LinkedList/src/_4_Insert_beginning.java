public class _4_Insert_beginning {
    public static class Node{
       int data;
        Node next;

        Node (int data){
            this.data=data;
        }
    }

    public static  class LinkedList{
        Node head = null;
        Node tail = null;

        void insertAtHead(int val){
            Node temp = new Node(val);
            if(head == temp){
                head =tail=temp;
            }else {
                temp.next=head;
                head = temp;
            }
        }
        void display(){
            Node temp = head;
            while(temp!= null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
        int length(){
            Node temp=head;
            int count =0;
            while(temp!=null){
                count++;
                temp = temp.next;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAtHead(10);
        ll.insertAtHead(12);
        ll.insertAtHead(13);

        System.out.println("Linked List = ");
        ll.display();

        System.out.println("\nlength = "+ll.length());
    }

}
