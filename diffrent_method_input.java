import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class diffrent_method_input {

    public static void BufferedReader_input(String[] args) throws IOException {
        InputStreamReader isbr = new InputStreamReader(System.in);

        BufferedReader br = new BufferedReader(isbr);

        String st = br.readLine();
        int integer = br.read();
    }
    
    public static void Scanner_input(String[] args) {
        Scanner sc = new Scanner(System.in);

        String st = sc.nextLine();
        
        String c = sc.next();
        
        short short_var = sc.nextShort();

        int integer = sc.nextInt();

        byte byte_var = sc.nextByte();

        double double_var = sc.nextDouble();

        float float_var = sc.nextFloat();

        boolean boolean_var = sc.nextBoolean();

        long long_var =sc.nextLong();

    }

    public static void main(String[] args) {
        

    }   
}


