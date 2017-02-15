

import java.util.LinkedHashSet;
import java.util.Scanner;

//https://docs.oracle.com/javase/7/docs/api/java/util/Set.html#retainAll(java.util.Collection)

public class _02SetsOfElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] setsDimension = scan.nextLine().split(" ");
        int n = Integer.parseInt(setsDimension[0]);
        int m = Integer.parseInt(setsDimension[1]);
        LinkedHashSet<Integer> setN = new LinkedHashSet<>();
        LinkedHashSet<Integer> setM = new LinkedHashSet<>();

        for (int i = 0; i < n; i++) {
            setN.add(Integer.parseInt(scan.nextLine()));
        }
        for (int i = 0; i < m; i++) {
            setM.add(Integer.parseInt(scan.nextLine()));
        }

        //setN.retainAll(setM);
        for(Integer number : setN){
            if (setM.contains(number)) {

                System.out.print(number + " ");
            }
        }
    }
}
