cont = 1
lim = 10
num = int(input("De qual numero você quer saber a tabuada? "))
while (cont <= lim):
    tab = num * cont 
    print("{} x {} = {}" .format(num, cont, tab))
    cont = cont + 1
    