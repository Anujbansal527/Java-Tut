public class loops {
    public static void main(String[] args) {
        // for loop
        for (int i = 0; i < 5; i++) {
            System.out.println(" for Hello World!");
            }
        
        //while
        int i = 0;
        while (i < 5) {
            System.out.println("while Hello World!");
            i++;
            }
        
        //do ... while
        int j = 0;
        do {
            System.out.println("do..while Hello World!");
            j++;
            } while (j < 5);

        //for each
        int arr[] = {5,3,7,6,1,8,2};
        for(int l : arr){
            System.out.println(l);
        }

        //nested for each
        int arr1[][] = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
            for(int k[] : arr1){
                for(int l : k){
                    System.out.println(l);
                    }
                    }

        //nested loops
        for (int a = 0; a < 5; a++) {
            for (int b = 0; b < 5; b++) {
                System.out.println("nested Hello World!");
                }
            }

        int c=0,d=0;
        while(c<5){
            while(d<5){
                System.out.println("nested while Hello World!");
                d++;
                }
                c++;
                d=0;
                }
        
        int e=0,f=5;
        do { 
            do { 
                System.err.println("nested do..while ");
                f--;
            } while (f==0);
            e++;
        } while (e<0); 
    }  
}
