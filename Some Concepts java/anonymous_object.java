class A{
    void show(){
        System.out.println("A's show method");
    }
}


public class anonymous_object {
    public static void main(String[] args) {
        new A().show();
    }    
}
