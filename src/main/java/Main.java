import javax.swing.*;

public class Main extends JFrame{
    private JLabel jLabel1;
    private JPanel MainPanel;

    public Main () {
        setContentPane(MainPanel);
        setTitle("File Linking Appliaction");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}
