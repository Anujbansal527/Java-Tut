
class A{
    static A a = new A(); //step 1 create an static instance
    private A(){} //step 2 create private constructor .. to avoid using obj using constructor
    public static A getInstance(){ // step 3 create static method that return the object of a class 
        return a;    
    } 
}

public class singleton_meth {
    public static void main(String[] args) {
        A a = A.getInstance();
    }    
}
