import java.util.TreeSet;

public class _4_Sorted_TreeSet {
    static void treeSetExamples(){
        TreeSet<Integer> st = new TreeSet<>();
        st.add(10);
        st.add(1000);
        st.add(20);
        st.add(500);
        st.add(12345);
        st.add(0);

        System.out.println(st); //printing will be done in sorted way (ascending to descending
    }

    public static void main(String[] args) {
        treeSetExamples();
    }
}
