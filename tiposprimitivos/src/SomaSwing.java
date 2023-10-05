import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class SomaSwing extends JFrame{

    private JTextField txtN2;
    private JTextField txtN1;
    private JButton btnSoma;
    private JLabel lblSoma;
    private JPanel painelPrincipal;

    public SomaSwing() {
        btnSoma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // comando para conversão.
                int n1 = Integer.parseInt(txtN1.getText());
                int n2 = Integer.parseInt(txtN2.getText());
                int s = n1 + n2;
                lblSoma.setText(Integer.toString(s));
            }
        });
    }

    public static void main(String[] args) {
        SomaSwing somaswing = new SomaSwing();
        somaswing.setContentPane(somaswing.painelPrincipal);
        somaswing.setTitle("Janela soma");
        somaswing.setSize(700, 400);
        somaswing.setVisible(true);
        somaswing.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
