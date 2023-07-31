import java.util.Stack;

public class _1_DisplayStack {
    public static void displayRecursively(Stack<Integer>st){
        //base case
        if(st.size()==0) return;
        //self-work
        int top = st.pop();

        //recursive-work
        displayRecursively(st);
        //self work
        System.out.print(top+" ");
        st.push(top);

    }
    public static void main(String[] args) {
        Stack<Integer>st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        System.out.println("displaying elements of stack using Built-In function = \n"+st);
        System.out.println("displaying Stack using manual method :-   ");
        Stack<Integer>rt = new Stack<>();
        while(st.size()>0){
            rt.push(st.pop());
        }
        while (rt.size()>0){
           int x = rt.pop();
            System.out.print(x+" ");
            st.push(x);
        }

        System.out.println("\ndisplaying Stack using array :- ");
        int n = st.size();
        int arr[] = new int[n];

        for(int i = n-1 ; i>=0 ; i--){
            arr[i]=st.pop();
        }
        for(int i = 0 ; i<n ; i++){
            System.out.print(arr[i]+" ");
            st.push(arr[i]);
        }

        System.out.println("\nDisplaying Stack using recursion :- ");
        displayRecursively(st);
    }
}
