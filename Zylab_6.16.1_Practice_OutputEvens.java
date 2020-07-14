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

        if ( n <= 0 ){
            n = 0;
            System.out.print("" + n + " ");
        }

        if ( n > 0){
            for (i = n; i >= 0; --i){
                if ( i % 2 != 0){
                    continue;
                }
                else{
                    System.out.print("" + i + " ");
                }
            }
        }
        System.out.println("");
    }
}

/* All tests passed! */