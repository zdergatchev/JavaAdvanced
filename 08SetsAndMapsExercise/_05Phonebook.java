import java.util.HashMap;
import java.util.Scanner;

public class _05Phonebook {
    public static void main(String[] args) {
        HashMap<String, String> phonebook = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.toLowerCase().equals("search") || input.toLowerCase().equals("stop")) {
                break;
            }
            String[] info = input.split("-");
            phonebook.put(info[0], info[1]);
        }

        while (true) {
            String input = scanner.nextLine();
            if ("stop".equals(input)) {
                break;
            }
            if (phonebook.containsKey(input)) {
                //System.out.printf("%s -> %s%n", input, phonebook.get(input));
                System.out.println(input + " -> " + phonebook.get(input));

            } else {
                System.out.printf("Contact %s does not exist.%n", input);
            }
        }
    }
}
