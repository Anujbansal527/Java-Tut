class ABC {
    public static ABC obj;
    private ABC(){
        System.out.println("Obj Created");
    }
    public static  ABC getInstnce(){
        if(obj == null){
            synchronized (ABC.class) {
                if(obj == null)
                    obj = new ABC();
            }
        }
        return obj;
    }
}


public class singletondoublecheck {
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
        try {
            Thread.sleep(10);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        t2.start();

    }    
}

