/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;
import java.util.*;
/**
 *
 * @author suvankar
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int a[][] = new int[3][3];
        int b[][] = new int[3][3];
        int c[][] = new int[3][3];
        System.out.println("Enter a matrix A elements: ");
        for(int i=0;i<3;i++){
           for(int j=0;j<3;j++){
               a[i][j] = in.nextInt();
           }
        }
        System.out.println("Enter matrix B elements: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                b[i][j] = in.nextInt();
            }
        }
        System.out.print("\nA = ");
        for(int i=0;i<3;i++){
            System.out.print("\n");
            for(int j=0;j<3;j++){
                System.out.print(a[i][j]+"\t");
            }
        }
        System.out.print("\nB = ");
        for(int i=0;i<3;i++){
            System.out.print("\n");
            for(int j=0;j<3;j++){
                System.out.println(b[i][j]+"\t");
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                c[i][j] = a[i][j]+b[i][j];
            }
        }
        System.out.print("\nThe sum of two matrix : ");
        for(int i=0;i<3;i++){
            System.out.print("\n");
            for(int j=0;j<3;j++){
                System.out.print(c[i][j]+"\t");
            }
        }
    }
    
}
