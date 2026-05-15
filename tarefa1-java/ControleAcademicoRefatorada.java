import java.util.Scanner;

public class ControleAcademico {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String[] alunos = new String[5];
        double[][] notas = new double[5][3];
        double[] medias = new double[5];
        String[] situacoes = new String[5];

        for (int i = 0; i < 5; i++) {
            alunos[i] = lerAluno(i + 1);
            notas[i] = lerNotas();
            medias[i] = calcularMedia(notas[i]);
            situacoes[i] = determinarSituacao(medias[i]);
        }

        imprimirRelatorio(alunos, medias, situacoes);
    }

    public static String lerAluno(int numero) {
        System.out.print("Digite o nome do aluno " + numero + ": ");
        return scanner.nextLine();
    }

    public static double[] lerNotas() {
        double[] notas = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        scanner.nextLine();
        return notas;
    }

    public static double calcularMedia(double[] notas) {
        double soma = 0;

        for (double nota : notas) {
            soma += nota;
        }

        return soma / 3;
    }

    public static String determinarSituacao(double media) {
        if (media >= 7) {
            return "Aprovado";
        } else if (media >= 5) {
            return "Recuperação";
        } else {
}
