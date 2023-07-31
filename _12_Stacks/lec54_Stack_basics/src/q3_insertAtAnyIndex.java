import java.util.Stack;

public class q3_insertAtAnyIndex {
    public static void main(String[] args) {
        Stack<Integer>st = new Stack<>();

        st.push(101);
        st.push(102);
        st.push(103);
        st.push(104);
        st.push(105);
        st.push(106);

        System.out.println("stack = "+st);
        //adding new element at the given index
        int idx = 2;
        int num=7;

        Stack<Integer>gt=new Stack<>();

        while(st.size()>idx){
            gt.push(st.pop());
        }
        st.push(num);

        while(gt.size()>0){
            st.push(gt.pop());
        }

        System.out.println("new stack = " +st);

    }
}
