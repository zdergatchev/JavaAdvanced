import java.util.HashSet;
import java.util.Scanner;

public class _01ParkingLot {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        HashSet<String> parking = new HashSet<String>();
        while(true){
            String input = scan.nextLine();
            if(input.equals("END")){
                break;
            }

            String[] command = input.split(", ");
            if(command[0].equals("IN")){
                parking.add(command[1]);
            } else {
                parking.remove(command[1]);
            }
        }
        if(parking.isEmpty()){
            System.out.println("Parking Lot is Empty");
        } else {
            for(String car : parking){
                System.out.println(car);
            }
        }
    }
}
