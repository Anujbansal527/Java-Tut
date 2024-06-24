
abstract class Vehicle{
    abstract  void acceleration();
    abstract int brakes(int wheels);
    void honks(){
        System.out.println("Vehicle is honking");
    }
} 

class Car extends Vehicle{

    @Override
    void acceleration(){
        System.err.println("Car acceleration");
    }
    @Override
     int brakes(int wheels){
        System.err.println("car has "+wheels);
        return wheels;
    }    
}


public class abstraction {
    public static void main(String[] args) {
        Car c = new Car();
        c.acceleration();
        c.brakes(4);
        c.honks();
    }
}

/*
 * using abstract keyword
 * having abstract and concrete methods( start from java 8 se start hua)
 * bydefault -> public static abstract 
 * never create instance of abstract class
 * compulsary to inherit abstract class
 * using sub class we can access data from abstract class
 * we can make static method in abstract class it become concrete
 * we can make mian methodas abstract 
 */
//done by 2 type 
// using abstract class 
//using interface
