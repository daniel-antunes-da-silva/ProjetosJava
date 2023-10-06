import java.util.Random;

public class TestesOperadores {
    public static void main(String[] args) {
        System.out.println("Incrementos: \n");
        int numero = 10;
        int valor = 4 + numero--;
        System.out.println(valor);
        System.out.println(numero);

        System.out.println("-------------------------------");

        int x = 4;
        x *= 2; //x += 2;
        System.out.println(x);

        System.out.println("-------------------------------");
        System.out.println("Arredondamentos: \n");

        float v = 8.9f;
        int floor = (int) Math.floor(v);
        System.out.printf("Valor original %f\n", v);
        System.out.println("Floor: " + floor);
        int ceil = (int) Math.ceil(v);
        System.out.printf("Ceil: %d\n", ceil);
        int round = Math.round(v);
        System.out.printf("Round %d\n", round);

        System.out.println("-------------------------------");
        System.out.println("Aleatorizando: \n");

        System.out.println("Segundo valor aleatório");
        // Gera um número entre 15 e 50(?), acho que é só até 49 na verdade;
        double aleatorio = Math.random();
        int n = (int) (15 + aleatorio * (50-15));
        System.out.println("Valor aleatório: "+ n);

        // Gera um número entre 5 e 9 nesse caso, mas pode ser adaptado.
        // No Java, o random não gera até o último número informado, e sim 1 a menos.
        System.out.println("Segundo valor aleatório");
        Random random = new Random();
        int aleatorio_2 = random.nextInt(5, 10);
        System.out.println(aleatorio_2);

    }
}
