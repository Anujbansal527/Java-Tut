
abstract class Car{
    abstract public void fuel();
    public void color(){
        System.err.println("Black colour");
    }
}

class tata extends Car{
    public void fuel(){
        System.out.println("Diesel fuel");
    }
}



public class abstration {
    public static void main(String[] args) {
        tata nexon = new tata();
        nexon.fuel();
        nexon.color();
    }
}
