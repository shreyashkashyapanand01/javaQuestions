
import java.util.*;

public class _3_Set_Interface {
    //SET --> a collection that contains no duplicate elements
    //uniqueness

    static  void hashsetExamples(){
        HashSet<Integer>st = new HashSet<>();
        st.add(10);
        st.add(20);
        st.add(50);
        st.add(100);

        System.out.println(st); //note--> order of printing will be entirely different (Unordered manner)

        st.add(2);
        st.add(48);
        st.add(15);

        System.out.println(st); //note:- duplicate elements are not printed

        st.remove(20);
        System.out.println( st.contains(20));

        System.out.println(st);
    }

    static void LinkedHashsetExamples(){
        LinkedHashSet<Integer>st = new LinkedHashSet<>();
        st.add(10);
        st.add(20);
        st.add(50);
        st.add(100);

        System.out.println(st); //note--> order of printing will be same as we have inputted the elements(ordered way) not linked Hashset

        st.add(2);
        st.add(48);
        st.add(15);

        //duplicate elements
        st.add(2);
        st.add(48);
        st.add(15);

        System.out.println(st); //note:- duplicate elements are not printed

        st.remove(20);
        System.out.println( st.contains(20));

        System.out.println(st);
    }

    public static void main(String[] args) {
        //hashsetExamples();  //printing will be done in unordered way
        LinkedHashsetExamples(); //printing will be done in the same way u have inputted the elements

    }
}
