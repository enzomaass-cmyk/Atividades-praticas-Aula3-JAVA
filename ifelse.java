public class ifelse {
    public static void main(String[] args) {
        int numero = -5;

        // Verifique se é par ou ímpar
        if (numero % 2 == 0) {
            System.out.println("Número é par");
        } else {
            System.out.println("Número é ímpar");
        }

        // Verifique se é positivo ou negativo
        if (numero > 0) {
            System.out.println("Número é positivo");
        } else if (numero < 0) {
            System.out.println("Número é negativo");
        } else {
            System.out.println("Número é zero");
        }
    }
}

