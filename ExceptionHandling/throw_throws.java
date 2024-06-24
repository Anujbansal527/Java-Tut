
public class throw_throws {

    static void fun() throws IllegalAccessException{
        System.out.println("Inside fun(). ");
        throw new IllegalAccessException("Demo Exception by user");
    }
    public static void main(String[] args)  {
        try{
            fun();
        }catch(IllegalAccessException e){
            System.err.println("Catch in main");
        }
    }    
}
