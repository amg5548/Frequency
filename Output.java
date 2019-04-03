
import java.util.Scanner;

public class Output {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string of characters: ");
        String x = input.nextLine();
        System.out.println();
        System.out.println("The most frequently occuring character is: " + Library.frequencyFinder(x));
    }
}
