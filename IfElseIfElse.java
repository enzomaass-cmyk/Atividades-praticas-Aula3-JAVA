public class IfElseIfElse {
    public static void main(String[] args) {
        int nota = 55;

        // Classifique a nota
        if (nota >= 90) {
            System.out.println("A - Excelente");
        } else if (nota >= 80) {
            System.out.println("B - Bom");
        } else if (nota >= 70) {
            System.out.println("C - Satisfatório");
        } else if (nota >= 60) {
            System.out.println("D - Insuficiente");
        } else {
            System.out.println("F - Reprovado");
        }
    }
}
