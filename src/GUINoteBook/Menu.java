package GUINoteBook;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.EtchedBorder;

public class Menu {
    JFrame jFrame;
    JMenuBar jMenuBar;
    JMenu jMenu;
    JMenuItem jMenuItem1;
    JMenuItem jMenuItem2;
    JMenuItem jMenuItem3;
    JMenuItem jMenuItem4;
    JTextArea jTextArea;
    JPanel jPanel;
    public Menu()
    {
        jFrame = new JFrame("记事本");

        jMenuBar = new JMenuBar();
        jFrame.setJMenuBar(jMenuBar);
        jMenu = new JMenu("文件");
        jMenuBar.add(jMenu);

        jMenuItem1 = new JMenuItem("新建");
        jMenuItem2 = new JMenuItem("打开");
        jMenuItem3 = new JMenuItem("另存为");
        jMenuItem4 = new JMenuItem("关闭");

        jMenuItem1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        jMenuItem4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.dispose();
            }
        });
        jMenu.add(jMenuItem1);
        jMenu.addSeparator();
        jMenu.add(jMenuItem2);
        jMenu.addSeparator();
        jMenu.add(jMenuItem3);
        jMenu.addSeparator();
        jMenu.add(jMenuItem4);

        jPanel = new JPanel();

        jTextArea = new JTextArea();
        jTextArea.setRows(100);
        jTextArea.setSize(800,600);
        jTextArea.setBackground(Color.LIGHT_GRAY);
        jPanel.setBorder(new EtchedBorder());
        jTextArea.setLineWrap(true);
        jPanel.add(jTextArea);
        jFrame.add(jPanel);

        jFrame.setLayout(new FlowLayout());
        jFrame.setSize(800,600);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);

    }

}
