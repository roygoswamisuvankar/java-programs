import java.util.*;
public class question_1 {
    public static void main(String args[]){
        int n;
        int a[] = new int[100];
        System.out.println("Enter range: ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        System.out.println("Enter Array elements: ");
        for(int i=0;i<n;i++){
            a[i] = in.nextInt();
        }
        System.out.println("The array elements before shorting: ");
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
        System.out.println("The array elements after shorting: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    int tmp = a[j];
                    a[j]=a[j+1];
                    a[j+1] = tmp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }
}
