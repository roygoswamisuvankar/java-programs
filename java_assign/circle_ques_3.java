import java.util.*;
import java.io.*;
class calculate{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter redius: ");
        double r = sc.nextDouble();
        double area = (3.15*r*r);
        double peri = (2*3.15*r);
        System.out.println("The area of a circle is : "+area);
        System.out.println("The perimeter of a circle is: "+peri);
    }
}
