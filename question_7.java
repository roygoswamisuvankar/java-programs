import java.util.*;
public class question_7 {
    void max_min(int[] arr){
        int tmp,i,j;
        for(i=0;i<arr.length;i++){
            for(j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        System.out.println("After finding max min: ");
        System.out.println("The min: "+arr[0]);
        System.out.println("The max: "+arr[arr.length-1]);
    }
    public static void main(String args[]){
        int i,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range of an array: ");
        n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter array elements: ");
        for(i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        question_7 qs = new question_7();
        qs.max_min(a);
    }
}
