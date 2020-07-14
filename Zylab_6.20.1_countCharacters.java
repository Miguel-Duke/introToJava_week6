import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String userChar = scan.next();
        String userString = scan.nextLine();

        int count = 0;

        for (int i = 0; i < userString.length(); i++){
            if ( userString.charAt(i) == userChar.charAt(0) ){
                ++count;
            }

            continue;
        }

        System.out.println(count);
    }
}

/* All tests passed! */