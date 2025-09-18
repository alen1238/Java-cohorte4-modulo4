# Ejemplos de situaciones para elegir entre HashSet, LinkedHashSet y TreeSet

## 1. Control de correos electrónicos únicos en una aplicación

**Enunciado:**  
Necesitas almacenar direcciones de correo electrónico ingresadas por usuarios y asegurarte de que no se repitan. No importa el orden de los correos ni mostrarlos ordenados.

**Respuesta:**  
HashSet.  

Porque ofrece inserción y búsqueda muy rápidas (O(1) promedio).  
El orden de inserción o de ordenamiento no es relevante.  

---

## 2. Registro de nombres en un formulario con preservación del orden

**Enunciado:**  
Estás guardando los nombres que escriben los estudiantes en un formulario. Después, deseas mostrar los nombres exactamente en el orden en que se registraron.

**Respuesta:**  
LinkedHashSet.  

Garantiza unicidad como cualquier Set.  
Mantiene el orden de inserción, ideal para mostrar los datos tal cual se ingresaron.  

---

## 3. Conjunto de palabras para un diccionario electrónico

**Enunciado:**  
Vas a implementar un diccionario que debe almacenar palabras sin repetirse y además mostrarlas en orden alfabético.

**Respuesta:**  
TreeSet.  

Mantiene los elementos ordenados automáticamente (en este caso por orden natural de las palabras).  
También permite operaciones de rango (buscar palabras antes o después de cierto término).  

---

## 4. Lista negra de usuarios en una aplicación en línea

**Enunciado:**  
Tienes que verificar rápidamente si un usuario está en una “lista negra” para bloquear su acceso. No importa en qué orden se almacenan.

**Respuesta:**  
HashSet.  

Permite búsquedas muy rápidas.  
El orden no es importante, solo importa la existencia o no del usuario.  

---

## 5. Seguimiento de clics de navegación de un usuario

**Enunciado:**  
Quieres guardar las páginas que visitó un usuario en una sesión, sin duplicados, pero preservando el orden de navegación.

**Respuesta:**  
LinkedHashSet.  

Preserva el orden de inserción (secuencia de navegación).  
Evita almacenar páginas repetidas.  

---

## 6. Catálogo de productos que siempre debe estar ordenado por nombre

**Enunciado:**  
Un catálogo de productos debe mostrarse en todo momento ordenado por el nombre del producto. No se aceptan duplicados.

**Respuesta:**  
TreeSet.  

Mantiene los productos ordenados automáticamente.  
Permite búsquedas rápidas de rangos (productos “entre A y C”, por ejemplo).  

---

## 7. Conjunto de identificadores numéricos para validar duplicados

**Enunciado:**  
Un sistema recibe identificadores numéricos de transacciones. Solo necesitas verificar si un identificador ya existe, sin importar orden ni presentación.

**Respuesta:**  
HashSet.  

El uso más simple y eficiente.  
Rápido en inserción y verificación de existencia.  

---

## 8. Historial de canciones escuchadas

**Enunciado:**  
Quieres guardar las canciones escuchadas por un usuario en una aplicación, sin duplicados, y mostrar la lista en el mismo orden en que se escucharon.

**Respuesta:**  
LinkedHashSet.  

Mantiene el orden en que fueron reproducidas.  
Evita duplicados.  

---

## 9. Ranking de puntuaciones en un juego

**Enunciado:**  
Se deben almacenar las puntuaciones logradas por los jugadores, sin duplicados, y ordenadas de menor a mayor.

**Respuesta:**  
TreeSet.  

Se encarga de mantener las puntuaciones ordenadas automáticamente.  
Además, permite obtener fácilmente el puntaje más alto o más bajo (`last()`, `first()`).  

---

## 10. Palabras buscadas en un motor de búsqueda

**Enunciado:**  
El motor registra las palabras clave buscadas. Solo interesa que no se repitan y que se pueda acceder muy rápido para saber si ya fueron usadas. No se requiere orden.

**Respuesta:**  
HashSet.  

Ofrece velocidad de búsqueda máxima.  
El orden en que se guardan las búsquedas no importa.  
