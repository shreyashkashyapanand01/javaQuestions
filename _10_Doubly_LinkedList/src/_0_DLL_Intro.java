public class _0_DLL_Intro {
    public static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val=val;
        }
    }
    public static void displayAll(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void display2(Node tail){
        Node temp = tail;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.prev;
        }
        System.out.println();
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

        displayAll(a); //head--->tail
        display2(f);   //tail--->head
    }
}
