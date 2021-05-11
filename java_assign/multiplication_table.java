public class mtable {
    public static void main(String args[])
    {
        int n = Integer.parseInt(args[0]);
        int i = Integer.parseInt(args[1]);
        System.out.println("Multiplication table of "+n+",from 0 to "+i);
        for(int j=0;j<=i;j++)
        {
            System.out.println(n+"x"+j+"="+j*n);
        }
    }
}
