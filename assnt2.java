import java.util.Scanner;

public class assnt2 {
    public static void main(String[] args) {
        String s=("above60,btw30-60,btw20-30,less than 20");
        int num=2;

            Scanner a = new Scanner(System.in);
            int age = a.nextInt();
            switch (age) {
                case 1 -> System.out.println("retirement");
                case 2 -> System.out.println("focus on job");
                case 3 -> System.out.println("study hard");
                case 4 -> System.out.println("enjoy your life");
                default -> System.out.println("invalid data");

            }
        }
    }
