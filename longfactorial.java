import java.math.BigInteger;
import java.util.*;
class longfactorial{
    public static BigInteger factorial (int num){
        //BigInteger f;
        //Scanner sc = new Scanner(System.in);
        //int num;
        BigInteger fact = BigInteger.ONE;
        //num = sc.nextInt();
        for(int i = num; i>0;i--){
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        if(n==0 || n==1){
            System.out.println("1");
        }else{
            System.out.println(factorial(n));
        }
    }
}
