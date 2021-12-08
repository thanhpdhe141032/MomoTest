import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class main {


    public static void main(String[] args) {
        Service service = new Service();
        Validate validate = new Validate();
        System.out.println("Enter your money: ");

        int balance = validate.checkInputInt();
        while (true) {
            if (balance % 10000 != 0 && balance > 200000) {
                System.out.print("Invalid money.Enter your money:");
                balance = validate.checkInputInt();
            } else {
                break;
            }
        }
        service.coinHandle(balance);
    }
}
