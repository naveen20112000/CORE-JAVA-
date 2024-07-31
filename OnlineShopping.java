class OnlineShopping {
    private boolean paymentCompleted = false;

    // Synchronized method to confirm the order
    public synchronized void confirmOrder() {
        try {
            // Wait until the payment is completed
            while (!paymentCompleted) {
                wait();
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Thread interrupted");
        }

        // After payment is completed, proceed to confirm the order
        System.out.println("Order confirmed!");
    }

    // Synchronized method to complete the payment
    public synchronized void completePayment() {
        System.out.println("Completing payment...");

        // Simulate payment processing
        try {
            Thread.sleep(2000); // Sleep for 2 seconds to simulate payment processing
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Thread interrupted");
        }

        // Set paymentCompleted to true and notify waiting threads
        paymentCompleted = true;
        System.out.println("Payment completed!");
        notify();
    }
}

class ConfirmOrderThread extends Thread {
    private OnlineShopping onlineShopping;

    public ConfirmOrderThread(OnlineShopping onlineShopping) {
        this.onlineShopping = onlineShopping;
    }

    @Override
    public void run() {
        onlineShopping.confirmOrder();
    }
}

1)Write a program to demonstrate inter thread communication for a online shopping application.



 (There should be 2 synchronized method 

i.to confirm the order 

ii.to complete the payment. 

After completing the payment it should give the msg that order confirmed)

class CompletePaymentThread extends Thread {
    private OnlineShopping onlineShopping;

    public CompletePaymentThread(OnlineShopping onlineShopping) {
        this.onlineShopping = onlineShopping;
    }

    @Override
    public void run() {
        onlineShopping.completePayment();
    }
}

public class OnlineShoppingApp {
    public static void main(String[] args) {
        OnlineShopping onlineShopping = new OnlineShopping();

        // Create and start the confirm order thread
        ConfirmOrderThread confirmOrderThread = new ConfirmOrderThread(onlineShopping);
        confirmOrderThread.start();

        // Create and start the complete payment thread
        CompletePaymentThread completePaymentThread = new CompletePaymentThread(onlineShopping);
        completePaymentThread.start();
    }
}
Output:
Completing payment...
Payment completed!
Order confirmed!

