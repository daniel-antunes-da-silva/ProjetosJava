import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class OperadoresAritmeticos extends JFrame {

    private JPanel mainPanel;
    private JTextField txtNum;
    private JTextField txtDen;
    private JButton btnDividir;
    private JLabel lblDiv;
    private JLabel lblResto;
    private JTextField txtFinal;
    private JTextField txtInicial;
    private JButton btnRandom;
    private JLabel lblAleatorio;

    public OperadoresAritmeticos() {
        btnDividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float n1 = Float.parseFloat(txtNum.getText());
                float n2 = Float.parseFloat(txtDen.getText());
                float resultado_divisao = n1 / n2;
                int resto_divisao = (int) (n1 % n2);
                lblDiv.setText(Float.toString(resultado_divisao));
                lblResto.setText(Integer.toString(resto_divisao));
            }
        });
        btnRandom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random random = new Random();
                int numero_inicial = Integer.parseInt(txtInicial.getText());
                int numero_final = Integer.parseInt(txtFinal.getText());
                int numero_aleatorio = random.nextInt(numero_inicial, numero_final + 1);
                lblAleatorio.setText(Integer.toString(numero_aleatorio));
            }
        });
    }

    public static void main(String[] args) {
        OperadoresAritmeticos tela_operadores = new OperadoresAritmeticos();
        tela_operadores.setContentPane(tela_operadores.mainPanel);
        tela_operadores.setTitle("Divisão e randomização");
        tela_operadores.setSize(700, 300);
        tela_operadores.setVisible(true);
        tela_operadores.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
