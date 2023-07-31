public  class _4_InsertAtAnyIndex {
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
    public static void insertAtIdx(Node head, int idx , int x){
        Node s = head;
        for(int i = 0 ; i<=idx-1 ; i++){
            s = s.next;
        }
        //s is at idx-1 position
        Node r = s.next;
        Node t = new Node(x);
        //s t r
        s.next=t;
        t.prev=s;
        t.next=r;
        r.prev=t;
    }

    public static void main(String[] args) {
        Node a = new Node(101);
        Node b = new Node(102);
        Node c = new Node(103);
        Node d= new Node(104);
        Node e= new Node(105);
        Node f = new Node(106);

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

        System.out.println("original linked list is = ");
        display(a);

        System.out.println("after inserting an element at any random index = ");
        insertAtIdx(a,4,50);
        display(a);

    }
}
