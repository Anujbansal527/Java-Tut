
interface Sayable{  
    void say();  
}  

public class static_meth_ref {
    public static void saySomething(){  
        System.out.println("Hello, this is static method.");  
    }  
    public static void main(String[] args) {
        Sayable sayable = static_meth_ref::saySomething;  
        sayable.say();
    }    
}
