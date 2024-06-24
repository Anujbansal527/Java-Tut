
//data hiding can be achieve here
//binding data in a single unit that is class ... inside variable and methods
//we can also bind data in single unit using package -> to create package we use package package_name;

//to check access modifiers
//https://media.geeksforgeeks.org/wp-content/uploads/20240516114231/Access-Modifiers-in-Java-2.webp

class Student{

    private int rollNo;
    private String name;
    
    Student(){}

    //setting data using constructor
    Student(int r,String n){
        this.rollNo = r;
        this.name=n;
    }

    //setting data using method
    public void setRollno(int r){
        this.rollNo = r;
    }

    public int getRollno(){
        return rollNo;
    }

    public void setName(String n){
        this.name = n;
    }

    public String getName(){
        return name;
    }

}

public class encapsulation {
    
    public static void main(String[] args) {
        //using methods
        Student s1 = new Student();
        s1.setRollno(101);
        s1.setName("Rahul");
        System.err.println(s1.getRollno()+" "+s1.getName());
        
        //uisng constructor
        Student s2 = new Student(102,"Rohan");
        System.out.println(s2.getRollno()+" "+s2.getName());
    }
}
