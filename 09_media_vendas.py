""" Lê as vendas de determinado vendedor nos meses de janeiro, fevereiro, março e abril e calcula a média aritmética
de suas vendas. Exibe o total de vendas e a média. """ 

jan = int(input("Insira as vendas do mês de janeiro: "))
fev = int(input("Insira as vendas do mês de fevereiro: "))
mar = int(input("Insira as vendas do mês de março: "))
abr = int(input("Insira as vendas do mês de abril: "))

total = jan + fev + mar + abr
media = total / 4

print("O total de vendas foi {} e a média foi {} " .format(total, media))