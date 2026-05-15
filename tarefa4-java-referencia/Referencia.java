public class ReferenciaObjeto {

    public static void aplicarDesconto(Produto p) {

        System.out.println("Preço antes do desconto: R$ " + p.preco);

        p.preco = p.preco * 0.9;

        System.out.println("Preço após desconto: R$ " + p.preco);
    }

    public static void main(String[] args) {

        Produto produto = new Produto();

        produto.nome = "Notebook";
        produto.preco = 3000;

        System.out.println("Preço original no main: R$ " + produto.preco);

        aplicarDesconto(produto);

        System.out.println("Preço após chamada do método: R$ " + produto.preco);
    }
}
