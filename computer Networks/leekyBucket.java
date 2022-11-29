import java.util.Scanner;
import java.util.TreeSet;

class leekyBucket {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        TreeSet<Integer> arrivalTimes = new TreeSet<Integer>();
        System.out.println("Enter Burstiness in Network");
        int L = scanner.nextInt();
        System.out.println("Enter Packet Inter Arrival");
        int I = scanner.nextInt();
        System.out.println("Enter Arrival Times of Packets (Enter non integer value at end)");
        while (scanner.hasNextInt()) {
            arrivalTimes.add(scanner.nextInt());
        }
        int LCT = arrivalTimes.first();
        int X = 0;
        for (Integer t : arrivalTimes) {
            int temp = X - (t - LCT);
            if (temp > L) {
                System.out.println("Packet at time " + t + " is Non Conforming");
            } else {
                X = temp + I;
                LCT = t;
                System.out.println("Packet at time " + t + " is Conforming");
            }
        }
    }
}