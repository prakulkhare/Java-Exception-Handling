public class zero{
    public static void main(String []args){
        int a,b ;
        a = 5;
        b = 0;
        try{
            int c = a/b;
            System.out.println("Result"+c);
        }
        catch(ArithmeticException e){
            System.out.println("Error Occurred"+e.getMessage());
        }
    }
}