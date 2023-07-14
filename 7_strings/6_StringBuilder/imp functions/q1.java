/*given a strng, the task is to toggle all the charachters of the
 * strng i.e to convert UPPER case to LOWER case and vice versa
 * 
 * input:- PhysiCS
 * output:-pHYSIcs
 */

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string :- ");
        StringBuilder str = new StringBuilder(sc.nextLine());
        System.out.println(str);

        //toggle karne ka code

        for(int i =0 ; i<=str.length()-1;i++){
            //check letter is capital is small
            boolean flag =  true;
            char ch = str.charAt(i);
            if(ch==' ') continue;
            int aschi=(int)ch;
            if(aschi>=97) flag=false;

            if(flag==true){
                aschi+=32;
                char dh = (char)aschi;
                str.setCharAt(i, dh);
            }else{
                aschi-=32;
                char dh=(char)aschi;
                str.setCharAt(i, dh);
            }
        }
        System.out.println("after converting capital to samll and vice versa new word is :- \n"+str);
    }
}
