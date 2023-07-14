//package 7_strings.6_StringBuilder.imp functions;

public class a {
    public static void main(String[] args) {

        // string.append("")     setCharAt(index , character)

        StringBuilder str = new StringBuilder("hello");
        str.append("world");
        System.out.println(str);
        str.setCharAt(0, 'm');
        System.out.println(str);

        System.out.println();

        // insert(idx,ch)   and   deleteCharAt(ch)

        StringBuilder s1 =new StringBuilder("shreyash");
        s1.insert(0, 'y');
        System.out.println(s1);

        s1.deleteCharAt(0);
        System.out.println(s1);

        //reverse()   and   delete(i,j)

        StringBuilder s2 = new StringBuilder("kashyap");
        s2.reverse();
        System.out.println(s2);  //pura reverse kar dega
        s2.reverse();
            //kashyap
        s2.delete(0, 4); //0 se 3rd index tak delete kar deaga
        System.out.println(s2);

    }
}
