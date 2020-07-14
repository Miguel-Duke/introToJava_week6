import java.util.Scanner;

public class VariedInputData {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int userInt = 9999;
        int maxInt = 0;
        int numCount = 0;
        int preAvg = 0;
        int avg = 0;

        while (userInt >= 0 ){
            userInt = scan.nextInt();

            if (userInt < 0){
                continue;
            }

            if (userInt > maxInt ){
                maxInt = userInt;
            }

            ++numCount;
            preAvg = preAvg + userInt;
            continue;
        }

        avg = preAvg / numCount;

        System.out.print("" + avg + " " + maxInt);
        System.out.println("");
    }
}

/* All tests passed! */