class Array{
    public static void main(String[] args) {

        // Simple Array
        int arr[] = {1, 2, 3, 4, 5};

        arr[1] = 10;

        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        //2d Array

        int nums[][] = new int [3][4]; 

         for (int i = 0 ; i < 3; i++){
            for(int j = 0 ; j< 4 ; j++){
                nums[i][j]= (int) (Math.random()*100);
            }
        }


        for (int i = 0 ; i < 3; i++){
            for(int j = 0 ; j< 4 ; j++){
                System.out.print(nums[i][j]+ " ");
            }
            System.out.println();
        }

        //Jagged Array

        int jagged[][] = new int[3][];
        jagged[0] = new int[2];
        jagged[1] = new int[3];
        jagged[2] = new int[4];

         for (int i = 0 ; i < jagged.length; i++){
            for(int j = 0 ; j< jagged[i].length ; j++){
                jagged[i][j]= (int) (Math.random()*100);
            }
        }
        //print using enhance loop
        for(int m[] :jagged){
            for(int n : m){
                System.out.print(n + " ");
            }
            System.out.println();
        }

        }
}