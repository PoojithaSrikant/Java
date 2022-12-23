import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class class1 {     // class1-name of the class
    public static void main(String[] args) throws NumberFormatException, IOException {  // main method
        int i,j; // declaring variables
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); // user input
        System.out.println("enter the value of i");
        i= Integer.parseInt(br.readLine()); // input is given by us,checking if the value is integer or not
        System.out.println(i);
        System.out.println("enter the value of j");
        j= Integer.parseInt(br.readLine());
        System.out.println(j);
        System.out.println(i+j);
        System.out.println(i-j); // arithmetic operators: + - * / %      // initialise operator: =
        System.out.println(i*j);                                         // relation operator: < > ==
        System.out.println(i/j);
        System.out.println(i%j);
        System.out.println(++i); // pre-increment operator: i=i+1
        System.out.println(i++);  // post-increment operator: i , i=i+1
    }
}
