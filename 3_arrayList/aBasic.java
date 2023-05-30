import java.util.ArrayList;;

public class aBasic {
    public static void main(String[] args) {

        // declaring an array list
        ArrayList<Integer> l1 = new ArrayList<>();

        // adding new element in arraylist
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);

        // printing an element at index i
        System.out.println("using index i :-");
        System.out.println(l1.get(0));
        System.out.println(l1.get(1));

        // printing with loop;
        System.out.println("using for loop :- ");
        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i) + " ");
        }
        System.out.println();

        // printng elements directly
        System.out.println("directly:- ");
        System.out.println(l1);

        // adding an element at some index i
        l1.add(1, 100);
        System.out.println("after adding 100 at 1 index");
        System.out.println(l1);

        // modifying element at index i
        l1.set(1, 10);
        System.out.println("after modigying index 1 elelemt with 10:- ");
        System.out.println(l1);

        // removing an element at index i
        l1.remove(1);
        System.out.println("after removing index 1 element that is 10 ");
        System.out.println(l1);

        // removing en element 'e' present at unknown index
        l1.remove(Integer.valueOf(7));
        System.out.println("removing element 7 whitout using its index");
        System.out.println(l1);

        // checking an element exists in arrayList
        System.out.println("checking the presence of the element");
        boolean ans = l1.contains(Integer.valueOf(60));
        System.out.println("60 = "+ans);
        boolean ans1 = l1.contains(Integer.valueOf(6));
        System.out.println("6 = "+ans1);

    }
}
