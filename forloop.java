import java.util.Scanner;

public class forloop {
    public static void main(String[] args) {
       int  c=0;
        Scanner s = new Scanner(System.in);
        System.out.println("enter a string");
        String str = s.nextLine();
        char[] a= str.toCharArray();
        for(char ch : a)
        {
            c++;
        }
        System.out.println("string contains "+c+" characters");
    }
}

