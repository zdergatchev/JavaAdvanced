import java.util.*;

public class _07FixEmailsNEW {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, List<String>> personsEmails = new LinkedHashMap<>();

        String name = "";
        while (!"stop".equals((name = scan.nextLine()))) {
            String email = scan.nextLine();
            int dotIndex = email.lastIndexOf('.');
            String domein = email.substring(dotIndex + 1);
            switch(domein.toLowerCase()){
                case "uk":
                case "us":
                case "com":
                    continue;
            }

            if(!personsEmails.containsKey(name)){
                personsEmails.put(name, new ArrayList<>());
            }
            personsEmails.get(name).add(email);
        }
//        personsEmails.entrySet().forEach(pair ->
//                System.out.printf("%s -> %s%n", pair.getKey(),String.join(", ", pair.getValue())));
        for(Map.Entry<String, List<String>> entry : personsEmails.entrySet()){
            System.out.printf("%s -> %s%n", entry.getKey(), entry.getValue());
            //System.out.printf("%s -> %s%n", entry.getKey(), String.join(", ", entry.getValue()));
        }

    }
}
