# ARSWLAB1
Laboratorio realizado por:
* Ricardo Amaya  
* Juan Pablo Contreras

### Parte I - Introducción a Hilos en Java

De acuerdo con lo revisado en las lecturas, complete las clases CountThread, para que las mismas definan el ciclo de vida de un hilo que imprima por pantalla los números entre A y B.
Complete el método main de la clase CountMainThreads para que:
* Cree 3 hilos de tipo CountThread, asignándole al primero el intervalo [0..99], al segundo [99..199], y al tercero [200..299].
* Inicie los tres hilos con 'start()'.
* Ejecute y revise la salida por pantalla.
* Cambie el incio con 'start()' por 'run()'. Cómo cambia la salida?, por qué?.
* RTA:/ Con el start() vemos que la salida se presenta en desorden , mientras que con el run se va en orden desde 0 hasta 299, la razon de esto es porque con el start se comporta de manera asincronica,, mientras que con el run lo toma como un objeto normal ejecutando el run como un metodo y hasta que no termine este no crea el siguiente hilo.
### Parte III - Evaluación de Desempeño
A partir de lo anterior, implemente la siguiente secuencia de experimentos para realizar las validación de direcciones IP dispersas (por ejemplo 202.24.34.55), tomando los tiempos de ejecución de los mismos (asegúrese de hacerlos en la misma máquina):

* Un solo hilo.
* Tantos hilos como núcleos de procesamiento (haga que el programa determine esto haciendo uso del API Runtime).(Runtime.getRuntime().availableProcessors())
* Tantos hilos como el doble de núcleos de procesamiento.
* 50 hilos.
* 100 hilos.
