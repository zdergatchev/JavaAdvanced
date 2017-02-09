import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class _03CountUpperCaseWordsNEW {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> input = Arrays.asList(reader.readLine().split(" "));
        List<String> result = new ArrayList<>();
        Predicate<String> isLetterUppercase = w -> Character.isUpperCase(w.charAt(0));

        for (String word : input) {

            if(isLetterUppercase.test(word)){
                result.add(word);
            }

        }

        System.out.println(result.size());

        for (String s : result) {
            System.out.println(s);
        }




    }


}
