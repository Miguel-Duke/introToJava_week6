import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int n;
        int i;

        System.out.println("Enter an integer:");
        n = scnr.nextInt();

        System.out.print("Sequence: ");
        /* Type your code here. */

        n = Math.abs(n);

        for (i = 0 - n; i <= n; i++){
            System.out.print("" + i + " ");
        }
        System.out.println("");
    }
}

/* All tests passed! */