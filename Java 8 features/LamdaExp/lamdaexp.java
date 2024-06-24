interface Drawing{
    public void draw();
}

public class lamdaexp {
    public static void main(String[] args) {
        int width = 10;
        Drawing d = () ->{
            System.out.println("Drawing "+width);
        };

        d.draw();
    }    
}
