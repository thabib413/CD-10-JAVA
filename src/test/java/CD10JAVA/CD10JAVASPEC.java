package CD10JAVA;

import java.util.Scanner;

/**
 * Created by taiseerhabib on 5/21/16.
 */
public class CD10JAVASPEC {

    public static void main(String[] args) {
        System.out.println("Please enter a positive integer:\n");
        int n;
        int printout=0;

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        System.out.println(n);

        for (int i = 1; i<=n; i++) {
            printout +=i;
        }
        System.out.println(printout);
    }
}
