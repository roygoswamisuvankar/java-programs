import java.util.*;
public class question_9 {
    public static void main(String args[]){
        int n,i,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range: ");
        n = sc.nextInt();
        System.out.println("Enter elements: ");
        int[] a = new int[n];
        for(i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("The dublicate value of array is: ");
        for(i=0;i<a.length;i++){
            for(j=i+1;j<a.length;j++){
                if(a[i] == a[j]){
                    System.out.println(a[j]);
                }
            }
        }
    }
}
