import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("please enter an expression using only parentheses");
        Scanner reader = new Scanner(System.in);

        String expression = reader.nextLine();
        Balance balance = new Balance();
        balance.balance(expression);
        reader.close();
    }
}
