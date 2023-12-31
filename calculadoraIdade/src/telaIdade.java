import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.time.Year;
import java.util.Date;

public class telaIdade extends JFrame {
    private JSpinner txtAN;
    private JButton btnCalc;
    private JPanel painelPrincipal;
    private JLabel label;
    private JLabel lblIdade;
    private JLabel lblAnoAtual;


    public telaIdade() {
        btnCalc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int anoAtual = Year.now().getValue();
                int anoNasc = Integer.parseInt(txtAN.getValue().toString());
                int idade = anoAtual - anoNasc;
                lblIdade.setText(Integer.toString(idade));
                lblAnoAtual.setText(Integer.toString(anoAtual));
            }
        });

        lblAnoAtual.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                int anoAtual = Year.now().getValue();
                lblAnoAtual.setText(Integer.toString(anoAtual));
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



