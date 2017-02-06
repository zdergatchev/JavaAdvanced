import java.io.*;

public class _11SerializeCustomObject {
    private static class Course implements Serializable{
        String _name;
        Integer _numberOfStudents;
        Course(String name, int numberOfStudents){
            this._name = name;
            this._numberOfStudents = numberOfStudents;
        }
        private int getSize(){
            return this._numberOfStudents;
        }
        private String getName(){
            return this._name;
        }
    }

    public static void main(String[] args) {
        Course javaAdvanced = new Course("JavaAdvanced", 35);
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\course.ser"))){
            oos.writeObject(javaAdvanced);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\course.ser"))) {
            Course softUniBestCourse = (Course) ois.readObject();
            System.out.println(softUniBestCourse.getName());
            System.out.println(softUniBestCourse.getSize());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
