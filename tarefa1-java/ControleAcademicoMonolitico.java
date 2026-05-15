import java.util.Scanner;

public class ControleAcademicoMonolitico {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] alunos = new String[5];
        double[][] notas = new double[5][3];
        double[] medias = new double[5];
        String[] situacoes = new String[5];

        for (int i = 0; i < 5; i++) {

            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            alunos[i] = scanner.nextLine();

            double soma = 0;

            for (int j = 0; j < 3; j++) {
                System.out.print("Digite a nota " + (j + 1) + ": ");
                notas[i][j] = scanner.nextDouble();
                soma += notas[i][j];
            }

            scanner.nextLine();

            medias[i] = soma / 3;

            if (medias[i] >= 7) {
                situacoes[i] = "Aprovado";
            } else if (medias[i] >= 5) {
                situacoes[i] = "Recuperação";
            } else {
                situacoes[i] = "Reprovado";
            }
        }

        System.out.println("
===== RELATÓRIO FINAL =====");

        for (int i = 0; i < 5; i++) {
            System.out.println("Aluno: " + alunos[i]);
            System.out.println("Média: " + medias[i]);
            System.out.println("Situação: " + situacoes[i]);
            System.out.println();
        }

        scanner.close();
    }
}
