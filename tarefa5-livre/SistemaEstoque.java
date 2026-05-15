import java.util.Scanner;

public class SistemaEstoque {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String[] produtos = new String[3];
        int[] quantidades = new int[3];
        double[] precos = new double[3];

        cadastrarProdutos(produtos, quantidades, precos);

        exibirMenu(produtos, quantidades, precos);
    }

    public static void cadastrarProdutos(String[] produtos,
                                         int[] quantidades,
                                         double[] precos) {

        for (int i = 0; i < produtos.length; i++) {

            System.out.print("Digite o nome do produto: ");
            produtos[i] = scanner.nextLine();

            System.out.print("Digite a quantidade: ");
            quantidades[i] = scanner.nextInt();

            System.out.print("Digite o preço: ");
            precos[i] = scanner.nextDouble();

            scanner.nextLine();
        }
    }

    public static void exibirMenu(String[] produtos,
                                  int[] quantidades,
                                  double[] precos) {

        int opcao;

        do {
            System.out.println("\n===== SISTEMA DE ESTOQUE =====");
            System.out.println("1 - Listar produtos");
            System.out.println("2 - Calcular valor total");
            System.out.println("3 - Buscar produto");
            System.out.println("4 - Atualizar quantidade");
            System.out.println("0 - Sair");

            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:
                    listarProdutos(produtos, quantidades, precos);
                    break;

                case 2:
                    double total = calcularValorTotal(quantidades, precos);
                    System.out.println("Valor total em estoque: R$ " + total);
                    break;

                case 3:
                    buscarProduto(produtos, quantidades, precos);
                    break;

                case 4:
                    atualizarQuantidade(produtos, quantidades);
                    break;

                case 0:
                    System.out.println("Encerrando sistema...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);
    }

    public static void listarProdutos(String[] produtos,
                                      int[] quantidades,
                                      double[] precos) {

        System.out.println("\n===== PRODUTOS =====");

        for (int i = 0; i < produtos.length; i++) {

            System.out.println("Produto: " + produtos[i]);
            System.out.println("Quantidade: " + quantidades[i]);
            System.out.println("Preço: R$ " + precos[i]);
            System.out.println();
        }
    }

    public static double calcularValorTotal(int[] quantidades,
                                            double[] precos) {

        double total = 0;

        for (int i = 0; i < quantidades.length; i++) {
            total += quantidades[i] * precos[i];
        }

        return total;
    }

    public static void buscarProduto(String[] produtos,
                                     int[] quantidades,
                                     double[] precos) {

        System.out.print("Digite o nome do produto: ");
        String busca = scanner.nextLine();

        int indice = encontrarProduto(produtos, busca);

        if (indice != -1) {

            System.out.println("Produto encontrado:");
            System.out.println("Nome: " + produtos[indice]);
            System.out.println("Quantidade: " + quantidades[indice]);
            System.out.println("Preço: R$ " + precos[indice]);

        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    public static int encontrarProduto(String[] produtos, String busca) {

        for (int i = 0; i < produtos.length; i++) {

            if (produtos[i].equalsIgnoreCase(busca)) {
                return i;
            }
        }

        return -1;
    }

    public static void atualizarQuantidade(String[] produtos,
                                           int[] quantidades) {

        System.out.print("Digite o nome do produto: ");
        String busca = scanner.nextLine();

        int indice = encontrarProduto(produtos, busca);

        if (indice != -1) {

            System.out.print("Nova quantidade: ");
            quantidades[indice] = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Quantidade atualizada.");

        } else {
            System.out.println("Produto não encontrado.");
        }
    }
}
