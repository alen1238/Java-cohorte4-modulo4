
# Glosario de Operaciones en Colecciones Java

Este documento resume las operaciones más importantes de las principales implementaciones de colecciones en Java, con ejemplos prácticos.

---

## 1. ArrayList

```java
import java.util.ArrayList;

ArrayList<String> lista = new ArrayList<>();

// Agregar elementos
lista.add("A");
lista.add("B");

// Acceder por índice
String elem = lista.get(0); // "A"

// Modificar elemento
lista.set(1, "C");

// Eliminar por índice
lista.remove(0);

// Tamaño de la lista
int size = lista.size();
```

---

## 2. LinkedList

```java
import java.util.LinkedList;

LinkedList<String> lista = new LinkedList<>();

// Agregar al inicio y al final
lista.addFirst("A");
lista.addLast("B");

// Obtener primer y último elemento
String primero = lista.getFirst();
String ultimo = lista.getLast();

// Eliminar primero y último
lista.removeFirst();
lista.removeLast();

// Iterar
for (String s : lista) {
    System.out.println(s);
}
```

---

## 3. HashSet

```java
import java.util.HashSet;

HashSet<String> set = new HashSet<>();

// Agregar elementos
set.add("A");
set.add("B");
set.add("A"); // No se permite duplicados

// Verificar existencia
boolean existe = set.contains("B");

// Eliminar
set.remove("A");

// Tamaño
int size = set.size();
```

---

## 4. LinkedHashSet

```java
import java.util.LinkedHashSet;

LinkedHashSet<String> set = new LinkedHashSet<>();

set.add("A");
set.add("C");
set.add("B");

// Mantiene el orden de inserción
for (String s : set) {
    System.out.println(s);
}
```

---

## 5. TreeSet

```java
import java.util.TreeSet;

TreeSet<Integer> set = new TreeSet<>();

set.add(30);
set.add(10);
set.add(20);

// Elementos ordenados automáticamente: 10, 20, 30

// Obtener el menor y el mayor
int primero = set.first(); // 10
int ultimo = set.last();   // 30

// Buscar elementos cercanos
int mayorOIgual = set.ceiling(15); // 20
```

---

## 6. PriorityQueue

```java
import java.util.PriorityQueue;

PriorityQueue<Integer> pq = new PriorityQueue<>();

pq.add(30);
pq.add(10);
pq.add(20);

// Acceder al menor (raíz)
int peek = pq.peek(); // 10

// Extraer el menor
int poll = pq.poll(); // 10

// Iterar (no garantiza orden al recorrer)
for (int i : pq) {
    System.out.println(i);
}
```

---

## 7. ArrayDeque

```java
import java.util.ArrayDeque;

ArrayDeque<String> deque = new ArrayDeque<>();

// Agregar al inicio y final
deque.addFirst("A");
deque.addLast("B");

// Obtener elementos sin remover
String primero = deque.peekFirst();
String ultimo = deque.peekLast();

// Remover del inicio y final
deque.pollFirst();
deque.pollLast();
```

---

## 8. HashMap

```java
import java.util.HashMap;

HashMap<Integer, String> map = new HashMap<>();

// Insertar pares clave-valor
map.put(1, "A");
map.put(2, "B");

// Obtener valor por clave
String valor = map.get(1);

// Verificar existencia de clave o valor
boolean tieneClave = map.containsKey(2);
boolean tieneValor = map.containsValue("B");

// Eliminar
map.remove(1);
```

---

## 9. TreeMap

```java
import java.util.TreeMap;

TreeMap<Integer, String> map = new TreeMap<>();

map.put(3, "C");
map.put(1, "A");
map.put(2, "B");

// Claves ordenadas automáticamente: 1,2,3

// Obtener primer y último par
int primeraClave = map.firstKey();
int ultimaClave = map.lastKey();

// Submapas
System.out.println(map.headMap(3)); // {1=A, 2=B}
```

---

## 10. LinkedHashMap

```java
import java.util.LinkedHashMap;

LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

map.put(1, "A");
map.put(3, "C");
map.put(2, "B");

// Mantiene orden de inserción
for (var entry : map.entrySet()) {
    System.out.println(entry.getKey() + " -> " + entry.getValue());
}
```
