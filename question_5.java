import java.util.*;
public class question_5 {
    public static void main(String args[]){
        int a[] = new int[100];
        int n,k;
        System.out.println("Enter array range: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("Enter array elements: ");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter key: ");
        k=sc.nextInt();
        for(int i=0;i<n;i++){
            if(a[i]==k){
                System.out.println("The key index: "+(i+1));
            }
        }
    }
}
