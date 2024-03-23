import java.util.Random;
import java.util.Scanner;
public class Main {
    public static double getAverage(int values[]){
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return (double) sum / values.length;
    }
    public static void main(String[] args) {
        // Part A
        int[] dataPoints = new int[100];

        //Part B
        Random rnd = new Random();
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }

        // Part C
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i]);
            if (i < dataPoints.length - 1) {
                System.out.print(" | ");
            }
        }
        System.out.println(); // New line after displaying the array values

        // Part D
        int sum = 0;
        for (int value : dataPoints) {
            sum += value;
        }
        double average = (double) sum / dataPoints.length;
        System.out.println("The sum of the random array dataPoints is: " + sum);
        System.out.printf("The average of the random array dataPoints is: %.2f", average);

        // Part 2.A
        Scanner in = new Scanner(System.in);
        int userInput = SafeInput.getRangedInt(in,"Please enter an integer between 1 and 100", 1, 100);

        // Part 2.B
        int count = 0;
        for (int value : dataPoints) {
            if (value == userInput) {
                count++;
            }
        }
        if (count == 1) {
            System.out.println("The value " + userInput + " appears " + count + " time in the array.");
        }
        else {
            System.out.println("The value " + userInput + " appears " + count + " times in the array.");
        }

        // Part 2.C
        boolean inArray = false;
        int newInput = SafeInput.getRangedInt(in, "Please enter another integer between 1 and 100", 1, 100);
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == newInput) {
                System.out.println("Your value, " + newInput + ", was found at array index position " + i);
                inArray = true;
                break;
            }
        }
        if (!inArray) {
                System.out.println("Your value, " + newInput + ", was not found in the array");
            }
        System.out.println(); // New Line
        // Part 2.D
        int min = dataPoints[0];
        int max = dataPoints[0];
        for (int i = 1; i < dataPoints.length; i++) {
            if (dataPoints[i] < min) {
                min = dataPoints[i];
            }
            if (dataPoints[i] > max) {
                max = dataPoints[i];
            }
        }
        System.out.println("The minimum value in the array is: " + min);
        System.out.println("The maximum value in the array is: " + max);

        //Part 2.E
        System.out.println(); //new line
        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));
        }
    }
