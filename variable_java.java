public class variable_java {

    static int static_class_var = 100;
    
    int class_var = 100;
    
    static final int const_var = 50;
    
    void print_var(int a){
        
        a=10;

        int local_var = 50;
        
        System.err.println("function varl"+a);

        System.err.println("local var "+local_var);

    }
    public static void main(String[] args) {
            
            variable_java vr = new variable_java();

            int instance_var = 10;

            System.err.println("instance_var"+instance_var);
            System.err.println("static_class_var "+static_class_var);
            System.err.println("class_var "+vr.class_var);
            System.err.println("final class_var "+vr.const_var);
            System.err.println("local_var not acceisible");

            vr.print_var(10);
        } 
}
