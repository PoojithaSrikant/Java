import java.lang.invoke.SwitchPoint;

public class switchcase {
    public static void main(String[] args) {
        int num =6;
        switch (num){
            case 1 -> System.out.println("sunday");
            case 2 -> System.out.println("monday");
            case 3 -> System.out.println("tuesday");
            case 4 -> System.out.println("wednesday");
            case 5 -> System.out.println("thursday");
            case 6 -> System.out.println("friday");
            case 7 -> System.out.println("saturday");
            default -> System.out.println("Invalid data");


        }
    }
}
