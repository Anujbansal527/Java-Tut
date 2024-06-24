public class data_type {
    
    public static void main(String[] args) {
        

        //premitive
        boolean bo;
        byte by = 0;
        char ch;
        short sh;
        int in;
        long lo;
        float fl;
        double dou;
 
        //non primitive
        String st;
        int []arr;
   
        //size 
        System.err.println("byte"+Byte.SIZE);     
        System.err.println("short"+Short.SIZE);     
        System.err.println("integer"+Integer.SIZE);     
        System.err.println("long"+Long.SIZE);     
        System.err.println("Character"+Character.SIZE);     
        System.err.println("Float"+Float.SIZE);     
        System.err.println("Double"+Double.SIZE);     
    }
}

/*
 * Primitive Data Types Table – Default Value, Size, and Range
Data Type	Default Value	Default size	Range
byte	0	1 byte or 8 bits	-128 to 127
short	0	2 bytes or 16 bits	-32,768 to 32,767
int	0	4 bytes or 32 bits	2,147,483,648 to 2,147,483,647
long	0	8 bytes or 64 bits	9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
float	0.0f	4 bytes or 32 bits	1.4e-045 to 3.4e+038
double	0.0d	8 bytes or 64 bits	4.9e-324 to 1.8e+308
char	‘\u0000’	2 bytes or 16 bits	0 to 65536
boolean	FALSE	1 byte or 2 bytes	0 or 1

 */