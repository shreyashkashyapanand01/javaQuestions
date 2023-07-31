public class _2_InsertAtHead {
    public static  class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val=val;
        }
    }

    public static void display(Node head){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static Node insertAtHead(Node head , int x){
        Node t = new Node(x);
        t.next=head;
        head.prev=t;
        head=t;
        return head;
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(10+1);
        Node c = new Node(10+2);
        Node d = new Node(10+3);
        Node e = new Node(10+4);
        Node f = new Node(10+5);

        a.prev=null;
        a.next=b;

        b.prev=a;
        b.next=c;

        c.prev=b;
        c.next=d;

        d.prev=c;
        d.next=e;

        e.prev=d;
        e.next=f;

        f.prev=e;
        f.next=null;
        System.out.println("original LinkedList = ");
        display(a);


        System.out.println("LinkedList after changing head = ");
        Node ans = insertAtHead(a,100);
        display(ans);
    }
}
