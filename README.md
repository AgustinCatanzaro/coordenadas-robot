# coordenadas-robot

Dadas una matriz la cual se usara como coordenadas y un robot con su posición inicial, utilizando comandos de rotación y movimiento, se calcula la posición final del mismo

---

DESCRIPCION DEL PROBLEMA

---

Un robot móvil se desplaza en una cuadrícula
de N por M cuadraditos sin salirse de ella. El robot
sólo obedece a dos tipos de órdenes: una que
indica que ángulo debe girar sobre sí mismo y otra
que indica cuántos cuadraditos debe avanzar en
sentido en el que estaba apuntando. Para que el
robot avance una cantidad de cuadraditos en una
dirección dada, primero debemos hacerlo girar
para que quede apuntando en el sentido deseado
y luego darle la orden de avance.

Así, si el robot está mirando hacia el norte y
queremos que se mueva tres cuadraditos hacia el
este, podríamos enviarle primero una orden para
que gire 90° en el sentido de las agujas del reloj
para que quede apuntando al este y luego le
enviamos la orden para que avance tres
cuadraditos en ese sentido.

La posición del robot se identifica por la
columna X y la fila Y del cuadradito que está
ocupando. La columna X puede variar de 1 a N y
la fila Y va desde 1 a M.

El sentido en el que está apuntando el robot se
identifica con las letras N (norte), S (sur), E (este)
y O (oeste), siendo el “norte” el sentido en el que
crece la fila Y, esto es la fila 1 es la que está más
al sur y la fila M más al norte, y el “este” es el
sentido en el que crece la columna X, siendo la
columna 1 la que está más al oeste y la columna
N la que queda más al este.

El robot cumple solamente dos tipos de
comandos.

Un tipo de comando es de la forma Rn donde
la “R” indica rotación en el sentido horario y “n”
es un número de 0 a 9 que indica el ángulo que
gira el robot. Si n=0 el robot gira cero grado, esto
es lo mismo que decir que no se mueve, si es n=1
gira 90° en el sentido horario, (por lo tanto si
estaba apuntando al norte quedará viendo hacia
el este), si n=2 gira 180°, si n=3 gira 270° , y así
sucesivamente.

Podemos resumir esto diciendo la orden Rn
hace que el robot gire n\*90° en el sentido horario.
Notar que la orden R4 hace que el robot haga un
giro completo sobre sí mismo y quede apuntando
en el mismo sentido que antes de la orden.

El otro tipo de comando es de la forma An,
donde la “A” indica avance y la “n” es un número
entre 0 y 9 que indica la cantidad de cuadraditos
que debe avanzar en la dirección en la que estaba
apuntando.

Como el robot no puede salirse de la
cuadrícula, ignora todas las órdenes que intenten
sacarlo fuera de ella. Así, si el robot avanza hasta
llegar a un borde y recibe la orden de seguir
avanzando, como no puede traspasar el borde
ignorará dicha orden. Una orden de avanzar varios
cuadraditos sólo se cumplirá parcialmente si el
robot choca con el borde.

---

SE PIDE

---

El problema a resolver es el siguiente:
conocida la posición inicial del robot y el sentido
en el que estaba apuntando y dada una secuencia
de órdenes, determinar cuál será su posición final.
Se pide escribir un programa ROBOT.EXE que
lea un archivo de órdenes y de la posición final del
mismo.

---

DATOS DE ENTRADA

---

Las órdenes están en el archivo de texto
ROBOT.IN del directorio actual conteniendo:

a) Una primera línea con los valores de X, Y, S, N y M separados por blancos, donde
X es la columna,

Y es la fila,

S es el sentido al inicio,

N es la cantidad total de columnas y

M la cantidad de filas de la cuadrícula.

b) La segunda línea contiene una hilera de hasta
250 caracteres donde aparecerán pares de la
forma Rn o An que indican las órdenes
enviadas al robot.

---

DATOS DE SALIDA

---

Grabe un archivo de texto ROBOT.OUT que
contenga los valores Xf y Yf separados por un
blanco, siendo Xf la fila e Yf la columna de la
posición final del robot.

---

EJEMPLO

---

Dado el input:

1 1 N 10 5

A9R1A2

El resultado esperado es:

3 5
