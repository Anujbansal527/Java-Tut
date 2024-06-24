import java.util.Scanner;

public class try_catch_finally {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        try {
            float c = a/b;
            System.err.println(c);
        }catch(ArithmeticException e){
            System.err.println(e.getMessage());
        }catch(ArrayIndexOutOfBoundsException e){
            System.err.println(e.getMessage());
        }catch(Exception e){
            System.err.println(e.getMessage());
        }finally{
            System.err.println("Always executable block in erroroccured or not");
        }
    }
}
