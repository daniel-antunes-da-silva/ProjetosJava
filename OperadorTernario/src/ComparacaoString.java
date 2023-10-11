public class ComparacaoString {
    public static void main(String[] args) {
        // O conteúdo deles é igual, mas o nome3 é uma estrutura diferente, porque foi instanciado.
        String nome1 = "Daniel";
        String nome2 = "Daniel";
        String nome3 = new String("Daniel");
        String resultado1;
        String resultado2;

        resultado1 = nome1 == nome3 ? "igual" : "diferente"; // aqui ele verifica se a estrutura é igual.
        resultado2 = nome1.equals(nome3) ?"igual":"diferente"; // aqui ele verifica se o conteúdo é igual.

        System.out.printf("O resultado 1 é: %s \n",resultado1);
        System.out.printf("O resultado 2 é: %s \n", resultado2);


    }
}
