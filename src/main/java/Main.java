import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {


    public static <scanner> void main(String[] args ){
        System.out.println("what is your name");
        Scanner in = new Scanner(System.in);
        String username = in.nextLine();
        String alice= "alice";
        String String = "bob";


        if(alice.equals(username)) {
            System.out.println("access granted");

        }



    }
}
