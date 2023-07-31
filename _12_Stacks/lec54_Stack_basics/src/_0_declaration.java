import java.util.Stack;

public class _0_declaration {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        //stack work on the principle of LIFO or FILO
        st.push(1);
        st.push(32);
        st.push(90);
        st.push(5);

        //peek--->return top most value of the stack
        System.out.println(st.peek());

        //printing the stack
        System.out.println(st);

        //printing the stack in reverse order
        Stack<Integer>sr = new Stack<>();
        while(st.size()>0){
            sr.push(st.pop());
        }
        System.out.println("reverse = "+sr);
        //pop--->delete the topmost element
        sr.pop();
        System.out.println(sr);


        //size --> to know size of stack
        System.out.println("size = "+sr.size());


        //push --> add element
        //peek --> access topmost element
        //pop --> delete topmost element
        //size --> to know the size of the stack
    }
}
