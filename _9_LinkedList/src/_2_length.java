public class _2_length {

    public static int Length(Node head){
        int count = 0;
        while(head != null){
            count++;
            head = head.next;
        }

        return  count;
    }
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(3+2);
        Node c = new Node(3+3);
        Node d = new Node(3+4);
        Node e = new Node(3+5);
        Node f = new Node(100);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;

        System.out.println("length of the given node is :- ");
        System.out.println(Length(a));
    }
}
