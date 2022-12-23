import java.util.Scanner;

public class vowels {
    public static void main(String[] args) {
        int i=0;
        Scanner s = new Scanner(System.in);
        System.out.println("enter the string");
        String str = s.nextLine();
        for( i=0;i<str.length();i++){
            char ch= str.charAt(i);
           if (ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'){
                i++;
           }
        }
        System.out.println("Number of vowels in the given sentence is "+i);

        }


    }

