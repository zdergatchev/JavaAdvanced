import java.util.LinkedHashMap;
import java.util.Scanner;

public class _06AMinersTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedHashMap<String, Integer> resources = new LinkedHashMap<>();

        while(true){
            String resource = scan.nextLine();
            if(resource.equals("stop")){
                break;
            }
            if(!resources.containsKey(resource)){
                resources.put(resource, 0);
            }
            int quantity = Integer.parseInt(scan.nextLine());
            resources.put(resource, resources.get(resource) + quantity);
        }


        for (String resource : resources.keySet()) {
            System.out.println(resource + " -> " + resources.get(resource));
        }
    }
}
