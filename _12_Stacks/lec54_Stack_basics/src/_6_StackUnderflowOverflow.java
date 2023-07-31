import java.util.Stack;

/*
* UNDERFLOW :- if stack is empty --> and u r doing st.peek() or st.pop();
* then there is empty stack Exception (Error);
*
* OVERFLOW :- 1)if computer memory is full;
*              2)implement using arrays --> size fixed --> may cause overflow
* */

public class _6_StackUnderflowOverflow {
    public static void main(String[] args) {
        Stack<Integer>st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(50);
        st.push(100);
        st.push(200);
        st.push(500);
        st.push(1000);
        st.push(2000);

        System.out.println(st);
        st.pop();
        System.out.println(st); st.pop();
        System.out.println(st); st.pop();
        System.out.println(st); st.pop();
        System.out.println(st); st.pop();
        System.out.println(st); st.pop();
        System.out.println(st); st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();//error dikhaega;
        System.out.println(st);

    }
}
