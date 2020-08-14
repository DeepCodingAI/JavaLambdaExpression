package lambda;

import java.io.File;

public class FileOperation {
    public static void main(String[] args) {
        File directory = new File("/Users/mrahman/develop/deepcoding");
        if(directory.isDirectory()){
            System.out.println(directory.list().length);
        }
    }
}
