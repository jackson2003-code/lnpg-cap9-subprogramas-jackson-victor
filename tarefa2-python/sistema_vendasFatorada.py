def ler_produto(numero):
    produto = input(f"Digite o nome do produto {numero}: ")
    quantidade = int(input("Digite a quantidade: "))
    preco = float(input("Digite o preço unitário: R$ "))

    return produto, quantidade, preco


def calcular_subtotal(quantidade, preco):
    return quantidade * preco


def calcular_desconto(valor_total):
    if valor_total > 500:
        return valor_total * 0.10
    elif valor_total > 200:
        return valor_total * 0.05
    else:
        return 0


def calcular_total(valor_total, desconto):
    return valor_total - desconto


def imprimir_cupom(produtos, quantidades, precos, subtotais,
                   valor_total, desconto, total_final):

    print("\n===== CUPOM FISCAL =====")

    for i in range(len(produtos)):
        print(f"Produto: {produtos[i]}")
        print(f"Quantidade: {quantidades[i]}")
        print(f"Preço Unitário: R$ {precos[i]:.2f}")
        print(f"Subtotal: R$ {subtotais[i]:.2f}")
        print()

    print(f"Subtotal Geral: R$ {valor_total:.2f}")
    print(f"Desconto: R$ {desconto:.2f}")
    print(f"Total Final: R$ {total_final:.2f}")


produtos = []
quantidades = []
precos = []
subtotais = []

for i in range(3):
    produto, quantidade, preco = ler_produto(i + 1)

    subtotal = calcular_subtotal(quantidade, preco)

    produtos.append(produto)
    quantidades.append(quantidade)
    precos.append(preco)
    subtotais.append(subtotal)

valor_total = sum(subtotais)

desconto = calcular_desconto(valor_total)

total_final = calcular_total(valor_total, desconto)

imprimir_cupom(
    produtos,
    quantidades,
    precos,
    subtotais,
    valor_total,
    desconto,
    total_final
)
