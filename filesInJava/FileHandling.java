package filesInJava;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) throws IOException {

        File file = new File("./mahi.txt");
        if (!file.exists()){
            file.createNewFile();
        }
        FileInputStream fis = new FileInputStream(file);
        int  codevlaue=0 ;
      // codevlaue=fis.read();
        while (codevlaue != -1){
            codevlaue=fis.read();
            System.out.print(  (char) codevlaue);
        }
     //   System.out.println(fis.read())
        fis.close();
    }
}
