
//Develop a Java program to add TWO matrices of suitable order N.  ( Using command line arguments)   
import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java MatrixAddition <N>");
            return;
        }

        int n = Integer.parseInt(args[0]);
        int[][] a = new int[n][n];
        int[][] b = new int[n][n];
        int[][] c = new int[n][n];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter elements of first matrix :");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = sc.nextInt();

        System.out.println("Enter elements of second matrix :");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                b[i][j] = sc.nextInt();

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                c[i][j] = a[i][j] + b[i][j];

        System.out.println("Sum of the two matrices:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(c[i][j] + "\t");
            System.out.println();
        }
        
        sc.close();
    }
}
