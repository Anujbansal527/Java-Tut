

class A{
    public int arithmatic(int a, int b){
        return  a+b;        
    }
    public int arithmatic(int c, int d,int e){
        return  c+d+e;        
    }
}



public class overloading {
    //overloading and compile time polymorphism
    public static void main(String[] args) {
        System.out.println("Main method");
    
        A a= new A();

        a.arithmatic(10,20);
        a.arithmatic(10,20,40);

    }
}
