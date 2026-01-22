import java.util.*;
public class java2 {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Natural numbers from 1 to n are");
        for(int i=1;i<=n;i++){
            System.out.print(i+" ");
        }
        System.out.println("Even numbers are ");
        for(int i=1;i<=n;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
        System.out.println("Odd numbers are ");
        for(int i=1;i<=n;i++){
            if(i%2==1){
                System.out.println(i);
            }
        }
        int s=0;
        for(int i=1;i<=n;i++){
            s+=i;
        }
        System.out.println("Sum is "+s);
    }
}
