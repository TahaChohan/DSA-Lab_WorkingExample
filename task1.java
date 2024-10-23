import java.util.Scanner;

public class task1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter positive integer n: ");
        int n = scanner.nextInt();

        if (n > 0){
            int sum = n* (n+1)/2;

            System.out.println(" The Sum of first " + n + "Natural number:" + sum);

        }
        else{
            System.out.println("Enter positive number ");
        }

        scanner.close();
    }
}