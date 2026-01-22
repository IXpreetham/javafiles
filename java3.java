import java.util.*;
public class java3 {
    public void add(int a,int b){
        System.out.println(a+b);
    }
    public void isEven(int c){
        if(c%2==0){
            System.out.println(c+" is even");
        }
        else{
            System.out.println(c+" is not even");
        }
    }
    public void Factorial(int d){
        int f=1;
        for(int i=1;i<=d;i++){
            f*=i;
        }
        System.out.println(f);

    }
    
    public static void main(String args[]){
        java3 obj=new java3();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int a=sc.nextInt();
        System.out.println("Enter second number");
        int b=sc.nextInt();
        System.out.println("Enter third Number");
        int c=sc.nextInt();
        System.out.println("Enter fourth number");
        int d=sc.nextInt();
        System.out.print("Sum of two number  "+a +" and "+b +" is:");
        obj.add(a,b);
        obj.isEven(c);
        System.out.print("Factorial of " +d +":" );
        obj.Factorial(d); 
    }
    
}
