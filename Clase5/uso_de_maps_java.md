# Uso de Map y sus Implementaciones en Java

## ¿Qué es un `Map<K, V>` y cuándo usarlo?

Un `Map` se utiliza cuando necesitas **asociar una clave (`key`) con un valor (`value`)**. Es ideal cuando:

- Necesitas **buscar un valor rápidamente** a partir de una clave.
- No quieres claves duplicadas.
- Deseas trabajar con estructuras tipo diccionario o tabla.

**Ejemplos comunes:**
- Buscar el precio de un producto por su ID.
- Asociar el nombre de un país con su capital.
- Guardar configuraciones por clave, como `"modoOscuro": true`.

---

## ¿Cuál implementación usar?

### `HashMap<K, V>`

**Características:**
- Muy rápido para operaciones de inserción, búsqueda y eliminación.
- ❌ No mantiene ningún orden (ni de claves ni de inserción).
- Permite `null` como clave y valores.

**¿Cuándo usarlo?**
- Cuando necesitas velocidad y **no te importa el orden** de los elementos.
- Ideal para búsquedas rápidas por clave.

**Ejemplo práctico:**
```java
HashMap<String, String> empleados = new HashMap<>();
empleados.put("123", "María");
empleados.put("456", "Pedro");
```

---

### `TreeMap<K, V>`

**Características:**
-  Ordena automáticamente las claves de menor a mayor.
-  Más lento que `HashMap`
- ❌ No permite claves `null`.

**¿Cuándo usarlo?**
- Cuando necesitas **ordenar automáticamente las claves**.
- Útil para reportes, ranking, o cualquier caso donde el orden alfabético o numérico importa.

**Ejemplo práctico:**
```java
TreeMap<String, Double> salarios = new TreeMap<>();
salarios.put("Carlos", 2500.0);
salarios.put("Ana", 3200.0);
salarios.put("Beatriz", 2900.0);
```

---

### `LinkedHashMap<K, V>`

**Características:**
-  Mantiene el **orden de inserción** de las claves.
-  Más rápido que `TreeMap`, pero un poco más lento que `HashMap`.
-  Permite `null`.

**¿Cuándo usarlo?**
- Cuando quieres **predecibilidad en el orden** en que agregaste los elementos.
- Ideal para estructuras tipo historial, listas ordenadas, cachés simples.

**Ejemplo práctico:**
```java
LinkedHashMap<Integer, String> historial = new LinkedHashMap<>();
historial.put(1, "Inicio");
historial.put(2, "Perfil");
historial.put(3, "Configuración");
```

---

## Comparación 

| Característica          | HashMap        | TreeMap        | LinkedHashMap   |
|------------------------|----------------|----------------|-----------------|
| Orden de claves        | No garantizado | Ordenado       | Inserción       |
| Velocidad              |  Rápido       |  Más lento    |  Intermedio    |
| Claves `null`          | Sí             | No             | Sí              |
| Estructura interna     | Tabla hash     | Árbol balanceado| Lista + tabla   |
| Uso típico             | Búsqueda rápida| Reportes orden.| Historial       |

---

##  ¿Cuándo NO usar `Map`?

- Si necesitas **valores duplicados** sin clave, usa una `List`.
- Si necesitas simplemente saber si un valor está presente o no, usa un `Set`.
