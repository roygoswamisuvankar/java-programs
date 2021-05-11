import java.io.*;
import java.util.*;
class area{
    private int width;
    private int height;
    public int cal(int a, int b){
        width = a;
        height = b;
        return (width*height);
    }
}
public class quiz {
    public static void main(String[] args) 
    {
       int a,b;
       Scanner in = new Scanner(System.in);
       System.out.println("Enter width: ");
       a = in.nextInt();
       System.out.println("Enter height: ");
       b = in.nextInt();
       area ar = new area();
       System.out.println("The area is: "+ar.cal(a, b));
    }   
}
