public class invocation {
    public static void add(int x,int y){   //tc and tc1
        System.out.println(x+y);
    }
    public static void sub(int x, int y){    // note :- two methods can't have same method name with same parameter pass
        System.out.println(x-y);
    }
     public static void mul(int x,int y){
         System.out.println(x*y);
    }
    public static void div(int x,int y){
        System.out.println(x/y);
    }

    public static void main(String[] args) {   //main
        // by method invocation ----> you have to run one operation at a time
        //add() sub() mul() division()

        add(52,22);
        sub(5,8);
        mul(2,2);
        div(6,7);


    }
}

