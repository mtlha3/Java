class conditions{
    public static void main(String[] args) {
        int a = 10;

        if (a <= 100){
            System.out.println("The number is less than or equal to 100");
        }
        else if (a >= 100){
            System.out.println("The number is greater than or equal to 100");
        }
        else{
            System.out.println("Error");
        }


        int n = 4;
        int result = 0;

        if (n%2==0){
            result=10;
            System.out.println("The number is even");
        }
        else if(n%2!=0){
            result=11;
            System.out.println("The number is odd");
        }


        result= n%2==0 ? 10:20;

        System.out.println(result);

    }
}