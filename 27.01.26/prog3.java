import java.util.*;
import java.lang.*;
import java.util.logging.Logger;
class InvalidAgeException extends Exception{
    public InvalidAgeException(String age){
        super(age);
    }
}
 
class InvalidEmailException extends Exception{
    public InvalidEmailException(String mail){
        super(mail);
    }
}

class InvalidNameException extends Exception{
    public InvalidNameException(String name){
        super(name);
    }
} 
public class prog3 {
    public static void validateage(int age) throws InvalidAgeException{
        if (age<18){
            throw new InvalidAgeException("Age must be greater than 18 years");
        }
    }
    public static void Emailvalidate(String email) throws InvalidEmailException {
        String emailRegex =
            "^[a-zA-Z0-9._%+-]+@" +
            "[a-zA-Z0-9.-]+" +
            "\\.[a-zA-Z]{2,}$";
        if (!email.matches(emailRegex)) {
            throw new InvalidEmailException("Invalid Email");
        } 
    }
    public static void NameValidate(String name)throws InvalidNameException{
        if(name.length()<3){
            throw new InvalidNameException("Nmae must be graeter than 3 characters");
        }
    }
    private static final Logger logger = Logger.getLogger(prog3.class.getName());
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        boolean isvalid=true;
        try{
            System.out.println("Enter Name");
            String name=sc.nextLine();
            prog3.NameValidate(name);
            System.out.println("Enter age");
            int age=sc.nextInt();
            prog3.validateage(age);
            sc.nextLine();
            System.out.println("Enter email");
            String email=sc.nextLine();
            prog3.Emailvalidate(email);
            logger.info("All validation passed");
        }
        catch(InvalidAgeException e){
            logger.warning("Age error:"+e.getMessage());
            isvalid=false;
        }
        catch(InvalidEmailException e){
            logger.warning("Email error"+e.getMessage());
            isvalid=false;
        }
        catch(InvalidNameException e){
            logger.warning("Name exception"+e.getMessage());
            isvalid=false;
        }
        finally{
            if(isvalid==true){
                logger.info("Validation  Success");
            }
            else{
                logger.info("Validation  Failed");
            }
        }
        sc.close();
    }
} 