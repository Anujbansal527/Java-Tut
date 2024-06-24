class ABC {
    public static ABC obj;
    int i;
    private ABC(){
        System.out.println("Obj Created");
    }
    public static ABC getInstnce(){
        if(obj == null){
            obj = new ABC();
        }
        return obj;
    }
}
public class sinleTon_meth1 {
    public static void main(String[] args) {
        ABC obj1 = ABC.getInstnce();
        ABC obj2 = ABC.getInstnce();
    }
}
