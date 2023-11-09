import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class demo extends JFrame{
    private JPanel panelMain;
    private JTextField firstNo;
    private JButton btn;
    private JTextField secNo;
    private JTextField result;

    public demo() {
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int x = Integer.parseInt(firstNo.getText());
                int y = Integer.parseInt(secNo.getText());
                int sum = x + y;
                result.setText(String.valueOf(sum));
            }
        });
    }

    public static void main(String[] args) {
        demo d = new demo();
        d.setContentPane(d.panelMain);
        d.setTitle("Hello");
        d.setSize(500, 400);
        d.setBounds(450, 200, 500, 400);
        d.setVisible(true);
        d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
