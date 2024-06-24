
class A{
    
    int x = 10;
    
    public void display(){
        System.out.println("A class");
    }

    static class B{
        public static void display(){
            System.out.println("B class");
        }
    }
}

public class innerClass2 {
    public static void main(String[] args){
        A a = new A();

        A.B obj = new A.B();
        

    }
}
