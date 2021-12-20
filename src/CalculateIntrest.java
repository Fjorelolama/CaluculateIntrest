import java.util.Scanner;

public class CalculateIntrest {
    public static void main(String[] args) {
        int balance;
        double annual_intrest_rate;
        double intrest;

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the balance and intrest rate: ");

        balance = userInput.nextInt();
        intrest = userInput.nextDouble();
        annual_intrest_rate = userInput.nextDouble();

        intrest = balance * (annual_intrest_rate/1200);

        System.out.println("The Intrest is: " + intrest);



    }
}
