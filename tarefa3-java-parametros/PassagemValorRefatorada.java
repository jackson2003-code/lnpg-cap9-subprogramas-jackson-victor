public class PassagemValorRefatorada {

    public static void alterarNumero(int x) {

        imprimirMensagem("Valor recebido no método: " + x);

        x = 100;

        imprimirMensagem("Valor após alteração dentro do método: " + x);
    }

    public static void imprimirMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    public static void main(String[] args) {

        int numero = 10;

        imprimirMensagem("Valor antes da chamada: " + numero);

        alterarNumero(numero);

        imprimirMensagem("Valor após a chamada: " + numero);
    }
}
