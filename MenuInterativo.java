public class MenuInterativo {
    public static void main(String[] args) {
        int opcao = 3;

        // Exiba o menu
        System.out.println("=== MENU ===");
        System.out.println("1. Adicionar");
        System.out.println("2. Remover");
        System.out.println("3. Listar");
        System.out.println("4. Sair");
        System.out.println();

        // Processe a opção
        switch (opcao) {
            case 1:
                System.out.println("Adicionando novo item...");
                break;
            case 2:
                System.out.println("Removendo item...");
                break;
            case 3:
                System.out.println("Listando itens...");
                break;
            case 4:
                System.out.println("Encerrando programa...");
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
}
