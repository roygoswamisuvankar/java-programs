import java.util.*;
public class question_8 {
    public static void main(String args[]){
        int i,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array range: ");
        n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter array elements: ");
        for(i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("The reverse of array: ");
        for(i=a.length-1;i>=0;i--){
            System.out.println(a[i]);
        }
    }
}
