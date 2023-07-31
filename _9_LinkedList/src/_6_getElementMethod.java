//implement a method to return the element at any given index
//of the Linked List
public class _6_getElementMethod {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }

    public static  class LinkedList {
        Node head= null;
        Node tail = null;

        int getAt(int idx){
            Node temp = head;
            for(int i = 1 ; i<=idx ; i++){
                temp = temp.next;
            }
            return temp.data;
        }
    }

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        Node a = new Node(10);
        Node b = new Node(101);
        Node c = new Node(102);
        Node d = new Node(103);
        Node e = new Node(104);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

        System.out.println(ll.getAt(4));
    }
}
