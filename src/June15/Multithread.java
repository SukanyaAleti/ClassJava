package June15;

public class Multithread {
        public static class SumCalculator implements Runnable {
            private final int[] array;
            private final int startIndex;
            private final int endIndex;
            private int partialSum;

            public SumCalculator(int[] array, int startIndex, int endIndex) {
                this.array = array;
                this.startIndex = startIndex;
                this.endIndex = endIndex;
            }

            public int getPartialSum() {
                return partialSum;
            }

            @Override
            public void run() {
                partialSum = 0;
                for (int i = startIndex; i <= endIndex; i++) {
                    partialSum += array[i];
                }
            }
        }

        public static void main(String[] args) throws InterruptedException {
            int[] array = new int[100];
            for (int i = 0; i < 100; i++) {
                array[i] = i + 1;
            }

            SumCalculator[] calculators = new SumCalculator[5];
            Thread[] threads = new Thread[5];

            int startIndex = 0;
            int endIndex = 19;

            for (int i = 0; i < 5; i++) {
                calculators[i] = new SumCalculator(array, startIndex, endIndex);
                threads[i] = new Thread(calculators[i]);
                threads[i].start();

                startIndex += 20;
                endIndex += 20;
            }

            int finalSum = 0;

            for (int i = 0; i < 5; i++) {
                threads[i].join();
                finalSum += calculators[i].getPartialSum();
            }

            System.out.println("Final Sum: " + finalSum);
        }
    }
