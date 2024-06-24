class A{
    public static int a;

    A(){
        System.out.println("A's constructor");
        a++;
        System.err.println("class a "+a);
    }
    A(int a){
        System.err.println("before this");
        this();
        System.err.println("after this");
        System.err.println("const a "+a);
        this.a=a;
        System.err.println("const a "+a);
        System.out.println("A's parameterized constructor");
    }
    A(A obj){
        System.err.println("instance var "+ a);
        System.out.println("A's copy constructor");
    }
}
class  B extends A{
    B(){
        
        System.out.println("B's constructor");
    }
    B(int a){
        System.err.println("before super a");
        super(a);
        System.err.println("after super a");
        System.out.println("B's parameterized constructor");
    }
    B(B obj){
        super(obj);
        System.out.println("B's copy constructor");
        }
    }




public class constructors {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A(10);
        A a3 = new A(a1);

        B b = new B();
        B b1 = new B(30);
        B b2 = new B(b);
    }

}
