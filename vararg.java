public class vararg {
    public int prod(int... arr) {
        int product = 1;
        System.out.println("Number of arguments:" +arr.length);  // length of the arguments
        for (int i = 0; i < arr.length; i++) {  // 0--3 0,1,2,3
            product = product * arr[i];    // i=0  1*3 3*6


        }
        return product;
    }

        public static void main (String[]args) {
            vararg v = new vararg();
            int y = v.prod(3, 6, 5, 8);
            System.out.println(y);


        }
    }

