public class _3_InsertAtTail {
    public static class Node{
        int val;
        Node next;
        Node prev;

        Node(int val){
            this.val=val;
        }
    }

    static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void insertAtTail(Node head, int x){
        Node temp = head;

        //temp ko tail tak leke jate hai
        while(temp.next!=null){
            temp = temp.next;
        }

        Node t = new Node(x);
        temp.next=t;
        t.prev=temp;

    }


    public static void main(String[] args) {
        Node a = new Node(106);
        Node b = new Node(105);
        Node c = new Node(104);
        Node d = new Node(103);
        Node e = new Node(102);
        Node f = new Node(101);

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

        System.out.println("original Linked List = ");
        display(a);
        System.out.println("inserting an element at tail = ");
        insertAtTail(a,123);
        display(a);
    }
}
