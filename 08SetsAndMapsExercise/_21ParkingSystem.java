import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class _21ParkingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, HashSet<Integer>> usedColsByRow = new HashMap<>();
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        scanner.nextLine();
        String command = scanner.nextLine();
        while (!"stop".equals(command)) {
            String[] commandArgs = command.split("\\s+");

            int entryRow = Integer.parseInt(commandArgs[0]);
            int targetRow = Integer.parseInt(commandArgs[1]);
            int targetCol = Integer.parseInt(commandArgs[2]);

            if (!usedColsByRow.containsKey(targetRow)) {
                usedColsByRow.put(targetRow, new HashSet<>());
            }

            HashSet<Integer> usedCols = usedColsByRow.get(targetRow);
            if (usedCols.size() == cols - 1) {
                System.out.printf("Row %d full\n", targetRow);

                command = scanner.nextLine();
                continue;
            }

            int needMovesToTargetRow = Math.abs(entryRow - targetRow);
            int neededMovesToTargetCol = 0;

            if (usedCols.contains(targetCol)) {
                int help = 1;
                while (true) {
                    if (!usedCols.contains(targetCol - help) && (targetCol - help >= 1)) {

                        neededMovesToTargetCol = Math.abs(targetCol - help);
                        usedCols.add(Math.abs(targetCol - help));

                        break;
                    } else if (!usedCols.contains(targetCol + help) && (targetCol + help) < cols) {
                        neededMovesToTargetCol = targetCol + help;
                        usedCols.add(targetCol + help);

                        break;
                    }

                    help++;
                }
            } else {
                neededMovesToTargetCol = targetCol;
                usedCols.add(targetCol);
            }

            usedColsByRow.put(targetRow, usedCols);

            int neededMoves = 1 + needMovesToTargetRow + neededMovesToTargetCol;
            System.out.println(neededMoves);

            command = scanner.nextLine();
        }
    }
}
