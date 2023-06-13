package June12;
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            int index = 3;
            int value = numbers[index];
            System.out.println("value :" +value);
        } catch (ArrayIndexOutOfBoundsException e) {
            try {
                throw new CustomException("Custom Exception: Invalid index");
            } catch (CustomException customException) {
                System.out.println(customException.getMessage());
            }
        }
    }
}

