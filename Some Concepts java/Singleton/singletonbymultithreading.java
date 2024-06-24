class ABC {
    public static ABC obj;
    private ABC(){
        System.out.println("Obj Created");
    }
    public static synchronized ABC getInstnce(){
        if(obj == null){
            obj = new ABC();
        }
        return obj;
    }
}

public class singletonbymultithreading {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            public void run(){
                ABC obj =ABC.getInstnce();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run(){
                ABC obj =ABC.getInstnce();
            }
        });
        t1.start();
        t2.start();

    }    
}
