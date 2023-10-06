import java.awt.*;

public class ScreenSize {
    public static void main(String[] args) {
        Dimension tamanhoTela = Toolkit.getDefaultToolkit().getScreenSize();

        double largura_tela = tamanhoTela.getWidth();
        double altura_tela = tamanhoTela.getHeight();
        System.out.printf("O tamanho da tela é %d x %d.", (int)largura_tela, (int)altura_tela);

    }
}
