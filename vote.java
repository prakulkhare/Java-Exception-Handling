import java.util.*;

public class vote{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = sc.nextInt();
        try{
            if(age < 18) {
                throw new InvalidAgeException();
            }
            else{
                System.out.println("Eligible for vote"+age);
            }    
        }
        catch(InvalidAgeException e){
            System.out.println(e);
        }
    }
} 
class InvalidAgeException extends Exception{
        InvalidAgeException(){
        System.out.println("Error occured");
    }
}
