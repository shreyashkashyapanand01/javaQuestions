public class _1_Display {

    public static void display(Node head)
    {
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }

    }

    //display using recursion

    public static void displayRecursion(Node head){
        //base case
        if(head==null) return;
        //self work
        System.out.print(head.data+" ");
        //recursive work
        display(head.next);
    }
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node (5);
        Node b = new Node (5+1);
        Node c = new Node (5+2);
        Node d = new Node (5+4);
        Node e = new Node (5+3);

        //creating linked list
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

        //printing the elements of the linked list using function
        display(a);
        displayRecursion(a);

    }
}
