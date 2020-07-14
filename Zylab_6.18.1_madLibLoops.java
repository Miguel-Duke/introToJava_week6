import java.util.Scanner;

public class MadLibWithLoops {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String quit = "quit";
        int zero = 0;

        String userString = scan.next();
        int userInt = scan.nextInt();

        while ( userString != quit && userInt != zero ){
            System.out.println("Eating " + userInt +" "+ userString + " a day keeps the doctor away.");
            userString = scan.next();
            userInt = scan.nextInt();
            continue;
        }
    }
}

/* All tests passed! */