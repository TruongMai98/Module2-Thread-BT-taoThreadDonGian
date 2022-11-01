public class Main {
    public static void main(String[] args) {
        NumberGenerator numberGenerator1 = new NumberGenerator();
        NumberGenerator numberGenerator2 = new NumberGenerator();

        Thread th1 = new Thread(numberGenerator1);
        Thread th2 = new Thread(numberGenerator2);

        th1.setPriority(Thread.MAX_PRIORITY);
        th2.setPriority(Thread.MIN_PRIORITY);


        th1.start();
        th2.start();

        System.out.println("Complete");
    }
}