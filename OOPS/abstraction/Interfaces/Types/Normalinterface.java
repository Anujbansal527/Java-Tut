interface MyInterface {  
    void printMessage();  
}  
class MyClass implements MyInterface {  
    @Override  
    public void printMessage() {  
        System.out.println("Hello, World!");  
    }  
}  

public class Normalinterface {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.printMessage();
        
    }
}
