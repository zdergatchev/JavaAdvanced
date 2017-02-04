import java.util.Scanner;
import java.util.TreeMap;

public class _04AcademyGraduation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        TreeMap<String, Double> results = new TreeMap<>();

         for(int i = 0; i < n; i++)   {
            String name = scan.nextLine();
            String[] scores = scan.nextLine().split(" ");
            double sumOfScore = 0;
            for(String score : scores){
                sumOfScore += Double.parseDouble(score);
            }
            results.put(name, (sumOfScore / scores.length));
         }

        for(String key : results.keySet())   {
            System.out.println(key + " is graduated with " + results.get(key));
        }
    }
}
