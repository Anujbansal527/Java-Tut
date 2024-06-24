public class string {
    public static void main(String[] args) {
        String st1 ="hello";
        String st2 ="    World   ";
        String st3;

        //concat
        st3 = st1 + " " + st2;
        System.err.println(st3);
    
        //length
        int len = st1.length();
        System.err.println("len" + len);

        //charAt();
        for(int i=0;i<=st1.length();i++)
            System.out.println("char at"+i+" "+st1.charAt(i));

        //cpmparing
        boolean b = st1.equals(st2);
        System.err.println("comp"+b);

        //subString
        String sub = st1.substring(2,st1.length());
        System.out.println("sub" + sub);
    }    
}
