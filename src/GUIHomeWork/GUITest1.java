package GUIHomeWork;

import java.awt.*;
import java.io.File;
import javax.swing.*;

public class GUITest1 {
    public static void main(String[] args) throws FontFormatException {
        String Path = File.separator+"Users"+File.separator+"ea"+File.separator+"Downloads"+File.separator+"guoqi"+File.separator+"国旗1024.png";
        Dimension dm = new Dimension();
        Point pi = new Point();
        JFrame jf = new JFrame();

        dm.setSize(300,400);
        pi.setLocation(150,100);

        Container container = jf.getContentPane();
        JLabel jl = new JLabel("中华人民共和国");
        ImageIcon im = new ImageIcon(Path);

        JLabel imageLabel = new JLabel(im);
        im.setImage(im.getImage().getScaledInstance(150,100,Image.SCALE_DEFAULT));
        jf.add(imageLabel);
        jf.setVisible(true);
        container.add(jl);
        jl.setHorizontalAlignment(SwingConstants.NORTH);
        jf.setSize(dm);
        jf.setLocation(pi);

    }
}
