import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a positive integer N: ");
        int N = scanner.nextInt();

        // לסכום את כל המספרים מ 1 עד N
        int sum = 0;


        for (int i = 1; i <= N; i++) {
            sum += i;   // כמו לכתוב sum = sum + i
        }


        System.out.println("The sum of all numbers from 1 to " + N + " is: " + sum);
    }
}