import java.util.*;
import java.lang.*;

public class basic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        char[] arr = name.toCharArray();
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        int[] nums = new int[age];
        List<Integer> lis = new ArrayList<>();
        System.out.println("name:"+name); 
    } 
}