
public class array {
    public static void main(String[] args) {
        
        //first
        int[] arr1;//declear
        arr1 = new int[5];//initiate
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;
        arr1[3] = 40;
        arr1[4] = 50;
        for(int i : arr1){
            System.out.println(i);
        }

        //second
        int arr2[] = {1,2,3,4,5,6};
        for(int i=0 ; i<arr2.length; i++){
            System.err.println("arr2"+i);
        }

         // declaring and initializing 2D array
         int arr2d[][] = { { 2, 7, 9 }, { 3, 6, 1 }, { 7, 4, 2 } };

     // printing 2D array
     for (int i = 0; i < 3; i++) {
         for (int j = 0; j < 3; j++)
             System.out.print(arr2d[i][j] + " ");

         System.out.println();
     }
    }

    //
    int arr2d2[][] = new int[5][4];
    
}


