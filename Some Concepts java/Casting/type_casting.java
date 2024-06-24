
public class type_casting {
    public static void main(String[] args) {
        // Widening Casting (Implicit)
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double
        System.out.println(myDouble); // Outputs 9.0

        //Explicit
        double myDouble2 = 9.78d;
        int myInt2 = (int) myDouble2; // Manual casting: double to int
        System.out.println(myInt2); // Outputs 9
        
    }    
}
