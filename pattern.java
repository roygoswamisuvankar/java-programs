import java.util.*;
public class pattern {
    public static void main(String[] args){
        int n,i,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row No. : ");
        n = sc.nextInt();
        for(i=0;i<n;i++){
            for(j=n-1;j>i;j--){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("#");
            }
            System.out.print("\n");
        }
    }
}
