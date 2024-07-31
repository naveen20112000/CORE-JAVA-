2)Create two thread.one thread is finding average of first 50 numbers and other thread is printing square of number store in array arr={10,15,20,25,30}.

    private static final int[] arr = {10, 15, 20, 25, 30};

    public void run() {
        // Task 1: Calculate average of first 50 numbers
        int sum = 0;
        for (int i = 1; i <= 50; i++) {
            sum += i;
        }
        double average = (double) sum / 50;
        System.out.println("Average of first 50 numbers: " + average);

        // Task 2: Print squares of numbers in the array
        System.out.print("Squares of numbers in the array: ");
        for (int num : arr) {
            System.out.print(num * num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create an instance of the CalculationThread
        CalculationThread calculationThread = new CalculationThread();

        // Create a thread using the instance
        Thread thread = new Thread(calculationThread);

        // Start the thread
        thread.start();
    }
}
output:
Average of first 50 numbers: 25.5
Squares of numbers in the array: 100 225 400 625 900 


