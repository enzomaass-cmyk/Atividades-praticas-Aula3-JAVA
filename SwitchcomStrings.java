public class SwitchcomStrings {
    public static void main(String[] args) {
        String cor = "amarelo";

        // Exiba informações sobre a cor
        switch (cor) {
            case "vermelho":
                System.out.println("Cor quente");
                System.out.println("Representa: paixão, energia");
                break;
            case "azul":
                System.out.println("Cor fria");
                System.out.println("Representa: calma, tranquilidade");
                break;
            case "verde":
                System.out.println("Cor neutra");
                System.out.println("Representa: natureza, esperança");
                break;
            default:
                System.out.println("Cor desconhecida");
        }
    }
}
 
    

