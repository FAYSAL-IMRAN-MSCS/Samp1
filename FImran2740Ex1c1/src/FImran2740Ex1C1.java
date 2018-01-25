
import java.util.Scanner;

public class FImran2740Ex1C1 {
    public static void main(String[] args) {

        System.out.println("Fimran, COMC2740 Ex1C3" + "\n");

        Scanner sc = new Scanner(System.in);

        System.out.print(" Acct#: ");
        int acctNum = sc.nextInt();

        System.out.print("First Name: ");
        String firstName = sc.next();

        System.out.print("Last Name: ");
        String lastName = sc.next();

        System.out.print(" Monthly income: ");
        double income = sc.nextDouble();

        System.out.print(" rent: ");
        double rent = sc.nextDouble();

        System.out.print(" Electric: ");
        double electric = sc.nextDouble();

        System.out.print(" Gas: ");
        double gas = sc.nextDouble();

        System.out.print(" Cable: ");
        double cable = sc.nextDouble();

        double monthlyExpenses = rent + electric + gas + cable;
        double netIncome = income - monthlyExpenses;

        System.out.print("Account: " + acctNum + " " + firstName + " " + lastName);
        System.out.println("Income - Expenses: " + "$" + income + " - $" + monthlyExpenses + " = $" + netIncome);

    }
}
