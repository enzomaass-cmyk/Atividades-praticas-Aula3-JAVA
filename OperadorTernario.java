public class OperadorTernario {
    public static void main(String[] args) {
        int idade = 15;

        // Classifique como adulto ou menor
        String categoria = (idade >= 18) ? "Adulto" : "Menor";
        System.out.println("Categoria: " + categoria);

        // Classifique como par ou ímpar
        int numero = 7;
        String tipo = (numero % 2 == 0) ? "Par" : "Ímpar";
        System.out.println("Tipo: " + tipo);

        // Calcule desconto
        double preco = 40;
        double desconto = (preco > 50) ? preco * 0.1 : 0;
        System.out.println("Desconto: " + desconto);
    }
}
