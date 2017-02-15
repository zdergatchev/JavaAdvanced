import java.util.Scanner;
import java.util.TreeSet;

public class _03PeriodicTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numElements = Integer.parseInt(scan.nextLine());
        TreeSet<String> elements = new TreeSet<>();

        for(int i = 0; i < numElements; i++){
            String[] compounds = scan.nextLine().split(" ");
            for (String compound : compounds){
                elements.add(compound);
            }
        }

        for(String element : elements){
            System.out.print(element + " ");
        }
    }
}
