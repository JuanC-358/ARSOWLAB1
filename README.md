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
![alt text](https://github.com/JuanC-358/ARSWLAB1/blob/main/img/P3.PNG)

### Parte IV - Ejercicio Black List Search

* Según la ley de Amdahls:

donde S(n) es el mejoramiento teórico del desempeño, P la fracción paralelizable del algoritmo, y n el número de hilos, a mayor n, mayor debería ser dicha mejora. Por qué el mejor desempeño no se logra con los 500 hilos?, cómo se compara este desempeño cuando se usan 200?.
RTA:/ A Mayor hilos menor tiempo , pero llega un punto delimitado por los componentes del equipo en el que el tiempo ya no se podra reducir mas.

* Cómo se comporta la solución usando tantos hilos de procesamiento como núcleos comparado con el resultado de usar el doble de éste.
    RTA:/ El tiempo de solucion es menor pero requiere mas memoria para hacerlo*

* De acuerdo con lo anterior, si para este problema en lugar de 100 hilos en una sola CPU se pudiera usar 1 hilo en cada una de 100 máquinas hipotéticas, la ley de Amdahls se aplicaría mejor?. Si en lugar de esto se usaran c hilos en 100/c máquinas distribuidas (siendo c es el número de núcleos de dichas máquinas), se mejoraría?. Explique su respuesta.
RTA:/caso 1 : No estaríamos aplicando correctamente la Ley de Amdahls, ya que no estamos sacando el maximo provecho de dichos 
   equipos, si tendríamos reducciones en la ejection de un programa, pero se podría reducir aún más. 
   caso 2 :Estaríamos sacando el maximo provecho de ello, ya que además de ejecutar diferentes partes de un programa en diferentes equipos también estaríamos ejecutando al tiempo diferentes Hilos en un solo equipo por lo que  se reduce asi el tiempo de ejecución de cada una de las partes del programa que esté corriendo cada uno de los equipos generando a nivel global del programa una reduction enorme en comparación a usar un solo hilo por equipo.