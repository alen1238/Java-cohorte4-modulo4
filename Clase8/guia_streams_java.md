# Guía práctica de métodos de Stream en Java

## 1. Filtrar y seleccionar elementos
Cuando quiero reducir la colección a los elementos que cumplen una condición:  
- `filter(Predicate<T>)`: Mantiene solo los elementos que cumplan el criterio.  
- `distinct()`: Elimina duplicados.  
- `limit(n)`: Toma solo los primeros `n` elementos.  
- `skip(n)`: Omite los primeros `n` elementos.  

**Recomendación:** usar `filter` siempre que tengas una condición lógica (ej: `precio < 10000`).  

---

## 2. Transformar elementos
Cuando quiero convertir o modificar los datos:  
- `map(Function<T,R>)`: Transforma cada elemento en otro (ej: de `Plato` a su `precio`).  
- `flatMap(Function<T,Stream<R>>)` : Aplana colecciones anidadas en un solo Stream.  
- `mapToInt`, `mapToDouble`, `mapToLong`: Transformar a tipos primitivos para cálculos más eficientes.  

**Recomendación:** usar `map` cuando quieras obtener “otra vista” del objeto.  

---

## 3. Ordenar
Cuando necesito ordenar los resultados:  
- `sorted()`: Orden natural (ej: alfabético o numérico).  
- `sorted(Comparator)`: Orden personalizado (ej: por precio descendente).  

**Recomendación:** usar `Comparator.comparing` para ordenar por propiedades de objetos.  

---

## 4. Reducir a un resultado único
Cuando quiero obtener un valor final a partir del stream:  
- `reduce`: Combina los elementos en un solo resultado (ej: suma total de precios).  
- `count()`: Número de elementos.  
- `min(Comparator)`, `max(Comparator)`: Encuentra el menor/mayor.  
- `anyMatch`, `allMatch`, `noneMatch`: Verificar condiciones en los elementos.  
- `findFirst`, `findAny`: Obtener un elemento específico.  

**Recomendación:** para sumas, promedios y conteos usa mejor `mapToInt().sum()` o `average()`.  

---

## 5. Agrupar y recolectar
Cuando quiero guardar los resultados en otra colección o hacer estadísticas:  
- `collect(Collectors.toList())`: Pasar a lista.  
- `collect(Collectors.toSet())`: Pasar a conjunto (sin duplicados).  
- `collect(Collectors.toMap())`: Pasar a mapa.  
- `collect(Collectors.groupingBy(...))`: Agrupar por una propiedad.  
- `collect(Collectors.partitioningBy(...))`: Separar en dos grupos según condición (true/false).  
- `collect(Collectors.summarizingInt/Double/Long)`: Estadísticas de resumen (suma, promedio, máx, mín).  

**Recomendación:** `groupingBy` es uno de los más potentes y menos usados al inicio; ideal para clasificar.  

---

## 6. Acciones finales
Métodos que ejecutan el stream (terminan la cadena):  
- `forEach`: Ejecuta una acción en cada elemento.  
- `forEachOrdered`: Igual que `forEach` pero mantiene orden en streams paralelos.  
- `toArray`: Convierte a arreglo.  

**Recomendación:** usar `forEach` solo para mostrar resultados; evita usarlo para lógica compleja.  

---

# Recomendaciones generales
1. Empieza siempre pensando en el objetivo: ¿quiero filtrar, transformar, ordenar o agrupar? → eso dicta el método.  
2. Encadena operaciones: un `filter` seguido de un `map` es común.  
3. Prefiere declarativo sobre imperativo: Streams no eliminan ciclos, pero hacen tu código más claro.  
4. No abuses de Streams: si la operación es muy simple, un `for` puede ser más claro.  

---

# Documentación oficial  
[Java Stream API Documentation (Oracle)](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/stream/Stream.html)  
