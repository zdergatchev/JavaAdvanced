import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class _16ExtractHyperlinks {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = "";
        while (!"END".equals(input = reader.readLine())){
            sb.append(input);
        }

        List<String> aTags = new ArrayList<>();
        String text = sb.toString();
        while (true){
            int startIndex = text.indexOf("<a");
            int endIndex = text.indexOf(">", startIndex + 1);

            if(startIndex == - 1 || endIndex == -1){
                break;
            }
            aTags.add(text.substring(startIndex, endIndex));
            text = text.substring(endIndex + 1);
        }

        for (String aTag : aTags) {
            aTag = aTag.replaceAll("\\t", " ");
            int hrefIndex = aTag.indexOf(" href");
            if (hrefIndex == -1){
                continue;
            }
            hrefIndex += 5;
            while (hrefIndex < aTag.length() && (
                    aTag.charAt(hrefIndex) == ' ' ||
                            aTag.charAt(hrefIndex) == '\t' ||
                            aTag.charAt(hrefIndex) == '\"' ||
                            aTag.charAt(hrefIndex) == '\'' ||
                            aTag.charAt(hrefIndex) == '=' ) ){
                hrefIndex++;
            }

            char delimiter = aTag.charAt(hrefIndex - 1);
            if (delimiter == ' ' || delimiter == '\t' ||
                    delimiter == '\"' || delimiter == '\''){
                int nextDelimiter = aTag.indexOf(delimiter, hrefIndex + 1);
                if (nextDelimiter != -1){
                    System.out.println(aTag.substring(hrefIndex, nextDelimiter));
                }
            }else{
                int spaceDelimiter = aTag.indexOf(' ', hrefIndex + 1);
                if (spaceDelimiter != -1){
                    System.out.println(aTag.substring(hrefIndex, spaceDelimiter));
                }else {
                    System.out.println(aTag.substring(hrefIndex));
                }
            }
        }
    }
}
