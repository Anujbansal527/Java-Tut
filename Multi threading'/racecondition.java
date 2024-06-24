class Counter{
    int count;
    public synchronized  void Increment(){
        count++;
    }
}

//without synchronization there was a lack or data that both thread try to access same fun at same time 
//thats why problem was aries to solve we use synchriniztion

public class racecondition {
    public static void main(String[] args) {
        Counter c = new Counter();
        Runnable ob = () -> {
            for (int i = 0; i < 10000; i++) {
                c.Increment();
            }
        };
        Runnable ob2 = () ->{
            for (int i = 0; i < 10000; i++) {
                c.Increment();
                }
        };
        Thread t1 = new Thread(ob);
        Thread t2 = new Thread(ob2);
        t1.start();
        t2.start();
    }
}
