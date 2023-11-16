package pr21;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Fourth {
    public static <T> List<T> dirs(String path) {
        List<T> contents = new ArrayList<>();

        File directory = new File(path);

        if (directory.exists() && directory.isDirectory()) {
            File[] files = directory.listFiles();

            if (files != null) {
                for (File file : files) {
                    contents.add((T) file);
                }
            }
        }

        return contents;
    }

    public static void main(String[] args) {
        String path = "D:\\Aurora";
        List<File> dirs = dirs(path);

        int limit = Math.min(5, dirs.size());
        for (int i = 0; i < limit; i++) {
            System.out.println(dirs.get(i));
        }
    }
}
