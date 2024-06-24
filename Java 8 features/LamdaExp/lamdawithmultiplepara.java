interface Hello{
    public String say(String name , String lname);
}

interface Sum{
    public int add(int a, int b);
}

public class lamdawithmultiplepara {
    public static void main(String[] args) {
        Hello h = (name,lname)->{ return "Hello " + name + " " + lname; };
        System.out.println(h.say("anuj","bansal"));

        Sum s = (a,b)->{ return a+b;};
        System.out.println(s.add(10,20));
    }        
}
