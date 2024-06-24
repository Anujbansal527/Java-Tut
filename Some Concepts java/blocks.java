class Demo{
    static {
        System.out.println("Static block");
    }
    {
        System.out.println("Instance block");
    }
    Demo(){
        System.out.println("Constructor");
    }
    Demo(int a){
        System.out.println("Parameterized constructor");
    }
    Demo(Demo d){
        System.out.println("Copy constructor");
    }
    public void show(){
        System.out.println("Show method");
    }
    /* one more block works with only exception handling that is finally */
}
public class blocks {
    public static void main(String[] args) {
        Demo obj = new Demo();
        Demo obj2 = new Demo(12);
        Demo obj3 = new Demo(obj);
        obj.show();

    }
}
