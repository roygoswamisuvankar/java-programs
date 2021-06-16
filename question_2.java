import java.util.*;
public class question_2 {
    public static void main(String args[]){
        int a[] = new int[100];
        int n,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Range: ");
        n = sc.nextInt();
        System.out.println("Enter array elements: ");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            sum = sum+a[i];
        }
        System.out.println("The sum of array elements: "+sum);
    }
}
