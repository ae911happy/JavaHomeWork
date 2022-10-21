package JavaXueXiTong;

import java.io.File;
import java.io.RandomAccessFile;

public class Test1 {
    public static void main(String[] args) {
        String path = "d:" + File.separator + "test" + File.separator + "tom.dat";
        String path1 = "d:" + File.separator + "test" + File.separator;
        File file = new File(path);
        File file1 = new File(path1);
        try {
            file1.mkdir();
            file.createNewFile();
            RandomAccessFile randomAccessFile = new RandomAccessFile(file,"rw");
            for (int i = 0; i < 20; i++) {
                randomAccessFile.write(i);
            }
            randomAccessFile.seek(3);
            int sum = 0;
            for (int i = 0; i <= 8; i++) {
                sum += randomAccessFile.read();
            }
            System.out.println(sum);
        } catch(Exception e) {
            e.getMessage();
        }
    }
}
