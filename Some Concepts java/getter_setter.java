
/* Getter Setter is also Known as java beans */

class Person{
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String Name){
        this.name=Name;
    }
}


public class getter_setter {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Anuj");
        System.out.println(p.getName());
    }
}
