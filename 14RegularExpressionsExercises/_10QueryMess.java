import java.util.*;
import java.util.regex.*;

public class _10QueryMess {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = "";
        String regex = "([^?=&]+)=([^?=&]+)";
        Pattern pattern = Pattern.compile(regex);
        while (!(line = scan.nextLine()).equals("END")) {
            line = line.replaceAll("\\+", " ");
            line = line.replaceAll("%20", " ");
            line = line.replaceAll("\\s+", " ");
            LinkedHashMap<String, ArrayList<String>> map = new LinkedHashMap<>();
            Matcher matcher = pattern.matcher(line);
            while(matcher.find()){
                String key = matcher.group(1).trim();
                String value = matcher.group(2).trim();
                if(!map.containsKey(key)){
                    map.put(key, new ArrayList<>());
                }
                map.get(key).add(value);
            }
            map.entrySet().stream().forEach(a -> {
                System.out.print(a.getKey() + "=" + a.getValue());
            });
            System.out.println();
        }
    }
}
