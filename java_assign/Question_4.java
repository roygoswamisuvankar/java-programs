import java.util.*;
import java.io.*;
class calculate{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Width: ");
        double w = sc.nextDouble();
        System.out.println("Enter Height: ");
        double h = sc.nextDouble();
        System.out.println("The area of a retangle is: "+(w*h));
        System.out.println("The perimeter of a retangle is: "+(2*(w+h)));
    }
}
/*
Enter Width: 
5.5
Enter Height: 
8.5
The area of a retangle is: 46.75
The perimeter of a retangle is: 28.0
PS D:\javaprogram> 
*/
