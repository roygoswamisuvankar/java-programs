class calculate{
    public static void main(String args[]){
        int a,b;
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        System.out.println("The sum of two numbers is: "+(a+b));
        System.out.println("The multiplication of two numbers is: "+(a*b));
        System.out.println("The substraction of two numbers is: "+(a-b));
        System.out.println("The divition of two numbers is: "+(Float.valueOf(a/b)));
        System.out.println("The reminder of two numbers is: "+(a%b));
    }
}
