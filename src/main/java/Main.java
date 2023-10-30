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
    }

    public static void main(String[] args) {
        new Main();
    }
}
