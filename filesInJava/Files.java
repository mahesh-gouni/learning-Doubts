package filesInJava;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Files {
    public static void main(String[] args) throws IOException {


//        File file = new File("C:\\FileHandling\\newFile.txt");
//        file.createNewFile();
//        file.setWritable(false);
//        System.out.println(file.canWrite());
//        System.out.println(file.isHidden());
        File f = new File("./test.text");
        f.createNewFile();
        File fel = new File("C:\\Users");
      //  System.out.println(Arrays.toString(fel.list()));
         String[] arr =fel.list();
        for (String b:arr){
            System.out.println(b);
            f.exists();
            f.delete();
            File file = new File("./resume.txt");
            file.createNewFile();
            file.mkdir();
            file.listFiles();
            file.getName();
            file.getAbsoluteFile();
            file.getParent();
        }

    }
}