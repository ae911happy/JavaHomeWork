package JavaXueXiTong;

import java.io.*;
import java.nio.file.Files;

public class Test {
    public static void main(String[] args) throws IOException {
        String dirPath = "D:"+File.separator+"test";
        String filePath = "D:"+File.separator+"test"+ File.separator+"dom.txt";
        File dir = new File(dirPath);
        File file = new File(filePath);
        if (dir.exists()) {
            System.out.println("文件夹已存在");

        }else
        {
            dir.mkdirs();
            file.createNewFile();
            if (file.createNewFile()){
                    System.out.println("文件创建失败");
            }else
            {
                RandomAccessFile currentFile = new RandomAccessFile("D:" + File.separator + "test" + File.separator + "dom.txt", "rw");
                int shuzi = 0;
                for (int i = 0; i < 20; i++) {
                    currentFile.writeInt(shuzi);
                    shuzi++;
                }
                for (int i = 12;i<=currentFile.length();i++){
                    currentFile.seek(12);

                }
                currentFile.close();
            }
        }
    }
}
