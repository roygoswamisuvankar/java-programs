import java.util.*;
import java.io.*;
import java.math.*;
class calculate{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter no of sides: ");
       int s = sc.nextInt();
       System.out.println("The area of hexagon: "+((6*s*s)/(4*Math.tan(3.14/6))));
    }
}
