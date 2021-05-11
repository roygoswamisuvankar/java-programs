import java.util.*;
import java.io.*;
class calculate{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = sc.nextInt();
        int i,y=0;
        while(n!=0){
            i=n%10;
            y=y+i;
            n=n/10;
        }
        System.out.println("The sum of digits is: "+y);
    }
}
