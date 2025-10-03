# 🍔 Proyecto: Food Festival Recommender

En este proyecto vamos a crear un programa en **Java** que modela un **festival gastronómico**. 
El sistema será capaz de recomendar platos a los visitantes según tres criterios:

1. Su **presupuesto disponible** y la **categoría gastronómica** que prefieren.  
2. Mostrar el **Top 3 de platos más saludables** (los de menor cantidad de calorías).  
3. Explorar todos los platos disponibles **agrupados por categoría**.  

---

## 🔹 Capas del sistema

### 1. Modelo  
- **Plato**  
  - `nombre` (String): nombre del plato.  
  - `precio` (double): costo del plato.  
  - `calorias` (int): cantidad de calorías.  
  - `categoria` (enum Categoria): tipo de plato (VEGANO, DULCE, PICANTE, BEBIDA, TRADICIONAL).  
  - `stand` (Stand): stand gastronómico donde se vende.  

- **Stand**  
  - `nombre` (String): nombre del stand que ofrece los platos.  

- **Categoria**  
  - Enumeración con los valores: VEGANO, DULCE, PICANTE, BEBIDA, TRADICIONAL.  

### 2. Datos (DataBaseSimulada)  
- Contendrá una lista estática de platos disponibles en el festival.  
- Para representar los datos se usará una **List<Plato>**, ya que:  
  - Permite **mantener el orden de inserción** de los platos (útil al mostrar menús).  
  - Facilita **operaciones con Streams** (`filter`, `sorted`, `limit`, `groupingBy`).  
  - Es una colección **dinámica** (puede crecer según se agreguen más platos).  
  - Es más flexible que usar un **array**, ya que evita problemas de tamaño fijo.  

➡️ No se usará un `Set` porque no necesitamos garantizar unicidad, y no se usará un `Map` porque los datos principales son listas de objetos que se consultan de manera secuencial.  

### 3. Servicio (PlatoService)  
Implementará la lógica de negocio utilizando **Streams**:  
- Filtrar platos por presupuesto y categoría.  
- Ordenar y mostrar los 3 con menor cantidad de calorías.  
- Agrupar platos por categoría.  

### 4. Interfaz consola (AppConsola)  
- Ofrecerá un menú interactivo para que el usuario seleccione la opción deseada.  
- Mostrará los resultados formateados de manera clara y amigable.  

---

## Objetivo General
Este proyecto busca que los estudiantes de Java cohorte 4 al finalizar el proyecto:  
- Practiquen el diseño en **capas** (modelo, servicio, datos, interfaz).  
- Apliquen **Streams en Java** para operaciones comunes sobre colecciones: filtrado, ordenamiento, limitación y agrupamiento.  
- Comprendan el uso de **List<>** como estructura de datos flexible y adecuada para simular bases de datos simples.  
- Vean un caso práctico atractivo y cercano (festival de comida) que los motive a experimentar con los criterios de búsqueda.  
