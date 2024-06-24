import java.util.StringJoiner;  

public class Stringjoiner {
    public static void main(String[] args) {

        StringJoiner joinNames = new StringJoiner(",");
        
        //StringJoiner joinNames = new StringJoiner(",", "[", "]");

        //tringJoiner joinNames2 = new StringJoiner(":", "[", "]");

        

        joinNames.add("Anuj");  
        joinNames.add("Kammo");  
        joinNames.add("himanshu");  
        joinNames.add("k2");  
                  
        System.out.println(joinNames);  
    }
}
