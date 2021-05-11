/*convert decimal to binary*/
import java.util.*;
import java.io.*;
class calculate{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = sc.nextInt();   
        System.out.println("Convert "+n+" to binary = "+Integer.toBinaryString(n));
    }
}

/*
PS D:\javaprogram> java calculate
Enter an integer:
10
Convert 10 to binary = 1010
PS D:\javaprogram> java calculate      
Enter an integer: 
100
Convert 100 to binary = 1100100
PS D:\javaprogram> 
*/
