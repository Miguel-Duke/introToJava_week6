import java.util.Scanner;

public class BruteForceEquationSolver {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int x = -10;
        int y = -10;

        boolean solved = false;

        int eq1A = scan.nextInt();
        int eq1B = scan.nextInt();
        int eq1C = scan.nextInt();

        int eq2A = scan.nextInt();
        int eq2B = scan.nextInt();
        int eq2C = scan.nextInt();

        for (x = -10; x <= 10; ++x){
            for ( y = -10; y <= 10; ++y ){
                if( ( (eq1A*x) + (eq1B*y) == eq1C ) && ( (eq2A*x) + (eq2B*y) == eq2C ) ){
                    System.out.println("" + x + " " + y );
                    solved = true;
                    break;
                }
                else{
                    continue;
                }
            }
        }
        if (solved == false){
            System.out.println("No solution");
        }
    }
}

/* All tests passed! */