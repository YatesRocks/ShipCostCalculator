import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static int get_int() {
        System.out.print("Please enter an integer price: ");
        Scanner in = new Scanner(System.in);
        int res;
        try {
            res = in.nextInt();
        } catch (InputMismatchException e) {
            System.out.println(e);
            System.out.println("Input an integer please.");
            return get_int();
        }
        return res;
    }

    public static void main(String[] args) {
        int price = get_int();
        double shipping_fee;
        if (price >= 100) {
            shipping_fee = 0;
        } else {
            shipping_fee = price * 0.02;
        }
        double total = price + shipping_fee;
        System.out.print("Shipping: $" + shipping_fee + "; Total: $" + total);
    }
}