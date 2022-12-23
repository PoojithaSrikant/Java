import java.util.Scanner;

public class elseif {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        int age = s.nextInt();
        if (age > 60) {
            System.out.println("retirement");
        } else if (age > 30 && age < 60)
        {
            System.out.println("focus on job");
        }
        else if (age > 20 && age < 30) {
            System.out.println("study hard");
        } else if (age <20) {
            System.out.println("enjoy your life");

        }

    }
}

