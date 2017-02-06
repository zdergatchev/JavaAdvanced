import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _10SerializeArrayList {
    public static void main(String[] args) {
        List<Double> doubleNumbers = new ArrayList<>();
        Collections.addAll(doubleNumbers, 0.5, 2.1, 15.6, 99.9);
        String path = "D:\\list.ser";
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))){
            oos.writeObject(doubleNumbers);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
