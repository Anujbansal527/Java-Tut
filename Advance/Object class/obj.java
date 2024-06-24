class Laptop extends Object{
    String model;
    int price;

    //Object class equals method
    public boolean equals(Laptop that){
        if(this.model.equals(that.model) && this.price == that.price){
            return true;
        }
        else{
            return false;
        }
    }

    //object class toString 
    @Override
    public String toString(){
        return model+" : "+ price;
    }
}

public class obj {
    public static void main(String[] args) {
        Laptop obj = new Laptop();
        obj.model="lanovo";
        obj.price=35000;
        System.out.println(obj);

        Laptop ob2 = new Laptop();
        obj.model="lanovo";
        obj.price=35000;

        System.out.println(ob2.equals(obj)); 
    }
}
