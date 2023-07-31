import java.util.Stack;

public class _7_ArrayImplementation {
    public static class Stack {
        int arr[] = new int[10];
        int idx = 0;

        //to add an element in a stack
        void push(int x) {
            if(isFull()){
                System.out.println("stack is full!");
                return;
            }
            arr[idx] = x;
            idx++;
        }

        //to know the topmost element of the stack
        int peek() {
            if (idx == 0) {
                System.out.println("stack is empty!");
                return -1;

            } else {
                return arr[idx - 1];
            }
        }

        //to delete the topmost element of the stack
        int pop() {
            if (idx == 0) {
                System.out.println("stack is empty!");
                return -1;
            }
            int top = arr[idx - 1];
            arr[idx - 1] = 0;
            idx--;
            return top;
        }

        void display() {
            for (int i = 0; i < idx - 1; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        int size() {
            return idx;
        }

        boolean isEmpty(){
            if(size()==0)
            return true;
            else return false;
        }

        boolean isFull(){
            if(idx==arr.length)return true;
            else return false;
        }

        int capacity(){
            return arr.length;
        }

    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(10);
        st.display();
        st.push(20);
        st.display();
        st.push(50);
        st.display();
        st.push(100);
        st.display();
        st.push(200);
        st.display();
        st.push(500);
        st.display();
        st.push(1000);
        st.display();
        st.push(2000);
        st.display();


    }
}
