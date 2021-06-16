import java.util.*;
public class question_6 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a[] = new int[100];
        int n, pos, k,i;
        System.out.println("Enter a range: ");
        n = sc.nextInt();
        System.out.println("Enter array elements: ");
        for(i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter new key: ");
        k = sc.nextInt();
        System.out.println("Enter position: ");
        pos = sc.nextInt();
 
        for(i=a.length-1;i>pos;i--){
            a[i] = a[i-1];
        }
        a[pos-1] = k;
        System.out.println("After inserting new elements: ");
        for(i=0;i<n+1;i++){
            System.out.println(a[i]);
        }
    }
}
