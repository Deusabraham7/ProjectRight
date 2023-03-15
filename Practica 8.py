n = input("Ingrese un numero del 1 al 100")
n= int(n)
if n>1 and n<20:
    print("Rojo")
else:
    if n>21 and n<40:
        print("Amarillo")
    else:
            if n>41 and n<60:
                print("Naranja")
            else:
                if n>61 and n<80:
                    print("Azul")
                else:
                    if n>81 and n<100:
                        print("Verde")
                    else:
                        print("Error ")
            
