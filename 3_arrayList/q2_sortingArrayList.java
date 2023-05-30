import java.util.ArrayList;
import java.util.Collections;

public class q2_sortingArrayList {
    public static void main(String[] args) {

        ArrayList<Integer>l=new ArrayList<>();

        l.add(0);
        l.add(10);
        l.add(3);
        l.add(5);
        l.add(22);
        l.add(10);

        System.out.println("original list \n"+l);

        Collections.sort(l);
        System.out.println("sorted in ascending order \n"+l);

        Collections.sort(l, Collections.reverseOrder());
        System.out.println("sorted in descending order \n"+l);

        
    }
}
