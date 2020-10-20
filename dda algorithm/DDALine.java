package javaapplication3;
import java.awt.*; 
import javax.swing.*; 
import java.awt.geom.Line2D; 
 import java.util.*;
class dda extends Canvas { 
  
   static int x1,y1,x2,y2;
   dda(int x1, int y1, int x2, int y2){
       this.x1 = x1;
       this.y1 = y1;
       this.x2 = x2;
       this.y2 = y2;
   }
   public void paint(Graphics g){
       int dx,dy,length,i;
       int xinc, yinc, x =0 , y = 0;
       dx = Math.abs(x2-x1);
       dy = Math.abs(y2-y1);
       if(dx>=dy){
           length = dx;
       }else{
           length = dy;
       }
       xinc = dx/length;
       yinc = dx/length;
       for(i = 0; i<=length; i++){
           x = x + xinc;
           y = y + yinc;
           g.drawLine(x,y,x2,y2);
       }
   }
} 
  
public class DDALine { 
    public static void main(String[] a) 
    { 
           int x1,y1,x2,y2;
           Scanner in = new Scanner(System.in);
           System.out.println("Enter x1 : ");
           x1 = in.nextInt();
           System.out.println("Enter Y1 : ");
           y1 = in.nextInt();
           System.out.println("Enter X2 : ");
           x2 = in.nextInt();
           System.out.println("Enter Y2 : ");
           y2 = in.nextInt();
           //function call of dda algorithm
           dda d = new dda(x1,y1,x2,y2);
        // creating object of JFrame(Window popup) 
        JFrame window = new JFrame(); 
           window.add(d);
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
