class pooji {
    public static int sub(int x, int y) {
        int v= x - y;
        return v;

    }
    public static int add(int x,int y) {
        int w= x + y;
        return w;
    }
    public static int mul(int x,int y) {
        int x1 = x * y;
        return x1;
    }
    public static int div(int x,int y) {
        int y1= x / y;
        return y1;
    }
    public static int mod(int x,int y) {
        int z = x % y;
        return z;
    }


    }


class method_overload {
    public static void main(String[] args) {

        int d = pooji.sub(2,3);
        int d1 = pooji.add(2,2);
        int d2 = pooji.mul(5,6);
        int d3 = pooji. div(6,9);
        int d4 = pooji.mod(14,2);
        System.out.println(d);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);






    }
}









