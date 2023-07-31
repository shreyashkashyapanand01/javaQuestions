public class _1_displayRandom {

    public static  class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val=val;
        }
    }

    //printing the while Linked List if any random node is given
    public static  void displayRandom(Node random){
            Node temp = random;
            //moving temp backwards till we get null value after head node
            while(temp.prev!=null){
                temp=temp.prev;
            }
            //now tem is at head
            //printing the whole Linked list
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
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

        displayRandom(e);

    }
}
