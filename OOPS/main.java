//classs
public class main{
    String colour;
    main(){
        colour = "red";
        System.err.println("constructor");
    }
    public  void print(){
        System.out.println("colour is "+colour);
    }
}


class class_obj{
    public static void main(String[] args) {

        main obj = new main();//creating object 

        main obj2;//declearing obj

        obj2 = new main();//creating instance
        
        obj.print();
        obj2.print();
}
}