import javax.swing.*;

public class AppGUI {
    private JPanel mainPanel;
    private JTextField recipientTextField;
    private JTextField giftTextField;
    private JTextField urlTextField;
    private JLabel recipientLabel;
    private JLabel girftLabel;
    private JLabel urlLabel;
    private JButton addBtn;
    private JButton pressMeButton;


    public static void main(String[] args) {
        JFrame frame = new JFrame("DataBase Thing");
        frame.setContentPane(new AppGUI().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
