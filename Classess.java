class add{

    public int add(int c, int d){

        int result = c+d;
        return result;
    }



}

class classs{
    public static void main(String a[]){
        int d = 10;
        int b = 20;

        add obj = new add();

        int res = obj.add(d,b);
        System.out.println(res);
    }
}