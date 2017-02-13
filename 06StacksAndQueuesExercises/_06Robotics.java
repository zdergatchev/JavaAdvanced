import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class _06Robotics {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] robotsTokens = scanner.nextLine().split(";");
        String[] robotsNames = new String[robotsTokens.length];

        //Keeping each robot's time necessary to complete a detail processing.
        int[] processTimes = new int[robotsTokens.length];

        //Monitoring each robot's time left to complete detail processing.
        int[] robotsProcessTimesLeft = new int[robotsTokens.length];

        //Products for processing
        Deque<String> products = new ArrayDeque<>();
        String product = "";

        //Taking info about robotsNames and processTimes
        for (int i = 0; i < robotsTokens.length; i++) {
            String[] currentRobToken = robotsTokens[i].split("-");
            robotsNames[i] = currentRobToken[0];
            processTimes[i] = Integer.parseInt(currentRobToken[1]);
        }

        //Taking the startTime converted in seconds.
        String[] startTime = scanner.nextLine().split(":");
        //Hours converted in seconds
        long h = Integer.parseInt(startTime[0]) * 60 * 60;
        //Minutes converted in seconds
        long m = Integer.parseInt(startTime[1]) * 60;
        long s = Integer.parseInt(startTime[2]);
        long totalSecs = h + m + s;

        //Filling up the products Deque
        product = scanner.nextLine();
        while (!"End".equals(product)) {
            products.offer(product);
            product = scanner.nextLine();
        }

        while (!products.isEmpty()) {
            //A product comes from the line each second.
            totalSecs++;

            //Check for free robots.
            //A robot is free if its process time left is - 0.
            //Otherwise the robot is busy and its time left value must be reduced with 1 second;
            for (int i = 0; i < robotsNames.length; i++) {
                if (robotsProcessTimesLeft[i] > 0) {
                    robotsProcessTimesLeft[i]--;
                }
            }

            String currentProduct = products.poll();
            boolean isProductTaken = false;
            for (int i = 0; i < robotsNames.length; i++) {
                String s1 = robotsNames[i];

                //Check for free robots - more info on rows 50 and 51!!!
                if (robotsProcessTimesLeft[i] == 0) {
                    robotsProcessTimesLeft[i] = processTimes[i];
                    isProductTaken = true;
                    System.out.printf("%1$s - %2$s [%3$s]\n", robotsNames[i], currentProduct, convertSecondsToHMmSs(totalSecs));
                    break;
                }
            }

            if (!isProductTaken) {
                products.offer(currentProduct);
            }
        }
    }

    public static String convertSecondsToHMmSs(long seconds) {
        long s = seconds % 60;
        long m = (seconds / 60) % 60;
        long h = (seconds / (60 * 60)) % 24;
        return String.format("%02d:%02d:%02d", h, m, s);
    }

}
