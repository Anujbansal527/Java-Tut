interface demo{

    public void demo1();

    default void show(){
        System.err.println("Default method in interface");
    }
}


class A implements demo{
    public void demo1(){
        System.out.println("Method in class A");
    }
}

public class defaultMethod {
    public static void main(String[] args) {
        A a = new A();
        a.demo1();
        a.show();
    }
}
