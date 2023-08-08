import java.util.*;

public  class _1_List_Interface_Examples{
    static void ArrayListExamples(){
        System.out.println("ArrayList :- ");

        ArrayList<Integer>al=new ArrayList<>();
        //al.add() --> is used to add a new element in the ArrayList
        al.add(10);
        al.add(20);
        al.add(50);
        al.add(100);

        System.out.println(al);
        System.out.println(al.get(2)); //al.get(index) --> is used to view the particular element at the given index

        al.set(0,100); //al.set(index,element) --> used to modify element at the given index
        System.out.println(al);

        System.out.println(al.contains(100));
        System.out.println(al.contains(10)); //al.contain(element) --> is used check whether the given element is present in the ArrayList or not
    }

    static void LinkedListExamples(){
        System.out.println("LinkedList :- ");

        LinkedList<Integer>al=new LinkedList<>();
        al.add(10);
        al.add(20);
        al.add(50);
        al.add(100);

        System.out.println(al);
        System.out.println(al.get(2)); //al.get(index) --> is used to view the particular element at the given index

        al.set(0,100); //al.set(index,element) --> used to modify element at the given index
        System.out.println(al);

        System.out.println(al.contains(100));
        System.out.println(al.contains(10)); //al.contain(element) --> is used check whether the given element is present in the ArrayList or not
    }

    static void StackExamples(){
        System.out.println("Stacks :- ");

        Stack<String>st=new Stack<>();
        st.push("shreyash");
        st.push("kashyap");//st.push(element) --> is used to add an element in the stack
        System.out.println(st);

        System.out.println(st.peek());//st.peek() --> prints the last added element
        System.out.println(st.pop());//st.pop() -->prints as well as delete the last added element
        System.out.println(st.peek()); //now the last added element is shreyash

        System.out.println(st.size()); //st.size() -->prints the number of elements of the Stack

        System.out.println(st.empty()); //st.empty() --> is used for checking whether the given stack is empty or not

    }

    public static void main(String[] args) {

        ArrayListExamples();
        LinkedListExamples();
        StackExamples();
    }
}