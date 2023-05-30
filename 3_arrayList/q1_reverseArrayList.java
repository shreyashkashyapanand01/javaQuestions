import java.util.ArrayList;
import java.util.Collections;

public class q1_reverseArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();

        l.add(0);
        l.add(10);
        l.add(3);
        l.add(5);
        l.add(22);
        l.add(10);

        System.out.println("original list = " + l);
        System.out.println("reverse using method 1 :- ");

        // method 1
        int i = 0, j = l.size() - 1;
        while (i < j) {
            Integer temp = Integer.valueOf(l.get(i));
            l.set(i, l.get(j));
            l.set(j, temp);
            i++;
            j--;
        }
        System.out.println(l);

        // using method 2
        System.out.println("reverse using method 2 :- ");
        Collections.reverse(l);
        System.out.println(l);

    }
}