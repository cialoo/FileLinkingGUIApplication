import com.groupdocs.merger.Merger;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Main extends JFrame{
    private JLabel jLabel1;
    private JPanel MainPanel;
    private JLabel jLabel2;
    private JButton jButton1;
    private JTextField jText1;
    private JButton jButton2;
    private JTextField jText2;
    private JButton jButton3;
    private JTextField jText3;
    private String filename1;
    private String filename2;

    public Main () {
        setContentPane(MainPanel);
        setTitle("File Linking Appliaction");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);
        setVisible(true);
        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser chooser = new JFileChooser();
                chooser.showOpenDialog(null);
                File f = chooser.getSelectedFile();
                filename1 = f.getAbsolutePath();
                jText1.setText(filename1);
            }
        });
        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser chooser = new JFileChooser();
                chooser.showOpenDialog(null);
                File f = chooser.getSelectedFile();
                filename2 = f.getAbsolutePath();
                jText2.setText(filename2);
            }
        });
        jButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String home = System.getProperty("user.home");

                int whereFirstFullName = filename1.lastIndexOf("\\");
                String firstFullName = filename1.substring(whereFirstFullName + 1);
                String firstName = firstFullName.split("\\.")[0];
                String firstExtension = firstFullName.split("\\.")[1];

                int whereSecondFullName = filename2.lastIndexOf("\\");
                String secondFullName = filename2.substring(whereSecondFullName + 1);
                String secondName = secondFullName.split("\\.")[0];

                String path = home + "\\Downloads\\" + firstName + "-and-" + secondName + "." + firstExtension;

                Merger merger = null;
                try {
                    merger = new Merger(filename1);
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
                {
                    try {
                        merger.join(filename2);
                    } catch (Exception ex) {
                        throw new RuntimeException(ex);
                    }
                    try {
                        merger.save(path);
                    } catch (Exception ex) {
                        throw new RuntimeException(ex);
                    }
                }

                jText3.setText("Document is in the path: " + path);
            }
        });
    }

    public static void main(String[] args) {
        new Main();
    }
}
