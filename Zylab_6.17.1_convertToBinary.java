import java.util.Scanner;

public class IntegerToBinary {
    public static void main(String[] args) {
        int x;

        Scanner scan = new Scanner(System.in);

        x = scan.nextInt();

        while ( x > 0 ){
            System.out.print( x % 2 );
            x = x / 2;
        }

        System.out.println("");
    }
}

/* All tests passed! */