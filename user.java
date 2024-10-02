import java.util.*;
public class user{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        try{
            System.out.println("Enter a Number: ");
            int a = sc.nextInt();
            System.out.println("Enter a Number: ");
            int b = sc.nextInt();
            int c=a/b;
            System.out.println("Result:"+c); 
        }
        catch(InputMismatchException x){
            System.out.println("Error..."+x);
        }
        catch(ArithmeticException e){
            System.out.println("Error..."+e);
        }
    }
}