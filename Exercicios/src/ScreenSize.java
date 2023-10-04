import java.awt.*;

public class ScreenSize {
    public static void main(String[] args) {
        Dimension tamanhoTela = Toolkit.getDefaultToolkit().getScreenSize();

        double largura_tela = tamanhoTela.getWidth();
        double altura_tela = tamanhoTela.getHeight();
        System.out.println("O tamanho da tela é "+largura_tela +"x"+ altura_tela);

    }
}
