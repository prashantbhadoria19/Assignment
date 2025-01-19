import java.util.Scanner;

public class AverageOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        double n1 = scanner.nextDouble();
        
        System.out.print("Enter the second number: ");
        double n2 = scanner.nextDouble();
        
        System.out.print("Enter the third number: ");
        double n3 = scanner.nextDouble();
        
        double average = (n1 + n2 + n3) / 3;
        
        System.out.println("The average of the three numbers is: " + average);
    }
}
