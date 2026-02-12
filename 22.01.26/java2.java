import java.util.Scanner;

public class java2 {
   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      int var2 = var1.nextInt();
      System.out.println("Natural numbers from 1 to n are");

      int var3;
      for(var3 = 1; var3 <= var2; ++var3) {
         System.out.print(var3 + " ");
      }

      System.out.println("Even numbers are ");

      for(var3 = 1; var3 <= var2; ++var3) {
         if (var3 % 2 == 0) {
            System.out.println(var3);
         }
      }

      System.out.println("Odd numbers are ");

      for(var3 = 1; var3 <= var2; ++var3) {
         if (var3 % 2 == 1) {
            System.out.println(var3);
         }
      }

      var3 = 0;

      for(int var4 = 1; var4 <= var2; ++var4) {
         var3 += var4;
      }

      System.out.println("Sum is " + var3);
   }
}
