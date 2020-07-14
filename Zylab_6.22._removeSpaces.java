import java.util.Scanner;

public class RemoveSpaces {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String userInput = scan.nextLine();

        userInput = userInput.replace(" ","");

        System.out.println(userInput);
    }
}

/* All tests passed! */