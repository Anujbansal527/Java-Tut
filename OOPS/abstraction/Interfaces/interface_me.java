interface livinOrganism{
    void eat();
}

interface Animal extends livinOrganism{
    public static final int legs = 4; //bydefault <--
    void walk();
    void pet();

    //default methods
    default void speak(){
        System.err.println("speaking");
    }
}

interface Humans extends livinOrganism{
    public static final int h_legs = 2;
    void walk();
    void talk();
}

class Robot implements Animal,Humans{
    public void eat(){
        System.err.println("Energy");
    }
    public void walk(){
        System.out.println("Walking");
        }
    public void pet(){
            System.out.println("Petting");
            }
    public void talk(){
                System.out.println("Talking");
    }            
}

public class interface_me {
    public static void main(String[] args){
        Robot r = new Robot();
        r.eat();    
        r.walk();
        r.pet();
        r.talk();
    }    
}


/*
 * by deafult all variables are pulic static final
 * before java 8 here we can only create abstract method but after java8 we can also create non abstract method that is default methods
 */