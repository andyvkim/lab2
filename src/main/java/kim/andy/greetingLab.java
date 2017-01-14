package kim.andy;
import java.util.Scanner;

/**
 * Created by andykim on 1/12/17.
 */
public class greetingLab {



    public String sayAliceOrBob(String name) {


        if (name.equals("Alice")) {
            System.out.println("Alice");

        }
        else if (name.equals("Bob")){
            System.out.println("Bob");
        }

        return name;

    }

    public static void main(String[] args) {

        System.out.println("What's your name?");

        Scanner ask = new Scanner(System.in);

        String input = ask.nextLine();
    }
};
