import java.util.Scanner;

public class TestAverage {

    // Method to calculate the average of an integer array
    public static int average(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length; // Returns the integer average
    }

    // Method to calculate the average of a double array
    public static double average(double[] array) {
        double sum = 0.0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length; // Returns the double average
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter 10 double values
        System.out.println("Enter ten double values:");
        double[] doubleArray = new double[10];
        for (int i = 0; i < 10; i++) {
            doubleArray[i] = scanner.nextDouble();
        }

        // Calculate and display the average
        double avg = average(doubleArray);
        System.out.println("The average of the entered double values is: " + avg);
        
        // Example to test integer array (optional, if you'd like)
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int intAvg = average(intArray);
        System.out.println("The average of the integer array {1, 2, 3, 4, 5, 6, 7, 8, 9, 10} is: " + intAvg);
        
        scanner.close();
    }
}
