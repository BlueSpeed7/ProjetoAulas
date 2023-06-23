// @author RA21600867
package projetoaula005;
import java.util.Scanner;
public class Password {
    public static void main(String[] args) {
        int password, tries = 0;
        Scanner sc = new Scanner(System.in);
        do {
            tries ++;
            System.out.println("Remaining tries: " + (4 - tries));
            System.out.print("Input password: ");
            password = sc.nextInt();
            if (password == 123)
                System.out.println("Access granted.");
            else
                if (tries < 3)
                    System.out.println("Access denied. Password received: " + password);
                else
                    System.out.println("Access blocked.");
        }
        while (password != 123 && tries < 3);
    }
}