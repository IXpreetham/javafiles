import java.util.*;
public class student {
    private int id;
    private String name;
    private int marks;

    public student(int id,String name,int marks){ 
        this.id=id;
        this.name=name;
        this.marks=marks;
    }
    public int getID(){
        return id;
    } 
    public String getName(){
        return name;
    }
    public int getMarks(){
        return marks;
    }
    public void setter(){
        System.out.println("ID is "+getID());
        System.out.println("Nmae is "+getName());
        System.out.println("Marks are "+getMarks());
    }
    public boolean isPassed(){
        if(marks>=40){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter id ");
        int id=sc.nextInt();
        System.out.println("Enter name");
        String name=sc.next();
        System.out.println("Enter marks");
        int marks=sc.nextInt();
        student s=new student(id,name,marks);
        s.setter();
        System.out.println("Passed "+s.isPassed());

    }
}


    

