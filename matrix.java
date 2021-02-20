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
        System.out.println("Enter a matrix elements: ");
        for(int i=0;i<3;i++){
           for(int j=0;j<3;j++){
               a[i][j] = in.nextInt();
           }
        }
        System.out.println("The matrix elements is: ");
        for(int i=0;i<3;i++){
            System.out.print("\n");
            for(int j=0;j<3;j++){
                System.out.print(a[i][j]+"\t");
            }
        }
    }
    
}
