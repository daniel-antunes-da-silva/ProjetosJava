public class OperadoresLogicos {
    public static void main(String[] args) {
        int x, y, z;
        x = 4;
        y = 7;
        z = 12;
        boolean resultado1, resultado2, resultado3, resultado4, resultado5;
        resultado1 = (x < y && y < z) ? true : false; // Operador E (and)
        resultado2 = (x < y && y == z) ? true : false;
        resultado3 = (x < y || y == z) ? true : false; // Operador OU (or)
        resultado4 = (x < y ^ y == z) ? true : false; //Operador OU EXCLUSIVO
        resultado5 = (x < y ^ y < z) ? true : false;
        System.out.printf("%b\n%b\n%b\n%b\n%b\n", resultado1, resultado2, resultado3, resultado4, resultado5);

    }
}
