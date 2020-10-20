/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;
import java.io.*;
import java.applet.*;
import java.awt.*;
import javax.swing.JFrame;
import java.util.*;

/**
 *
 * @author S U V A N K A R
 */
 class linedraw extends Canvas{
    static int x0,y0,x1,y1;
    linedraw(int x0, int y0, int x1, int y1){
        this.x0 = x0;
        this.y0 = y0;
        this.x1 = x1;
        this.y1 = y1;
    }
    
    public void paint(Graphics g){
        int dx,dy,pk,xk,yk;
        dx = x1 - x0;
        dy = y1 - y0;
        pk = 2*dy - dx;
        xk = x0;
        yk = y0;
        for(int i = 0; i<=dx; i++){
            if(pk<0){
                pk = pk+2*dy;
                xk = xk + 1;
                yk = yk;
            }else{
                pk = pk+2*dy-2*dx;
                xk = xk+1;
                yk = yk+1;
            }
            g.drawLine(xk, yk, x1, y1);
        }
    }
}
public class brehams {
    public static void main(String[] args){
        int x0,y0,x1,y1;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter X0: ");
        x0 = in.nextInt();
        System.out.println("Enter Y0: ");
        y0 = in.nextInt();
        System.out.println("Enter X1: ");
        x1 = in.nextInt();
        System.out.println("Enter Y1: ");
        y1 = in.nextInt();
        linedraw li = new linedraw(x0,y0,x1,y1);
        JFrame window = new JFrame();
        window.add(li);
        // setting closing operation 
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        
        // setting size of the pop window 
        window.setBounds(300, 300, 500, 500); 
        
  
        // setting canvas for draw 
       // window.getContentPane().add(new MyCanvas()); 1
  
        // set visibility 
        window.setVisible(true);
    }
}
