import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.Year;


public class TelaIdade extends JFrame{

    private JPanel panelPrincipal;
    private JButton btnCalcular;
    private JTextField txtAno;
    private JLabel lblIdade;
    private JLabel lblSituacao;

    public TelaIdade() {
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int anoNascimento = Integer.parseInt(txtAno.getText());
                Year ano_atual = Year.now();
                int idade = Integer.parseInt(ano_atual.toString()) - anoNascimento;
                lblIdade.setText(Integer.toString(idade));
                // Para outras condições, vai precisar de estruturas de controle.
                String situacao = ((idade>=16 && idade < 18) || idade > 70)?"Voto opcional":"Voto obrigatório";
                lblSituacao.setText(situacao);
            }
        });
    }

    public static void main(String[] args) {
        TelaIdade telaidade = new TelaIdade();
        telaidade.setContentPane(telaidade.panelPrincipal);
        telaidade.setSize(500, 300);
        telaidade.setTitle("Tela Idade");
        ImageIcon icone = new ImageIcon("C:\\ProjetosJava\\OperadorTernario\\src\\java.png");
        telaidade.setIconImage(icone.getImage());
        telaidade.setVisible(true);
    }

}
