import java.util.Scanner;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // Programinha para exibir nome e nota de um aluno, formatados.
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.print("Digite a nota do aluno: ");
        float nota = teclado.nextFloat();
        //souf para escrever esse comando automaticamente
        System.out.printf("A nota de %s é %.2f\n", nome, nota);
        System.out.println("-------------------------------");

        // Programinha para conversão de variáveis
        // conversão de variáveis
        int idade = 30;
        String valor = Integer.toString(idade); // Está transformando a idade, que é int, em string.
        System.out.println(valor);

        String idade2 = "35";
        int valor2 = Integer.parseInt(idade2);
        System.out.println(valor2);

        String idade3 = "30.5";
        float valor3 = Float.parseFloat(idade3);
        System.out.println(valor3);

    }
}
