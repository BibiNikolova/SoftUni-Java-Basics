import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        while (sum < n ) {
            int currentSum = Integer.parseInt(scanner.nextLine());
            sum += currentSum;
        }
        System.out.println(sum);
    }
}
