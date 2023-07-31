public class _0_intro {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(5 + 1);
        Node c = new Node(5 + 2);
        Node d = new Node(5 + 3);
        Node e = new Node(5 + 4);
        //5 6 7 8 9
        //making a basic type of Linked List
       a.next=b;//5 --> 6 7 8 9
       b.next=c;//5 --> 6 --> 7 8 9
       c.next=d;//5 --> 6 --> 7 --> 8 9
       d.next=e;//5 --> 6 --> 7 --> 8 --> 9

       //address of the next element is stored in the previous element

        System.out.println(a.data);//5
        System.out.println(b.data); //6
        System.out.println(a.next.data);//6
        System.out.println(c.data);//7
        System.out.println(b.next.data);//7


    }
}
