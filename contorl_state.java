public class contorl_state {
    public static void main(String[] args) {
       
        if(true){
            System.err.println("if block");
        }

        if (false) {
            System.err.println("if block");
        } else {
            System.err.println("else block");
        }
        
        if (false) {
            if (false) {
                System.err.println("if block");
            } else {
                System.err.println("else block");
            }
        } else {
            if (false) {
                System.err.println("if block");
            } else {
                System.err.println("else block");
            }
        }

        if (false) {
            System.err.println("if block");
        }else if(true){
            System.err.println("else if block");
        }else{
            System.err.println("else block");
        }

        int a = 4/2;
        
        switch (a) {
            case 1: System.err.println("state 1"); break;
            case 2: System.err.println("state 2"); break;
            case 3: System.err.println("state 3"); break;
            case 4: System.err.println("state 4"); break;
            case 5: System.err.println("state 5"); break;
            default: throw new AssertionError();
        }
    }
}
