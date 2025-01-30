package methot;

import java.util.Scanner;

public class FibonacciWithRecursive {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many steps do you want?  :");
        int step = input.nextInt();
        System.out.print(fibonacci(step));

    }

    static int fibonacci(int step) {
        if ((step == 1) || (step == 2)) {
            return 1;
        }

        return fibonacci(step - 1) + fibonacci(step - 2);

    }
}
