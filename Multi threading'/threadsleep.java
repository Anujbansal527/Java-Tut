
class A extends Thread{
    public void run(){
        try{
            for(int i=0;i<=5;i++)
            System.out.println(i);
            Thread.sleep(1000);
        }catch(Exception e){ 
            System.out.println(e.getMessage());
        }
    }
}

class B extends Thread{
    public void run(){
        try{
            for(int i=0;i<=5;i++)
            System.out.println(i);
            Thread.sleep(1000);
        }catch(Exception e){ 
            System.out.println(e.getMessage());
        }
        
    }
}

public class threadsleep {
    public static void main(String[] args)  throws InterruptedException {
        A a = new A();
        B b = new B();
        a.start();
        b.start();
    }
}
