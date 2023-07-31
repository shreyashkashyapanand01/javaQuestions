import java.util.Stack;

public class _4_reverse {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        System.out.println("original Stack = ");
        System.out.println(st);

        Stack<Integer>gt=new Stack<>();
        while(st.size()>0){
            gt.push(st.pop());
        }
        System.out.println(gt);

        Stack<Integer>qt=new Stack<>();
        while (gt.size()>0){
            qt.push(gt.pop());
        }

        System.out.println(qt);

        while(qt.size()>0){
            st.push(qt.pop());
        }
        System.out.println(st);
        System.out.println(gt);
        System.out.println(qt);
    }


}
