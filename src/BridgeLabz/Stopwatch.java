package BridgeLabz;

import java.util.Scanner;
public class Stopwatch {
    private long startTime;
    private long endTime;

    public void start() {
        startTime = System.currentTimeMillis(); // get the current time in milliseconds
        System.out.println("Stopwatch started.");
    }



    public void stop() {
        endTime = System.currentTimeMillis(); // get the current time in milliseconds
        System.out.println("Stopwatch stopped.");
    }

    public void getElapsedTime() {
        long elapsedTime = endTime - startTime;
        System.out.println("Elapsed time: " + elapsedTime + " milliseconds.");
    }

    public static void main(String[] args) {
        Stopwatch stopwatch = new Stopwatch();
        Scanner sc = new Scanner(System.in);

        System.out.print("Press Enter to start the stopwatch.");
        sc.nextLine();
        stopwatch.start();

        System.out.print("Press Enter to stop the stopwatch.");
        sc.nextLine();
        stopwatch.stop();

        stopwatch.getElapsedTime();
        sc.close();
    }
}
