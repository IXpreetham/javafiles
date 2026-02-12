public class Employee {
   int id;
   String name;
   int monthlysalary;
   static String companyname = "Innovatech Technology";

   public Employee(int var1, String var2, int var3) {
      this.id = var1;
      this.name = var2;
      this.monthlysalary = var3;
   }

   public void displayEmployeedetails() {
      System.out.println(this.id);
      System.out.println(this.name);
      System.out.println(this.monthlysalary);
      System.out.println(companyname);
   }

   public int calculateAnnualSalary() {
      return 12 * this.monthlysalary;
   }

   public static void main(String[] var0) {
      Employee var1 = new Employee(100, "Ramu", 50000);
      Employee var2 = new Employee(101, "Raju", 30000);
      var1.displayEmployeedetails();
      System.out.println("");
      var2.displayEmployeedetails();
      System.out.println("Annual salary of " + var1.name);
      System.out.println(var1.calculateAnnualSalary());
      System.out.println("Annual salary of " + var1.name);
      System.out.println(var2.calculateAnnualSalary());
   }
}
