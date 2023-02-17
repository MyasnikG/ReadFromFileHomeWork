import model.Student;
import service.FileService;
import service.StudentService;

public class Main {

    public static final String URL = "C:\\Users\\miasn\\Desktop\\Names.txt";
    public static void main(String[] args) throws Exception {

        String [] read = FileService.read(URL);

        Student[] convert = StudentService.convert(read);
        for (int i = 0; i < convert.length; i++) {
            convert[i].studentPrint();
        }

        System.out.println();
        StudentService.sortByAge(read);


    }
}