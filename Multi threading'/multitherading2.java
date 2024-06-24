class A implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Thread A");
            }
    }
}

public class multitherading2 {
    public static void main(String[] args) {
        Runnable rn = new A();
        Thread t = new Thread(rn);
        t.start();
    }
}
