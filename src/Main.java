import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // No programa principal o usuário deve receber um menu podendo escolher entre as
        // opções [1] sanduíches, [2] massas, [3] bolos.
        do {
            mostrarMenuPrincipal();
        } while(true);
    }

    private static void fecharPedido() {
        Sanduiche sanduiche = new Sanduiche();
        System.out.println("==================");
        System.out.println("Fechar Pedido");
        System.out.println("Distância da entrega: ");
        // Leitura da distância
        System.out.println("Tempo estimado de entrega: "
                + (sanduiche.getTempoPreparo()+sanduiche.calcularEntrega(lerOpcao())) + " minutos");
    }

    private static void mostrarMenuPrincipal() {
        // Mostrar Menu Principal
        exibirOpcoesMenuPrincipal();
        int opcao = lerOpcao();
        // System.out.println("Opção digitada: " + opcao);
        switch (opcao) {
            case 1 -> { System.out.println("Opção escolhida: sanduiche");
                        montarSanduiche(); }
            case 2 -> System.out.println("Opção escolha: massas");
            case 3 -> System.out.println("Opção escolha: bolos");
            case 4 -> fecharPedido();
            case 0 -> { System.out.println("Opção escolha: sair do sistema...");
                // Executa a saída do sistema com código 0 (sucesso)
                System.exit(0); }
            default -> System.out.println("Opção inválida!");
        }
    }

    private static void exibirOpcoesMenuPrincipal() {
        System.out.println("Menu Delivery");
        System.out.println("[1] Sanduiches");
        System.out.println("[2] Massas");
        System.out.println("[3] Bolos");
        System.out.println("[4] Fechar Pedido");
        System.out.println("[0] SAIR");
        System.out.println("Digite a sua opção: ");
    }

    private static int lerOpcao() {
        // Configurar Scanner leitura da opção escolhida
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void montarSanduiche() {
        // Criando objeto sanduiche
        Sanduiche sanduiche = new Sanduiche();
        do {
            // Menu para os Sanduiches
            System.out.println("=====================");
            System.out.println("Menu de Sanduiches");
            System.out.println("Escolha os ingredientes do seu lanche");
            System.out.println("[1] Queijo        [5] Presunto");
            System.out.println("[2] Hamburguer    [6] Molho Especial");
            System.out.println("[3] Bacon         [7] Alface");
            System.out.println("[4] Ovo           [8] Tomate");
            System.out.println("[9] Montar Lanche [0] Voltar ao Menu Principal");
            System.out.println("Opção: ");
            // Leitura da opção do usuário
            int opcao = lerOpcao();
            // Tratando a opção usando enhanced switch
            switch (opcao) {
                case 1 -> sanduiche.adicionarIngrediente("Queijo");
                case 2 -> sanduiche.adicionarIngrediente("Hamburguer");
                case 3 -> sanduiche.adicionarIngrediente("Bacon");
                case 4 -> sanduiche.adicionarIngrediente("Ovo");
                case 5 -> sanduiche.adicionarIngrediente("Presunto");
                case 6 -> sanduiche.adicionarIngrediente("Molho Especial");
                case 7 -> sanduiche.adicionarIngrediente("Alface");
                case 8 -> sanduiche.adicionarIngrediente("Tomate");
                case 9 -> mostrarLanche(sanduiche);
                case 0 -> { System.out.println("Lanche em produção"); return; }
                default -> System.out.println("Opção inválida!");
            }
        } while (true);
    }

    public static void mostrarLanche(Sanduiche sanduiche) {
        System.out.println("Seu lanche neste momento: ");
        System.out.println(sanduiche.toString());
    }

    public static void mostrarMenuMassas() {}

    public static void mostrarMenuBolos() {}

}
