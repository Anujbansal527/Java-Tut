enum  ABC{
    INSTANCE;
    int i;
    public void show()
{
    System.out.println(i);
}};

public class singletonEnum {
    public static void main(String[] args) {
        ABC obj = ABC.INSTANCE;
        obj.i=5;
        obj.show();
        
        ABC obj2 = ABC.INSTANCE;
        obj2.i=6;
        obj.show();
        
        
    }    
}
