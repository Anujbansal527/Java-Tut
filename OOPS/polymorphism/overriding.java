
class Animal{
    void eat(){
        System.out.println("Animal is eating");
        }
}
class dog extends  Animal{
    void eat(){
        System.out.println("Dog is eating");
        }
}

class cat extends Animal{
    void eat(){
        System.out.println("Cat is eating");
        }
}


public class overriding {
    public static void main(String[] args) {

        Animal an = new Animal(); // Create a Animal object
        Animal d = new dog(); // Create a Dog object
        Animal c = new cat(); // Create a Cat object

        an.eat();
        d.eat();
        c.eat();
    }    
}
