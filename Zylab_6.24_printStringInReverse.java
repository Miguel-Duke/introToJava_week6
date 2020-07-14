import java.util.Scanner;

public class StringReverser {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String quit = "quit";
        String Quit = "Quit";
        String q = "q";

        String userInput = scan.nextLine();

        while ( !userInput.equals(quit) && !userInput.equals(Quit) && !userInput.equals(q) ){

            for (int i = userInput.length() - 1; i >= 0; --i){
                System.out.print("" + userInput.charAt(i) );
            }
            System.out.println("");
            userInput = scan.nextLine();
        }
    }
}

/* All tests passed! */