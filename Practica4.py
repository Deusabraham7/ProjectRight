#pedirle al usuario 3 numero y decir cual es el mayor

numero1 = input("Ingrese el numero 1:")
numero1= int(numero1)
numero2 = input ("ingrese el numero 2:")
numero2 = int(numero2)
numero3 = input("Ingrese el numero 3:")
numero3 = int(numero3)


if numero1 > numero2 and numero1 > numero3:
        print("el numero 1 es el mayor")

if numero2>numero1 and numero2>numero3:
        print("El numero 2 es mayor")

if numero3>numero1 and numero3>numero2:
        print("El numero 3 es el mayor")

else:
    print("ningun numero es mayor")
    


