

abstract  class Animal{
    
    private String name;
    
    public Animal(String name){
        this.name = name;
    }

    public abstract  void makeSound();
    
    public String getName(){
        return name;
    }    
}

class Cat extends Animal{
    public Cat (String name){
        super(name);
    }
    public void makeSound(){
        System.out.println(getName()+"Meow");
    }
}

class Dog extends Animal{
    public Dog (String name){
        super(name);
        System.err.println(name);
    }
    public void makeSound(){
        System.out.println(getName()+"Meow");
    }
}




public class abstract_class {
    
    Dog dog = new Dog("tommy");
    Cat cat = new Cat("pussy");
    
    
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


/*
    
*/