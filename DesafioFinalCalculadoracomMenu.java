public class DesafioFinalCalculadoracomMenu {
    public static void main(String[] args) {
        // Números
        double numero1 = 10.0;
        double numero2 = 3.0;

        // Operação
        int operacao = 1;  // 1=soma, 2=subtração, 3=mult, 4=div

        // Exiba o menu
        System.out.println("=== CALCULADORA ===");
        System.out.println("1. Soma");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        System.out.println();

        // Processe a operação
        double resultado = 0;
        boolean operacaoValida = true;

        switch (operacao) {
            case 1:
                resultado = numero1 + numero2;
                System.out.println("Operação: Soma");
                break;
            case 2:
                resultado = numero1 - numero2;
                System.out.println("Operação: Subtração");
                break;
            case 3:
                resultado = numero1 * numero2;
                System.out.println("Operação: Multiplicação");
                break;
            case 4:
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                    System.out.println("Operação: Divisão");
                } else {
                    System.out.println("Erro: Divisão por zero!");
                    operacaoValida = false;
                }
                break;
            default:
                System.out.println("Operação inválida!");
                operacaoValida = false;
        }

        // Exiba o resultado
        if (operacaoValida) {
            System.out.println(numero1 + " ? " + numero2 + " = " + resultado);
        }
    }
}
