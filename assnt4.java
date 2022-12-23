class assnt4 {
    public static String cal(String str) {
        String st = str.toUpperCase();

        return st;
    }

    public static int cal(int x, int y, int z) {
        int sum = x + y + z;
        return sum;
    }

    public static int cal(int x, int y) {
        int diff = x - y;

        return diff;
    }

    public static int cal(int x, int y, int z, int v) {
        int mul = x * y * z * v;

        return mul;

    }

    public static int cal(double x, int u) {
        double div = x / u;

        return (int) div;
    }
        public static void main(String[] args) {
            assnt4 obj = new assnt4();
            System.out.println(cal("pravallika"));
            System.out.println(cal(1,2,3));
            System.out.println(cal(6,4));
            System.out.println(cal(6,8,7));
            System.out.println(cal(12,6));
        }

    }




