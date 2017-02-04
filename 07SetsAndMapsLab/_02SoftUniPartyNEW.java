import java.util.*;

public class _02SoftUniPartyNEW {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashSet<String> regular = new HashSet<String>();
        TreeSet<String> vip = new TreeSet<String>();
        String input ="";
        while(!"PARTY".equals(input = scan.nextLine())){
            if(Character.isDigit(input.charAt(0))){
                vip.add(input);
            } else {
                regular.add(input);
            }
        }

        while(!"END".equals(input = scan.nextLine())){
            if(Character.isDigit(input.charAt(0))){
                vip.remove(input);
            } else {
                regular.remove(input);
            }
        }

        vip.addAll(regular);
        System.out.println(vip.size());
        for(String s : vip){
            System.out.println(s);
        }
    }
}
