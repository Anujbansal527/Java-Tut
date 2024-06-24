import java.util.Scanner;

public class operators {
    
    public static void arithematic() {
    Scanner sc = new Scanner(System.in);
 
        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();
 
        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();
 
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;
 
        System.out.println("The sum of the two numbers is: " + sum);
        System.out.println("The difference of the two numbers is: " + difference);
        System.out.println("The product of the two numbers is: " + product);
        System.out.println("The quotient of the two numbers is: " + quotient);
    }

    public static void unary() {

        int num = 10;
 
        int result = +num;
        System.out.println(
            "The value of result after unary plus is: "
            + result);
 
        result = -num;
        System.out.println(
            "The value of result after unary minus is: "
            + result);
 
        result = ++num;
        System.out.println(
            "The value of result after pre-increment is: "
            + result);
 
        result = num++;
        System.out.println(
            "The value of result after post-increment is: "
            + result);
 
        result = --num;
        System.out.println(
            "The value of result after pre-decrement is: "
            + result);
 
        result = num--;
        System.out.println(
            "The value of result after post-decrement is: "
            + result);
    }

    public static void shifting() {
        int a = 10;
    
        // using left shift
      System.out.println("a<<1 : " + (a << 1));
    
      // using right shift
      System.out.println("a>>1 : " + (a >> 1));

      //
      System.out.println("a>>>1 : " + (a >>> 1));
    }

    public static void relational() {         
        int num1 =1;
        int num2 = 2;      
        System.out.println("num1 > num2 is " + (num1 > num2));
        System.out.println("num1 < num2 is " + (num1 < num2));
        System.out.println("num1 >= num2 is " + (num1 >= num2));
        System.out.println("num1 <= num2 is " + (num1 <= num2));
        System.out.println("num1 == num2 is " + (num1 == num2));
        System.out.println("num1 != num2 is " + (num1 != num2));
    }

    public static void logical() {         
        boolean a = true;
        boolean b = false;

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("a && b: " + (a && b));
        System.out.println("a || b: " + (a || b));
        System.out.println("!a: " + !a);
        System.out.println("!b: " + !b); 
    }
    
    public static void assingment() {         
        int x = 10;  
          
        // Simple assignment operator  
        int y = x;  
        System.out.println("y = " + y);  
          
        // Addition assignment operator  
        x += 5;  
        System.out.println("x += 5: " + x);  
          
        // Subtraction assignment operator  
        x -= 3;  
        System.out.println("x -= 3: " + x);  
          
        // Multiplication assignment operator  
        x *= 2;  
        System.out.println("x *= 2: " + x);  
          
        // Division assignment operator  
        x /= 4;  
        System.out.println("x /= 4: " + x);  
          
        // Modulus assignment operator  
        x %= 3;  
        System.out.println("x %= 3: " + x);  
          
        // Left shift assignment operator  
        x <<= 2;  
        System.out.println("x <<= 2: " + x);  
          
        // Right shift assignment operator  
        x >>= 1;  
        System.out.println("x >>= 1: " + x);  
          
        // Bitwise AND assignment operator  
        x &= 5;  
        System.out.println("x &= 5: " + x);  
          
        // Bitwise OR assignment operator  
        x |= 2;  
        System.out.println("x |= 2: " + x);  
          
        // Bitwise XOR assignment operator  
        x ^= 1;  
        System.out.println("x ^= 1: " + x);  
        }

    public static void bitwise() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        System.out.println("Bitwise AND: " + (num1 & num2));
        System.out.println("Bitwise OR: " + (num1 | num2));
        System.out.println("Bitwise XOR: " + (num1 ^ num2));
        System.out.println("Bitwise NOT: " + (~num1));
        System.out.println("Bitwise Left Shift: " + (num1 << 2));
        System.out.println("Bitwise Right Shift: " + (num1 >> 2));
        System.out.println("Bitwise Unsigned Right Shift: " + (num1 >>> 2));

        input.close();
    }

    public static void tranary() {  
        
        boolean condition = true;
        String result = (condition) ? "True" : "False";
      
        System.out.println(result);
    }

    public static void main(String[] args) {
        operators op = new operators();
    }
}
