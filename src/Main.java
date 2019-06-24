import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, Welcome!!");

        ArrayList<String> movies = new ArrayList<>();

        Scanner in = new Scanner(System.in);
        String input="";
        boolean flag = true;

        while(flag)
        {
            System.out.println("Enter a Movie or press Q to quit: ");
            input = in.next();

            if(input.equals("q") || input.equals("Q"))
            {
                flag = false;
            }
            else
            {
                movies.add(input);
            }
        }

        for(String name : movies)
        {
            System.out.println(name);
        }
    }
}
