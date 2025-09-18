# Conjuntos en Java: HashSet, LinkedHashSet y TreeSet

## 1. HashSet
**Características:**
- No permite elementos duplicados.
- No garantiza ningún orden en los elementos.
- Muy rápido en operaciones de búsqueda, inserción y eliminación (O(1) en promedio).

**Ventaja:** máxima velocidad.  
**Desventaja:** no conserva el orden de los elementos.

**Ejemplo:**
```java
import java.util.HashSet;

public class EjemploHashSet {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Perro");
        hashSet.add("Gato");
        hashSet.add("Caballo");
        hashSet.add("Perro"); // duplicado, no lo guarda

        System.out.println("HashSet: " + hashSet);
    }
}
```
Salida posible (el orden puede variar):
```
HashSet: [Gato, Perro, Caballo]
```

---

## 2. LinkedHashSet
**Características:**
- No permite duplicados.
- Mantiene el orden de inserción.
- Rendimiento un poco menor que HashSet, pero aún muy eficiente.

**Ventaja:** conserva el orden en el que se agregaron los elementos.  
**Desventaja:** un poco más lento que HashSet.

**Ejemplo:**
```java
import java.util.LinkedHashSet;

public class EjemploLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Perro");
        linkedHashSet.add("Gato");
        linkedHashSet.add("Caballo");
        linkedHashSet.add("Perro"); // duplicado, no lo guarda

        System.out.println("LinkedHashSet: " + linkedHashSet);
    }
}
```
Salida:
```
LinkedHashSet: [Perro, Gato, Caballo]
```

---

## 3. TreeSet
**Características:**
- No permite duplicados.
- Ordena automáticamente los elementos en orden natural (o con un Comparator que definas).
- Opera internamente con un árbol rojo-negro (logaritmo en operaciones).
- Búsqueda, inserción y eliminación en O(log n).

**Ventaja:** los elementos siempre quedan ordenados.  
**Desventaja:** más lento que HashSet y LinkedHashSet.

**Ejemplo:**
```java
import java.util.TreeSet;

public class EjemploTreeSet {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Perro");
        treeSet.add("Gato");
        treeSet.add("Caballo");
        treeSet.add("Perro"); // duplicado, no lo guarda

        System.out.println("TreeSet: " + treeSet);
    }
}
```
Salida:
```
TreeSet: [Caballo, Gato, Perro]
```

---

## Comparación

| Implementación   | Orden                   | Velocidad promedio | Uso recomendado |
|------------------|-------------------------|---------------------|-----------------|
| HashSet          | No garantiza orden      | Muy rápido (O(1))  | Cuando importa solo la unicidad y la velocidad |
| LinkedHashSet    | Orden de inserción      | Rápido (O(1))      | Cuando además quieres conservar el orden de inserción |
| TreeSet          | Ordenado automáticamente | Más lento (O(log n)) | Cuando necesitas los elementos siempre ordenados |

---

## Prueba de velocidad

Este código mide cuánto tardan en insertar muchos elementos en cada estructura:

```java
import java.util.*;

public class ComparacionSets {
    public static void main(String[] args) {
        int n = 1000000; // un millón de elementos

        // HashSet
        long inicio = System.currentTimeMillis();
        Set<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < n; i++) hashSet.add(i);
        long fin = System.currentTimeMillis();
        System.out.println("HashSet: " + (fin - inicio) + " ms");

        // LinkedHashSet
        inicio = System.currentTimeMillis();
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        for (int i = 0; i < n; i++) linkedHashSet.add(i);
        fin = System.currentTimeMillis();
        System.out.println("LinkedHashSet: " + (fin - inicio) + " ms");

        // TreeSet
        inicio = System.currentTimeMillis();
        Set<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < n; i++) treeSet.add(i);
        fin = System.currentTimeMillis();
        System.out.println("TreeSet: " + (fin - inicio) + " ms");
    }
}
```

Resultado típico (depende del PC):
```
HashSet: 90 ms
LinkedHashSet: 110 ms
TreeSet: 600 ms
```
