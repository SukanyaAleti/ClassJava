public class MinMaxArray {
        public static void main(String[] args) {
            int[] numbers = {5, 10, 2, 15, 7};

            int smallest = numbers[0];
            int largest = numbers[0];

            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] < smallest) {
                     smallest = numbers[i];
                }
                if (numbers[i] > largest) {
                    largest = numbers[i];
                }
            }

            System.out.println("Smallest number: " + smallest);
            System.out.println("Largest number: " + largest);
        }
    }

