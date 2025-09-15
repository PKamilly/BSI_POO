import random

def gerarLista(tamanho):
    lista=[]
    for i in range(tamanho):
        lista.append(random.int(1,100))
    return lista

tamanho=int(input("Digite um tamanho: "))
lista = gerarLista(tamanho)

#for i
#for i in range(tamanho):
#    if lista[i] % 3 == 0:
#        print(f"{lista[i]} é multiplo de 3")
#    elif lista[i] % 2 == 0:
#        print(f"{lista[i]} é par")
#    else:
#        print(f"{lista[i]} é impar")

#for each
for valor in lista:
    if valor % 3 == 0:
        print(f"{valor} é multiplo de 3")
    elif valor % 2 == 0:
        print(f"{valor} é par")
    else:
        print(f"{valor} é impar")
