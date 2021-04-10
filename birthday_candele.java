import java.util.*;
public class bdaycandel {
    public static void main(String[] args){
        int[] a = new int[1000000];
        int count=0,max =0,i;
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(i=0;i<n;i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        for(i=0;i<n;i++)
        {
            if(max==a[i])
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
