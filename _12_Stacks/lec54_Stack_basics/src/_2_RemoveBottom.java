import java.util.Stack;

public class _2_RemoveBottom {
    public static void display(Stack<Integer>st){
        if(st.size()==0) return;
        int top = st.pop();
        display(st);
        System.out.print(top+" ");
        st.push(top);

    }

    public static void remove(Stack<Integer>st){
        Stack<Integer>gt=new Stack<>();
        while (st.size()>1){
            gt.push(st.pop());
        }
        st.pop();
        while(gt.size()>0){
            st.push(gt.pop());
        }


    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        System.out.println("original stack = ");
        display(st);

        System.out.println();
        System.out.println("stack after removing bottomMost element = ");
        remove(st);
        display(st);


    }
}
