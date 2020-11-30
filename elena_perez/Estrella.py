import time
import turtle
punt=0
print ("Ingrese el numero de puntas de la estrella")
punt=int(input())
ang=0

t=turtle.Pen()

for x in range(1,punt+1):
	t.forward(250)
	lado=float(180+(180/punt))
	t.left(lado)
