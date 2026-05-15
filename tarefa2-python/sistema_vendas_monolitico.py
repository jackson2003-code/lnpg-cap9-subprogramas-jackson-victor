produtos = []
quantidades = []
precos = []
subtotais = []

for i in range(3):
    produto = input(f"Digite o nome do produto {i + 1}: ")
    quantidade = int(input("Digite a quantidade: "))
    preco = float(input("Digite o preço unitário: R$ "))

    subtotal = quantidade * preco

    produtos.append(produto)
    quantidades.append(quantidade)
    precos.append(preco)
    subtotais.append(subtotal)

valor_total = sum(subtotais)

if valor_total > 500:
    desconto = valor_total * 0.10
elif valor_total > 200:
    desconto = valor_total * 0.05
else:
    desconto = 0

valor_final = valor_total - desconto

print("\n===== CUPOM FISCAL =====")

for i in range(3):
    print(f"Produto: {produtos[i]}")
    print(f"Quantidade: {quantidades[i]}")
    print(f"Preço Unitário: R$ {precos[i]:.2f}")
    print(f"Subtotal: R$ {subtotais[i]:.2f}")
    print()

print(f"Subtotal Geral: R$ {valor_total:.2f}")
print(f"Desconto: R$ {desconto:.2f}")
print(f"Total Final: R$ {valor_final:.2f}")
