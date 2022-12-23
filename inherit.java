class cal{
    public int cal_add(int x, int y){
        return x+y;
    }

}

class call extends cal{
    public int cal_sub(int x,int y){
        return x-y;
    }
    class call1 extends call{
        public int cal_mul(int x,int y){
            return x*y;
        }
        class call2 extends call1{
            public int cal_div(int x,int y){
                return x/y;
            }
        }
    }


}



public class inherit {
    public static void main(String[] args) {
        call c=new call();
        System.out.println(c.cal_add(2,5));



    }
}
