import java.util.Scanner;

public class java1 {
   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      int var2 = var1.nextInt();
      if (var2 % 2 == 0 && var2 > 0) {
         System.out.println(var2 + "n is even and positive");
      } else if (var2 % 2 == 0 && var2 < 0) {
         System.out.println(var2 + "n is even and negative");
      } else if (var2 % 2 == 0 && var2 < 0) {
         System.out.println(var2 + " is even and ngative");
      } else if (var2 % 2 == 1 && var2 > 0) {
         System.out.println(var2 + " is odd and positive");
      } else {
         System.out.println("0");
      }

   }
}
