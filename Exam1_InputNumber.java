package Exam;

import java.util.Scanner;


public class Exam1_InputNumber {

    private static int[] changingSizeOfArray(int[] oldArray) {
        int newSize = oldArray.length * 2;
        int[] newArray = new int[newSize];
        System.arraycopy(oldArray, 0, newArray, 0, oldArray.length);
        return newArray;
    }
    private static void viewNumbers(int[] numbers, int count) {
        System.out.println("Print out all number:");

        for (int i = 0; i < count; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
    public static void main(String[] args) {
        int startSize = 5;

        int[] numbers = new int[startSize];
        
        int count = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number or input 0 to finish: ");
            String input = scanner.next();

            if (input.equalsIgnoreCase("0")) {
                break;
            }
            if (count == numbers.length) {
                numbers = changingSizeOfArray(numbers);
            }

            try {
                numbers[count] = Integer.parseInt(input);
                count++;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number or type 0 to finish.");
            }
        }

        
        viewNumbers(numbers, count);
    }
    
}






