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

#### Bubble Sort

#### Selection Sort

#### Insertion Sort

#### Shell Sort

#### Merge Sort

#### Quick Sort

#### Counting Sort

#### Radix Sort

#### Ordenamiento de arreglos con funciones del JDK

#### Bucket Sort

### Algoritmos de Búsqueda

Un algoritmo de búsqueda tiene como propósito encontrar un valor (dato) en una estructura de datos.

#### Búsqueda Lineal

#### Búsqueda Binaria

