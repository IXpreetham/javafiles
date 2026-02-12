import java.util.Scanner;

public class student {
   private int id;
   private String name;
   private int marks;

   public student(int var1, String var2, int var3) {
      this.id = var1;
      this.name = var2;
      this.marks = var3;
   }

   public int getID() {
      return this.id;
   }

   public String getName() {
      return this.name;
   }

   public int getMarks() {
      return this.marks;
   }

   public void setter() {
      System.out.println("ID is " + this.getID());
      System.out.println("Nmae is " + this.getName());
      System.out.println("Marks are " + this.getMarks());
   }

   public boolean isPassed() {
      return this.marks >= 40;
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("Enter id ");
      int var2 = var1.nextInt();
      System.out.println("Enter name");
      String var3 = var1.next();
      System.out.println("Enter marks");
      int var4 = var1.nextInt();
      student var5 = new student(var2, var3, var4);
      var5.setter();
      System.out.println("Passed " + var5.isPassed());
   }
}
