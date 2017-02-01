import java.util.ArrayList;

import java.util.Scanner;

public class _10GetFirstOddOrEvenElements {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] numbStr = (input.nextLine()).split("\\s");
        input.next();

        int countNumbers = input.nextInt();
        String oddOrEven = input.next();
        ArrayList<Integer> resultNums = new ArrayList<>();

        for (int i = 0; i < numbStr.length; i++) {

            switch (oddOrEven.toLowerCase()) {
                case "odd":
                    if(Integer.valueOf(numbStr[i]) % 2 != 0
                            &&resultNums.size() < countNumbers){
                        resultNums.add(Integer.valueOf(numbStr[i]));
                    }
                    break;
                case "even":
                    if(Integer.valueOf(numbStr[i]) % 2 == 0
                            &&resultNums.size() < countNumbers){
                        resultNums.add(Integer.valueOf(numbStr[i]));
                    }
                break;
            }
        }
        for(int number : resultNums){
            System.out.print(number + " ");
        }
    }
}

