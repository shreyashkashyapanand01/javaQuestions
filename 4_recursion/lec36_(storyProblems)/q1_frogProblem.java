//package 4_recursion.lec36_(storyProblems)


public class q1_frogProblem {
    static int best (int []h, int n , int idx){
        //base case
        if(idx==n-1) return 0;
        

        //self work --> small problem
        int op1 = Math.abs(h[idx]-h[idx+1]);

        if(idx==n-2) return op1;

        int op2 = Math.abs(h[idx]-h[idx+2]);

        //recursive work
        return Math.min(op1,op2);
    }

    public static void main(String[] args) {
        int h [] = {10,30,40,20};

        System.out.println(best(h, h.length, 0));
    }
}
