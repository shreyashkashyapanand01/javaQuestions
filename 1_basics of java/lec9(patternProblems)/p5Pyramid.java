public class p5Pyramid {
    public static void main(String[] args) {
      for(int i = 1 ;i<=6 ; i++){

        for (int j = 1 ; j<= 6-1 ; j++){
            System.out.print("");
        }
        for (int k = 1 ;k<=2*i+1;k++){
            System.out.print("*");
        }
        System.out.println();
      }
      
    }
}
