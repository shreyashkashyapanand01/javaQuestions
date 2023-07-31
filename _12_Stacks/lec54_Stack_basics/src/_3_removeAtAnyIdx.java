import javax.print.attribute.standard.JobOriginatingUserName;
import java.util.Stack;

public class _3_removeAtAnyIdx {
    static void remove(Stack<Integer>st, int idx ){
        Stack<Integer>gt=new Stack<>();
        while(st.size()>idx){
            gt.push(st.pop());
        }
        st.pop();
        while (gt.size()>0){
            st.push(gt.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer>st=new Stack<>();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        System.out.println("original Stack = ");
        System.out.println(st);

        remove(st,3);
        System.out.println("\nafter removing new stack = \n"+st);
    }
}
