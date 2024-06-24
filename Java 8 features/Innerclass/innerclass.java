
class A {
    int age;
    
    public void show(){
        System.out.println("Hello from A");
    }
    
    class B{
        public void display(){
            System.out.println("Hello from B");
        }
    }
}


public class innerclass {
    public static void main(String[] args) {

        A obj = new A();
        
        obj.show();
        
        A.B obj1 = obj.new B();
        
        obj1.display();
    }
}
