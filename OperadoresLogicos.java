public class OperadoresLogicos {
    public static void main(String[] args) {
        int idade = 16;
        boolean temCarteira = false;
        boolean temCarro = true;

        // Pode dirigir? (idade >= 18 E tem carteira)
        if (idade >= 18 && temCarteira) {
            System.out.println("Pode dirigir");
        } else {
            System.out.println("Não pode dirigir");
        }

        // Pode sair? (idade >= 18 OU tem autorização)
        boolean temAutorizacao = true;
        if (idade >= 18 || temAutorizacao) {
            System.out.println("Pode sair");
        }

        // Não é menor? (NOT idade < 18)
        if (!(idade < 18)) {
            System.out.println("Não é menor de idade");
        }
    }
}
