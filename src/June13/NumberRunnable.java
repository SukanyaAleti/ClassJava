package June13;

class NumberRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
        public static void main(String[] args) {
            Thread thread = new Thread(new NumberRunnable());
            thread.start();
        }
}


