

public class predefine_meth {
    public static void status(){
        System.err.println("running");
    }
    public static void main(String[] args) {
        Thread t = new Thread(predefine_meth::status);
        t.start();
    }    
}
