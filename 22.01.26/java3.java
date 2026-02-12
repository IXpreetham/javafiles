import java.util.Scanner;

public class java3 {
   public int add(int var1, int var2) {
      return var1 + var2;
   }

   public boolean isEven(int var1) {
      return (var1 & 2) == 0;
   }

   public int Factorial(int var1) {
      if (var1 < 0) {
         return -1;
      } else {
         int var2 = 1;

         for(int var3 = 1; var3 <= var1; ++var3) {
            var2 *= var3;
         }

         return var2;
      }
   }

   public static void main(String[] var0) {
      java3 var1 = new java3();
      Scanner var2 = new Scanner(System.in);
      System.out.println("Enter First Number: ");
      int var3 = var2.nextInt();
      System.out.println("Enter second number");
      int var4 = var2.nextInt();
      System.out.println("Enter third Number");
      int var5 = var2.nextInt();
      System.out.println("Enter fourth number");
      int var6 = var2.nextInt();
      System.out.print("Sum of two number  " + var3 + " and " + var4 + " is:");
      var1.add(var3, var4);
      var1.isEven(var5);
      System.out.print("Factorial of " + var6 + ":");
      var1.Factorial(var6);
   }
}
