
class A extends Thread{
    public void run(){
        for(int i=0;i<=5;i++)
        System.out.println(i);
    }
}

class B extends Thread{
    public void run(){
        for(int i=0;i<=5;i++)
        System.out.println(i);
    }
}

public class multitherading1 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.start();
        b.start();
    }
}

/*

to check priority obj.getPriority();

we can set priority obj.setPriority(  );
                            0 to 10
                            MAX_Priority
                            MIN_Priority
                            NORM_Priority

can use join() - to change state 
*/
