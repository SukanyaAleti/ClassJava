public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int x = 2;

        rotateLeft(arr, x);


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void rotateLeft(int[] arr, int x) {
        int n = arr.length;


        x = x % n;

        for (int i = 0; i < x; i++) {

            int temp = arr[0];


            for (int j = 0; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }


            arr[n - 1] = temp;
        }
    }
}
