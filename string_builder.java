public class string_builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello world");

        //charAt
        System.out.println("charAt(0) = " + sb.charAt(0));

        //setChar
        sb.setCharAt(0, 'h');
        System.out.println("After setCharAt(0, 'h'): " + sb.toString());

        //insert
        sb.insert(5, " beautiful");
        System.out.println("After insert(5, ' beautiful'): " + sb.toString());

        //delete
        sb.delete(5, 7);    
        System.out.println("After delete(5, 7): " + sb.toString());

        //append
        sb.append(" Java");
        System.out.println("After append(' Java'): " + sb.toString());

        //length
        System.out.println("Length: " + sb.length());

    }
}
