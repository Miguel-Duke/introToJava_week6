import java.util.Scanner;

public class CountdownToDigitMatch {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int userInt = scan.nextInt();

        if (userInt < 20 || userInt > 98){
            System.out.println("Input must be 20-98");
        }
        else {
            int num1 = userInt / 10;
            int num2 = userInt % 10;
            while ( num1 != num2){
                System.out.print("" + num1 +"" + num2 + " ");
                --userInt;
                num1 = userInt / 10;
                num2 = userInt % 10;
                continue;
            }
            System.out.println(userInt + " ");
        }
    }
}

/* All tests passed */