public class OperadorTernario {
    public static void main(String[] args) {
        int n1, n2, resultado;
        n1 = 14;
        n2 = 18;
        // Atribui um valor ou outro, a uma mesma variável.
        resultado = (n1 > n2) ? n1 + n2 : n1 - n2;
        System.out.println(resultado);
    }
}
