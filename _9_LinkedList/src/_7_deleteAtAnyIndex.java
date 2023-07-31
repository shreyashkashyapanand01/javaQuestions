public class _7_deleteAtAnyIndex {


    static  class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

    }

    public static  class LinkedList{
        Node head= null;
        Node tail  = null;

        //function to delete any element in the Linked List
        void deleteAt(int idx){
            Node temp = head;
            for(int i = 1 ; i<=idx-1 ; i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
        }

        //function to insert any element at any index

        void insertAt(int idx , int val){

        }

    }

    public static void main(String[] args) {

    }
}
