import java.util.*;
public class java1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2==0 && n>0){
            System.out.println(n+"n is even and positive");
        }
        else if (n%2==0 && n<0){
            System.out.println(n+"n is even and negative");
        }
        else if(n%2==0 && n<0){
            System.out.println(n+" is even and ngative");
        }
        else if(n%2==1 && n>0){
            System.out.println(n+" is odd and positive");
        }
        else{
            System.out.println("0");
        }
    }

}