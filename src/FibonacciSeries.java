public class FibonacciSeries {
    public static void main(String[] args) {
        int N = 10;

        int firstTerm = 0;
        int secondTerm = 1;

        System.out.print(firstTerm + " " + secondTerm + " ");

        for (int i = 2; i < N; i++) {
            int nextTerm = firstTerm + secondTerm;
             System.out.print(nextTerm + " ");

            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}


