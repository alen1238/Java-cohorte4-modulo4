# Glosario Completo de Streams en Java

---

### 1. Métodos Intermedios (Intermediate operations)

> Transforman o filtran un Stream, **no lo consumen** y se pueden encadenar.

| Método                               | Descripción                                                                   | Ejemplo                                                      |
| ------------------------------------ | ----------------------------------------------------------------------------- | ------------------------------------------------------------ |
| `filter(Predicate<T> p)`             | Filtra elementos según condición                                              | `stream.filter(p -> p.getCalorias() < 200)`                  |
| `map(Function<T,R> f)`               | Transforma cada elemento                                                      | `stream.map(Plato::getNombre)`                               |
| `flatMap(Function<T, Stream<R>> f)`  | Convierte elementos en Streams y los aplana                                   | `stream.flatMap(p -> p.getIngredientes().stream())`          |
| `distinct()`                         | Elimina duplicados (basado en `equals`)                                       | `stream.distinct()`                                          |
| `sorted()`                           | Ordena elementos según orden natural                                          | `stream.sorted()`                                            |
| `sorted(Comparator<T> c)`            | Ordena con un comparador personalizado                                        | `stream.sorted(Comparator.comparingInt(Plato::getCalorias))` |
| `peek(Consumer<T> c)`                | Ejecuta acción intermedia (debug o logging)                                   | `stream.peek(System.out::println)`                           |
| `limit(long n)`                      | Toma solo los primeros `n` elementos                                          | `stream.limit(3)`                                            |
| `skip(long n)`                       | Omite los primeros `n` elementos                                              | `stream.skip(2)`                                             |
| `mapToInt(ToIntFunction<T> f)`       | Convierte a `IntStream`                                                       | `stream.mapToInt(Plato::getCalorias)`                        |
| `mapToDouble(ToDoubleFunction<T> f)` | Convierte a `DoubleStream`                                                    | `stream.mapToDouble(Plato::getPrecio)`                       |
| `mapToLong(ToLongFunction<T> f)`     | Convierte a `LongStream`                                                      | `stream.mapToLong(Plato::getId)`                             |
| `boxed()`                            | Convierte `IntStream`, `DoubleStream` o `LongStream` a `Stream<T>` de objetos | `stream.mapToInt(Plato::getCalorias).boxed()`                |
| `sorted(Comparator.reverseOrder())`  | Orden descendente                                                             | `stream.sorted(Comparator.reverseOrder())`                   |

---

### 2. Métodos Terminales (Terminal operations / de cierre)

> Consumen el Stream y devuelven un **resultado concreto** (colección, valor, booleano, Optional).

| Método                          | Descripción                                                                             | Ejemplo                                                      |
| ------------------------------- | --------------------------------------------------------------------------------------- | ------------------------------------------------------------ |
| `collect(Collector<T,A,R> c)`   | Recolecta elementos en colección, lista, Set o Map                                      | `stream.collect(Collectors.toList())`                        |
| `forEach(Consumer<T> c)`        | Ejecuta acción sobre cada elemento                                                      | `stream.forEach(System.out::println)`                        |
| `forEachOrdered(Consumer<T> c)` | Igual que `forEach` pero mantiene el orden en Streams paralelos                         | `stream.parallel().forEachOrdered(System.out::println)`      |
| `reduce(BinaryOperator<T> op)`  | Combina elementos en uno solo                                                           | `stream.map(Plato::getCalorias).reduce(0, Integer::sum)`     |
| `count()`                       | Cuenta el número de elementos                                                           | `stream.filter(p -> p.getCalorias() < 200).count()`          |
| `anyMatch(Predicate<T> p)`      | True si **al menos uno** cumple                                                         | `stream.anyMatch(p -> p.getCategoria() == Categoria.VEGANO)` |
| `allMatch(Predicate<T> p)`      | True si **todos** cumplen                                                               | `stream.allMatch(p -> p.getCalorias() < 500)`                |
| `noneMatch(Predicate<T> p)`     | True si **ninguno** cumple                                                              | `stream.noneMatch(p -> p.getCalorias() > 1000)`              |
| `findFirst()`                   | Devuelve el **primer elemento** como Optional                                           | `stream.filter(p -> p.getCalorias() < 200).findFirst()`      |
| `findAny()`                     | Devuelve **cualquier elemento** (útil en paralelo)                                      | `stream.findAny()`                                           |
| `max(Comparator<T> c)`          | Devuelve el **mayor elemento** según comparador                                         | `stream.max(Comparator.comparingInt(Plato::getCalorias))`    |
| `min(Comparator<T> c)`          | Devuelve el **menor elemento** según comparador                                         | `stream.min(Comparator.comparingInt(Plato::getCalorias))`    |
| `toArray()`                     | Convierte el Stream en un array                                                         | `stream.toArray()`                                           |
| `summaryStatistics()`           | Para `IntStream`, `DoubleStream` o `LongStream`: devuelve count, sum, min, max, average | `stream.mapToInt(Plato::getCalorias).summaryStatistics()`    |

---

### 3. Collectors muy útiles

| Collector                                                          | Descripción                               | Ejemplo                                                                     |
| ------------------------------------------------------------------ | ----------------------------------------- | --------------------------------------------------------------------------- |
| `Collectors.toList()`                                              | Devuelve una `List`                       | `stream.collect(Collectors.toList())`                                       |
| `Collectors.toSet()`                                               | Devuelve un `Set`                         | `stream.collect(Collectors.toSet())`                                        |
| `Collectors.groupingBy(Function<T,K> f)`                           | Agrupa elementos en Map según clave       | `stream.collect(Collectors.groupingBy(Plato::getCategoria))`                |
| `Collectors.counting()`                                            | Cuenta elementos en un collector          | `stream.collect(Collectors.counting())`                                     |
| `Collectors.summingInt(ToIntFunction<T> f)`                        | Suma valores de un atributo               | `stream.collect(Collectors.summingInt(Plato::getCalorias))`                 |
| `Collectors.averagingDouble(ToDoubleFunction<T> f)`                | Promedia valores de un atributo           | `stream.collect(Collectors.averagingDouble(Plato::getPrecio))`              |
| `Collectors.joining(CharSequence delim)`                           | Une Strings con separador                 | `stream.map(Plato::getNombre).collect(Collectors.joining(", "))`            |
| `Collectors.mapping(Function<T,U> f, Collector<U,A,R> downstream)` | Aplica transformación antes de recolectar | `stream.collect(Collectors.mapping(Plato::getNombre, Collectors.toList()))` |

---

## Documentación oficial

1. **Streams API**:
   [https://docs.oracle.com/en/java/javase/20/docs/api/java.base/java/util/stream/package-summary.html](https://docs.oracle.com/en/java/javase/20/docs/api/java.base/java/util/stream/package-summary.html)

2. **Clase Collectors**:
   [https://docs.oracle.com/en/java/javase/20/docs/api/java.base/java/util/stream/Collectors.html](https://docs.oracle.com/en/java/javase/20/docs/api/java.base/java/util/stream/Collectors.html)
