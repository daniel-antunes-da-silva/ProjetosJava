import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class telaIdade extends JFrame {
    private JSpinner txtAN;
    private JButton btnCalc;
    private JPanel painelPrincipal;
    private JLabel label;
    private JLabel lblIdade;

    public telaIdade() {
        btnCalc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int ano_nasc = Integer.parseInt(txtAN.getValue().toString());
                int idade = 2023 - ano_nasc;
                lblIdade.setText(Integer.toString(idade));
            }
        });
    }
    public static void main(String[] args) {
        // Pega a screensize e divide por 3, para ficar mais ou menos no meio da minha tela, ao exibir no Bounds.
        Dimension tamanhoTela = Toolkit.getDefaultToolkit().getScreenSize();
        double altura = tamanhoTela.getHeight()/3;
        double largura = tamanhoTela.getWidth()/3;

        telaIdade telaidade = new telaIdade();
        telaidade.setContentPane(telaidade.painelPrincipal);
        telaidade.setBounds((int)largura, (int)altura, 500, 300);
        telaidade.setVisible(true);
        telaidade.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}



