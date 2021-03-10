public class Main {
    public static void main(String[] args) {
        NumberGenerator num1 = new NumberGenerator("A");
        NumberGenerator num2 = new NumberGenerator("B");
        Thread thread1 = new Thread(num1);
        Thread thread2 = new Thread(num2);
        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.MAX_PRIORITY);
        thread1.start();

        thread2.start();
    }
}
