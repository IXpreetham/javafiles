public class Employee {
    int id;
    String name;
    int monthlysalary;
    static String companyname="Innovatech Technology";
    public Employee(int id,String name,int monthlysalary){
        this.id=id;
        this.name=name;
        this.monthlysalary=monthlysalary;
    }
    public void displayEmployeedetails(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(monthlysalary);
        System.out.println(companyname);
    }
    public int calculateAnnualSalary(){
        return 12*monthlysalary;
    }
    public static void main(String args[]){
        Employee e1=new Employee(100,"Ramu",50000);
        Employee e2=new Employee(101,"Raju",30000);
        e1.displayEmployeedetails();
        System.out.println("");
        e2.displayEmployeedetails();
        System.out.println("Annual salary of "+e1.name);
        System.out.println(e1.calculateAnnualSalary());
        System.out.println("Annual salary of "+e1.name);
        System.out.println(e2.calculateAnnualSalary());
    }
}
