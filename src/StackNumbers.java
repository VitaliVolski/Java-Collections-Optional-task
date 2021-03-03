//Ввести число, занести его цифры в стек.
// Вывести число, у которого цифры идут в обратном порядке.

import java.util.Scanner;
import java.util.Stack;

public class StackNumbers {

    public static void main(String[] args) throws Exception {

        System.out.println("Write any numbers using space and press Enter:");
        Scanner scanner = new Scanner(System.in);
        String inputNumbers = scanner.nextLine();

        Stack<Character> stackNumbers = new Stack<>();
        for (char numbers : inputNumbers.toCharArray()) {
            stackNumbers.push(numbers);
        }
        while (!stackNumbers.empty()) {
            System.out.print(stackNumbers.pop());
        }
    }
}


