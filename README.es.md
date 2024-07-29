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

### Listas (Lists)

### Pilas (Stacks)

### Colas (Queues)

### Tablas Hash (Hashtables)

### Árboles (Trees)

### Heaps

### Sets

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
- O(n2) - Time Complexity Cuadrático.

#### Selection Sort

- In-place algorithm.
- O(n2) - Time Complexity Cuadrático.
- No requiere tanto intercambio de elementos como Bubble Sort.
- Algoritmo inestable.

#### Insertion Sort

- In-place algorithm.
- O(n2) - Time Complexity Cuadrático.
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
- O(n log2 n) time complexity, repetitivamente particionamos el arreglo en dos mitades.
- Algoritmo estable.

#### Quick Sort

- Algoritmo recursivo.
- No in-place algorithm.
- O(n log2 n) time complexity, repetitivamente particionamos el arreglo en dos mitades.
- Algoritmo inestable.
- Peor escenario: O(n<sup>2</sup>)
- Escenario promedio: O(n log2 n)

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
  - O(n log n)
  - Dual-Pivot Quicksort. Típicamente mas rápido que el tradicional One-Pivot Quicksort.
- Arrays.parallelSort()
  - Utiliza hilos (threads)
  - Parallel Merge Sort.
  - Orden el rango especificado del arreglo utilizando Parallel Merge Sort y/o Dual-Pivot Quicksort.

#### Bucket Sort

### Algoritmos de Búsqueda

Un algoritmo de búsqueda tiene como propósito encontrar un valor (dato) en una estructura de datos.

#### Búsqueda Lineal

#### Búsqueda Binaria

