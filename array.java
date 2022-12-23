import java.util.ArrayList;

public class array {
    public static void main(String[] args) {
        int i;
        float k = 6.453f;
        double s = 2.34;
        String str = "pooji";
        char c = 'a';
        int[] arr2 = {2, 3, 4, 5}; // similar data type integer
        String[] ar = {"moolya", "pooji", "juhi"}; // string array
        char[] arr1 = {'a', 'b', 'c', 'd'}; // char array
        System.out.println(ar.length);
        System.out.println(arr2[2]);
        System.out.println(ar[1]);


        // creating  integer array list
        ArrayList<Integer> arr = new ArrayList<Integer>(); //array list
        arr.add(45); arr.add(23); arr.add(2); arr.add(8);  arr.add(2,65); // replacing index value in array
        System.out.println(arr.size()); // size of the array
        System.out.println(arr.get(3)); // checking array in the list
        System.out.println(arr.isEmpty()); // checking array is empty or not
        arr.remove('3');   // remove array
        System.out.println(arr.get(3));


        // cre









    }

}