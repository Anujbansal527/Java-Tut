
class A{
    public void display(){
        System.out.println("Hello from A");
    }
}

public class Anonymous_inner {
    public static void main(String[] args) {
        A obj = new A(){
            public void display(){
                System.out.println("Hello from Anonymous inner class");
            }
        }; 
        obj.display();
    }
}
