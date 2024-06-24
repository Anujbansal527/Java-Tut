
class A{

}

class B extends A {

}

public class up_down_casting {
    public static void main(String[] args) {
        A obj = (A) new B(); // automatically done Upcasting

        /* < ---------------- > */
        A obj1 = new B();
        B obj2 = (B)obj; //Down cating 

    }
}
