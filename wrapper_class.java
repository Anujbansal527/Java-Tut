
public class wrapper_class {

    public static void parser_methods(String[] args) throws NumberFormatException {
        int in = Integer.parseInt("100");
        short sh = Short.parseShort("100");
        long lo = Long.parseLong("100");
        byte by = Byte.parseByte("100");
        float fl = Float.parseFloat ("19.95");
        double doub = Double.parseDouble ("19.95");
        boolean boo = Boolean.parseBoolean("true");

    }

    public static void Size_of_datatype(String[] args) {
        
        System.out.println( 
            "S.No.\t  Data Type\t  Size\t  Min. Value\t\t  Max. Value\t"); 
        System.out.println("1\t  Byte\t\t" + Byte.SIZE 
                           + "\t" + Byte.MIN_VALUE 
                           + "\t\t\t" + Byte.MAX_VALUE); 
        System.out.println("2\t  Short\t\t" + Short.SIZE 
                           + "\t" + Short.MIN_VALUE 
                           + "\t\t\t" + Short.MAX_VALUE); 
        System.out.println("3\t  Integer\t" + Integer.SIZE 
                           + "\t" + Integer.MIN_VALUE 
                           + "\t\t" + Integer.MAX_VALUE); 
        System.out.println("4\t  Float\t\t" + Float.SIZE 
                           + "\t" + Float.MIN_VALUE 
                           + "\t\t\t" + Float.MAX_VALUE); 
        System.out.println("5\t  Long\t\t" + Long.SIZE 
                           + "\t" + Long.MIN_VALUE + "\t"
                           + Long.MAX_VALUE); 
        System.out.println("6\t  Double\t" + Double.SIZE 
                           + "\t" + Double.MIN_VALUE 
                           + "\t\t" + Short.MAX_VALUE); 
        System.out.println("7\t  Character\t"
                           + Character.SIZE); 
    }
    public static void main(String[] args) {
         Integer myInt=5;
         Double myDouble = 5.99;
         Character myChar = 'A';

         System.out.println(myInt);
         System.out.println(myDouble);
         System.out.println(myChar);

         System.out.println(myInt.intValue());
         System.out.println(myDouble.doubleValue());
         System.out.println(myChar.charValue());

         String myString = myInt.toString();
         System.out.println(myString.length());
         
         wrapper_class.parser_methods(args);
         wrapper_class.Size_of_datatype(args);
    }   
}

/*
 * Primitive Data Type	Wrapper Class
byte	Byte
short	Short
int	Integer
long	Long
float	Float
double	Double
boolean	Boolean
char	Character

 */

 /*
  Wrapper parse Method

Example Statement

Integer

parseInt(String)

int x = Integer.parseInt(“100”);

Short

parseShort(String)

short x = Short.parseShort(“100”);

Long

parseLong(String)

long x = Long.parseLong(“100”);

Byte

parseByte(String)

byte x = Byte.parseByte(“100”);

Float

parseByte(String)

float x = Float.parseFloat (“19.95”);

Double

parseByte(String)

double x = Double.parseDouble (“19.95”);

Boolean

parseBoolean

boolean x = Boolean.parseBoolean
  */