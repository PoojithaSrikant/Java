import java.util.Scanner;

public class assgnt {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.println("enter five numbers");
        int a= z.nextInt();
        int b= z.nextInt();
        int c= z.nextInt();
        int d= z.nextInt();
        int e= z.nextInt();
        double avg = (a+b+c+d+e)/5;
        if (avg>=90){
            System.out.println("you will get bicycle");
        }
        else if (avg>=70 && avg<90) {
            System.out.println("you will get chocolate");
        }
        else {
            System.out.println("study hard");
        }
    }
}















