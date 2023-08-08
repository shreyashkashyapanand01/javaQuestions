import java.util.HashSet;

public class _1_intro {
    public static void main(String[] args) {
        HashSet<String>st = new HashSet<>();
        st.add("shreyash");
        st.add("kashyap");
        st.add("shreyash");

        System.out.println(st);
        System.out.println(st.contains("shreyash"));
        System.out.println(st.size());
        st.remove("shreyash");
        System.out.println(st.size());

        st.add("shreyash");
        for(String s : st){
            System.out.println(s);
        }
    }
}
