public class Fraction {
    int num;
    int den;

    public Fraction(int num, int den){
        this.num=num;
        this.den=den;
        //jaise hi hmara constructor chale waise hi simplify ho jaye
        simplify();
    }
    public  Fraction(){

    }

    //finding gcd
    public static int gcd(int num,int den){
       int min=Math.min(num,den);
       for(int i=min ;i>=1;i--){
          if(num%i==0 && den%i==0) return i;
       }
       return min;
    }
    //for doing simplification
    public void simplify(){
        int hcf=gcd(num,den);
        num/=hcf;
        den/=hcf;
    }
}
