public class _3_1_InsertAtEnd {

    public static  void insertAtEnd(Node head , int val){
        Node temp = new Node(val);
        Node h = head;
        while(h.next!=null) //tail tak pahuchana hai tail ko
        {
            h=h.next;
        }
        h.next=temp;
    }

    public static void display(Node head){
        Node temp=head;

        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(5+1);
        Node c = new Node(5+2);
        Node d = new Node(5+3);
        Node e = new Node(5+4);
        Node f = new Node(5+5);


        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;

        display(a);

        insertAtEnd(a,90);
        display(a);

    }
}
