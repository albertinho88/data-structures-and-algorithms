# Estructuras de Datos y Algoritmos

## Descripción General

Este repositorio contiene conceptos e implementaciones de diversas estructuras de datos y algoritmos en Java. El objetivo es proporcionar información y código claro, eficiente y bien documentado que pueda utilizarse con fines educativos o como referencia para el desarrollo de software.

## Contenido

- [Notación Big-O](#notación-big-o)
- [Estructuras de Datos](#estructuras-de-datos)
  - [Arreglos](#arreglos-(arrays))
  - [Listas](#listas-(lists))
  - [Pilas](#pilas-(stacks))
  - [Colas](#colas-(queues))
  - [Tablas Hash](#tablas-hash-(hashtables))
  - [Árboles](#árboles-(trees))
  - [Heaps](#heaps)
  - [Sets](#sets)
- [Algoritmos](#algoritmos)
  - [Algoritmos de Ordenamiento](#algoritmos-de-ordenamiento)
    - [Bubble Sort](#bubble-sort)
    - [Selection Sort](#selection-sort)
    - [Insertion Sort](#insertion-sort)
    - [Shell Sort](#shell-sort)
    - [Merge Sort](#merge-sort)
    - [Quick Sort](#quick-sort)
    - [Counting Sort](#counting-sort)
    - [Radix Sort](#radix-sort)
    - [Ordenamiento de arreglos con funciones del JDK](#rdenamiento-de-arreglos-con-funciones-del-jdk)
  - [Algoritmos de Búsqueda](#algoritmos-de-búsqueda)
    - [Búsqueda Lineal](#búsqueda-lineal)
    - [Búsqueda Binaria](#búsqueda-binaria)

## Notación Big-O

**Time Complexity.-** número de pasos que toma ejecutar un algoritmo. El peor escenario nos dirá la complejidad en tiempo.

**Memory Complexity.-** cantidad de memoria usada para ejecutar un algoritmo. (En la actualidad la memoria es barata, por lo que esto no es un gran problema)

| Notación Big-O | Time Complexity | Orden |
| --------------- | --------------- | ----- |
| O(1)            | Constante       | 1     |
| O(log2 n)       | Logaritmico     | 2     |
| O(n)            | Linear          | 3     |
| O(nlog2 n)      | n log-start n   | 4     |
| O(n2)           | Cuadrático     | 5     |

## Estructuras de Datos

Organiza y almacena datos.
Cada estructura de datos tiene su propósito, así como sus ventajas y desventajas.

### Arreglos (Arrays)

Los arreglos son ideales para memoria de acceso aleatorio cuando conocemos los índices de sus elementos.

Declaración:

```
int[] arrayNumbers = new int[7];
```

Un arreglo es una estructura linear, por lo tanto no es una estructura de datos dinámica.

Los arreglos se almacenan como bloques contiguos en memoria. Cada elemento ocupa la misma cantidad de espacio en memoria.

#### Big-O para operaciones de Arreglos

| Operación                                                              | Time Complexity |
| ----------------------------------------------------------------------- | --------------- |
| Obtener con índice                                                     | O(1)            |
| Obtener sin índice                                                     | O(n)            |
| Agregar un elemento a un arreglo lleno                                  | O(n)            |
| Agregar un elemento al final de un arreglo con espacio                  | O(1)            |
| Agregar o actualizar un elemento en una posición (índice) específico | O(1)            |
| Eliminar un elemento estableciéndolo como null                         | O(1)            |
| Eliminar un elemento desplazando elementos                              | O(n)            |

### Estructura de Datos Abstractos

- No es una esctructura de datos concreta.
- No dicta como los datos están organizados, sino que dicta las operaciones que pueden ser ejecutadas.
- Una estructura de datos concreta es usualmente una Clase concreta, mientras que una estructura de datos abstracta es usualmente una interfaz.

### Listas (Lists)

- Estructura de datos abstracta.
- Estructura de datos ordenanda.
  
  #### ArrayLists
  
  - Implementación de un arreglo redimensionable de la interfaz de List. (El arreglo es llamado Backing Array).
  - Un ArrayList debe tener una capacidad inicial y un tamaño (son diferentes valores).
  - Capacidad inicial por defecto = 10.
  
  #### Vectors
  
  #### Singly Linked Lists
  
  #### Doubly Linked Lists
  
  #### JDK LinkedList Class

### Pilas (Stacks)

- Estructura de datos abstracta.
- Puede ser respaldada por cualquier estructura de datos.
- LIFO -> Last in, first out. (No random access)
- Operaciones:
  
  - push.- agregar un elemento como el elemento de más arriba de la pila.
  - pop.- remover el elemento de más arriba de la pila.
  - peek.- obtener el elemento de más arriba de la pila sin removerlo.
- La estructura de datos ideal para respaldar o implementar una pila es LinkedList.
- Time Complexity
  
  - O(1) -> para push, pop, peek (LinkedList)
  - O(n) -> para push (Array, el arreglo podría ser redimensionando)
  
  #### JDK Stack Class
  
  - Extiende de la clase Vector con 5 operaciones que permiten al vector ser tratado como una pila.
  - La documentación de la clase Stack dice que un conjunto de operaciones LIFO más completas y consistentes son definidas por la interfaz Deque y sus implementaciones. Ejemplo:

```
Deque<Integer> stack = new ArrayDeque<Integer>();
```

### Colas (Queues)

- Estructura de datos abstracta.
- FIFO - First in, first out.
- Operaciones:
  
  - add.- también llamada enqueue, agrega un elemento al final de la cola.
  - remove.- también llamada dequeue, remueve el elemento al frente de la cola.
  - peeke.- obtiene el elemento al frente de la cola, pero no lo remueve.
- Time Complexity:
  
  - LinkedList - O(1)
  - Array - O(n) el arreglo podría ser redimensionado después de agregar un elemento.
  
  #### Queues and the JDK
  
  - Queue interface.

### Tablas Hash (Hashtables)

- Estructura de datos abstracta.
- Provee acceso a los datos utilizando llaves (keys).
- La llave (key) no debe ser un entero.
- Consiste the pares llave-valor (key-value). Los tipos de datos no tienen que coincidir.
- Optimizado para la recuperación de valores cuando se conoce la llave (key).
- Un arreglo asociativo (associative array) es un tipo de tabla hash.
  
  #### Hashing
  
  - Una función Hash mapea llaves (keys) de cualquier tipo a un entero (int).
  - En java, la función hash es Object.hashCode()
  - Una colisión sucede cuando más de un elemento tiene el mismo valor hash.
  
  #### Load Factor
  
  - Nos dice cuan llena está una tabla hash.
  - Load Factor = número de items / capacidad = tamaño / capacidad.
  - El Load Factor se utiliza para decidir cuando redimensionar el arreglo que implementa la tabla Hash.
  - No es deseable un Load Factor muy bajo, ya que habrán muchos espacios vacíos.
  - No es deseable un Load Factor muy alto, ya que incrementará la probabilidad de colisiones.
  
  #### Linear Probing
  
  - Estrategia utilizada cuando sucede una colisión.
  
  #### Chaining
  
  - Otra estrategia para manejar colisiones.
  - En vez de almacenar el valor directamente en el arreglo, cada posición en el arreglo contiene una LinkedList.
  - La implementación de Chaining es más fácil que la de Linear Probing, pero no quiere decir que necesariamente tenga un mejor rendimiento.
  - El rendimiento depende en la función Hash y el Load Factor.
  
  #### Hashtables and the JDK
  
  - La interfaz principal para Hashtables es Map.
  - Map es una interfaz del tipo llave-valor par (key-value pair)
  - Es un objeto que mapea llaves a valores.
  - Un map no puede contener llaves duplicadas, y cada llave puede mapear máximo a un valor.
    
    ##### HashMap
    
    - Clase concreta de la interfaz Map.
    - Esta implementación provee un rendimiento constante en tiempo para las operaciones básicas (get y put)
    - Load Factor por defecto 0.75
    - Esta implementación no es sincronizada (synchronized)
    - Es una implementación de arreglo.
    
    ##### LinkedHashMap
    
    - Implementación de tabla hash y lista enlazada de la interfaz Map.
    - Esta implementación difiere de HashMap en que mantiene un lista enlazada doble (DoublyLinkedList) en todas sus entradas. Esta lista enlazada define el orden de iteración, que normalmente es el orden en el que se insertaron las claves en el mapa (orden de inserción).
    - Esta implementación no es sincronizada (synchronized)
    
    ##### Hashtable Class
    
    - Esta clase implementa una tabla hash, la cual mapea llaves a valores.
    - Cualquier objecto no nulo (non-null) puede ser usado como llave or como valor.
    - Esta implementación es sincronizada.

### Árboles (Trees)

- Los árboles dictan como organizar los datos, but también se pueden implementar ciertos tipos de árboles con arreglos.
- Es una estructura de datos jerárquica.
- Cada item en el árbol es un nodo.
- El nodo superior del árbol es la raíz.
- Cada nodo que no es raíz tiene uno y solo un padre.
- Un nodo hoja no tiene hijos.
- Un árbol singleton tiene un solo nodo (la raíz)
- La profundidad de un nodo es el número de aristas desde el nodo hasta la raíz.
- La profundidad de la raíz es siempre 0.
- La altura de un nodo es el número de aristas en la ruta más larga desde el nodo hasta la hoja.
- La altura de un nodo hoja es siempre 0.
- La altura de un árbol es la altura de su raíz.
  
  #### Árbol Binario (Binary Tree)
  
  #### Binary Search Tree
  
  #### Trees and the JDK
  
  - TreeMap<K,V>
  - TreeSet<E>
    - Estructura que no puede contener duplicados.

### Heaps

- Heap es un tipo especial de árbol binario.
- Árbol binario completo

### Sets

- Estructura de datos abstracta.
- Aplicable a cualquier estructura de datos.
- Es una colección que no contiene elementos duplicados.
- Un Set puede contener un elemento nulo.

## Algoritmos

Un algoritmo describe los pasos a seguir para realizar una tarea específica.

Un algoritmo no es una implementación.

Pueden haber muchas implementaciones para un mismo algoritmo.

Una implementación es el código escrito cuando hablamos de programación.

Pueden haber muchos algoritmos que realicen una misma tarea.

### Algoritmos de Ordenamiento

**In-place algorithm.-** Algoritmo que no utiliza otro arreglo para ordenar, aunque si puede utilizar variables temporales.

**Algoritmo de ordenamiento estable.-** Preserva el orden relativo the elementos duplicados.

**Algoritmo de ordenamiento inestable.-** No preserva el orden relativo the elementos duplicados.

#### Bubble Sort

- Se degrada rápidamente.
- In-place algorithm.
- O(n<sup>2</sup>) - Time Complexity Cuadrático.

#### Selection Sort

- In-place algorithm.
- O(n<sup>2</sup>) - Time Complexity Cuadrático.
- No requiere tanto intercambio de elementos como Bubble Sort.
- Algoritmo inestable.

#### Insertion Sort

- In-place algorithm.
- O(n<sup>2</sup>) - Time Complexity Cuadrático.
- Algoritmo estable.
- Empieza en la posición 1. Cada iteración compara un elemento con los elementos a su izquierda desplazandolos e insertando el nuevo elemento si es menor que alguno de ellos.

#### Shell Sort

- Variación de Insertion Sort.
- Insertion Sort escoge que elemento insertar utilizando una brecha (gap) de 1.
- Shell Sort empieza utilizando una brecha (gap) mayor.
- A medida que se ejecuta el algoritmo, la brecha (gap) se reduce.
- El objetivo es reducir la cantidad de desplazamiento de elementos.
- El último valor de la brecha (gap) es siempre 1.
- In-place algorithm.
- Su peor escenario es O(n2), pero puede tener un mejor rendimiento que time complexity cuadrático.
- Algoritmo inestable.

#### Merge Sort

- Algoritmo recursivo.
- No in-place algorithm.
- O(n log<sub>2</sub> n) time complexity, repetitivamente particionamos el arreglo en dos mitades.
- Algoritmo estable.

#### Quick Sort

- Algoritmo recursivo.
- No in-place algorithm.
- O(n log<sub>2</sub> n) time complexity, repetitivamente particionamos el arreglo en dos mitades.
- Algoritmo inestable.
- Peor escenario: O(n<sup>2</sup>)
- Escenario promedio: O(n log<sub>2</sub> n)

#### Counting Sort

- Hace suposiciones sobre los datos.
- No hace comparaciones.
- Cuenta el número de ocurrencia de cada valor.
- Solo funciona con valores discretos no negativos.
- Los valores deben estar en un rango específico.
- No in-place algorithm.
- O(n) time complexity.
- Si queremos que el ordenamiento sea estable, algunos pasos extra deben ser ejecutados.

#### Radix Sort

- Hace suposiciones sobre los datos.
- Los datos deben tener el mismo radio y ancho. Por lo tanto los datos deben ser enteros (integers) o cadenas de caracteres (strings).
- Ordenamiento basado en la posición individual de cada dígito o letra.
- Comienza en la posición más a la derecha.
- Debe usar un algoritmo de ordenamiento estable en cada etapa.
- Counting Sort es frecuentemente usado como el algoritmo de ordenamiento para Radix Sort. (Stable Counting Sort).
- O(n) time complexity.

#### Ordenamiento de arreglos con funciones del JDK

- Arrays.sort()
  - O(n log<sub>2</sub> n)
  - Dual-Pivot Quicksort. Típicamente mas rápido que el tradicional One-Pivot Quicksort.
- Arrays.parallelSort()
  - Utiliza hilos (threads)
  - Parallel Merge Sort.
  - Orden el rango especificado del arreglo utilizando Parallel Merge Sort y/o Dual-Pivot Quicksort.

Para ordenar un arreglo de objetos se debe implementar la interface Comparable.

#### Bucket Sort

- Utiliza hashing.
- Hace suposiciones sobre los datos, por lo tanto puede ordenar en O(n) time complexity.

### Algoritmos de Búsqueda

Un algoritmo de búsqueda tiene como propósito encontrar un valor (dato) en una estructura de datos.

#### Búsqueda Lineal

- Búsqueda simple.
- O(n) time complexity.

#### Búsqueda Binaria

- Los datos deben estar ordenados.
- Escoge el elemento de la mitad del arreglo y lo compara con el valor a buscar. Si son iguales la búsqueda termina.
- Si el elemento es mayor que el valor a buscar, buscará en la mitad izquierda del arreglo.
- Si el elemento es menor que el valor a buscar, buscará en la mitad derecha del arreglo.
- En algún punto, habrá solo un elemento, pero no se tiene que llegar a ese punto.
- Puede ser implementada recursivamente.
- O(log n) -> ya que se mantiene dividiendo el arreglo en 2 partes.

