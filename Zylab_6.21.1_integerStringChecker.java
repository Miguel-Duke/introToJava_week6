import java.util.Scanner;

public class IntegerStringChecker {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userString;
        boolean isNum = true;
        char C;

        userString = scnr.next();

        for ( int i = 0; i < userString.length(); i++ ){
            C = userString.charAt(i);
            if ( Character.isDigit(C) ){
                continue;
            }
            else{
                isNum = false;
                break;
            }
        }

        if (isNum == true){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}

/* All tests passed! */