import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame{
    private JLabel jLabel1;
    private JPanel MainPanel;
    private JLabel jLabel2;
    private JButton jButton1;
    private JTextField jText1;

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

            }
        });
    }

    public static void main(String[] args) {
        new Main();
    }
}
