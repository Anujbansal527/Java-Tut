interface Hello{
    public String say(String name);
}

public class lamdawithpara {
    public static void main(String[] args) {
        Hello h = (name)->{ return "Hello " + name; };
        System.out.println(h.say("anuj"));
    }    
}
