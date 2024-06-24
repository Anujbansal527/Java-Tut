abstract  class A{
    public abstract void show();
}

public class Abstract_anonymous_inner {
    public static void main(String[] args) {

        A a = new A()
    {
        public void show(){
            System.out.println("Hello World");
        }
    };
    a.show();

    }
       
}
