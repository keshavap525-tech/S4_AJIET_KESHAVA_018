public class Main {
    public static void main(String[] args) {
        int[] numbers = {12, 45, 7, 91, 23, 64};
        
        // Start by assuming the first number is the smallest
        int min = numbers[0];

        // Loop through the array
        for (int i = 1; i < numbers.length; i++) {
            // Only change: use the 'less than' sign
            if (numbers[i] < min) {
                min = numbers[i]; // Found a new smallest number!
            }
        }

        System.out.println("The smallest element is: " + min);
    }
}
