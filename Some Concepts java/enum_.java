
enum Level{
    Low,Mid,Hig;
}

public class enum_ {
    public static void main(String[] args) {
        Level myLevel = Level.Mid;

        Level[] l1 = Level.values();
        for(Level l : l1){
            System.err.println(l.ordinal());
        }
    }
}
