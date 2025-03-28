class add{

    public int add(int c, int d){

        int result = c+d;
        return result;
    }

    public String str(int a){

        if(a>=10)
            return "Music";
        
        return "Nothing";
    }



}

class classs{
    public static void main(String a[]){
        int d = 10;
        int b = 20;

        add obj = new add();

        int res = obj.add(d,b);
        String str1 = obj.str(12);
        System.out.println(res);
        System.out.println(str1);
    }
}