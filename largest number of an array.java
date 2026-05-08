public class Main {
    public static void main(String[] args) {
        int[] numbers = {12, 45, 7, 91, 23, 64};
        
        // Start by assuming the first number is the largest
        int max = numbers[0];

        // Loop through the rest of the array
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i]; // Found a new champion!
            }
        }

        System.out.println("The largest element is: " + max);
    }
}
