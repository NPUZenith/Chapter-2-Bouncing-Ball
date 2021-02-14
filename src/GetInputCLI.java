import java.util.*;

public class GetInputCLI
{
    public static void main(String[] args) {
        //Create a scanner ""input" for input
        Scanner input = new Scanner(System.in);

        //Prompt user for values
        System.out.println("Enter height: ");
        double height = input.nextDouble();
        System.out.println("Enter coefficient: ");
        double coefficient = input.nextDouble();
        System.out.println("Enter bounce");
        int bounce = input.nextInt();

        //Print out the calculation
        System.out.println(height * coefficient);
    }
}
