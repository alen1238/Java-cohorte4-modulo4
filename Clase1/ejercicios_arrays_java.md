# Ejercicios Guiados de Arrays en Java

---

## 1. Mis canciones favoritas (Declaración e Inicialización)
**Objetivo**: Declarar, crear e inicializar un arreglo de tipo `String`.  
**Enunciado**: Declara un arreglo llamado `canciones` con 5 títulos de tus canciones favoritas e imprime cada canción en consola.  

---

## 2. Puntaje en videojuegos (Acceso y modificación)
**Objetivo**: Acceder y modificar valores en un arreglo.  
**Enunciado**: Crea un arreglo `puntos` con valores `{10, 20, 30, 40, 50}`.  
- Imprime el primer puntaje.  
- Modifica el tercer puntaje (índice 2) a 100.  
- Vuelve a imprimir todo el arreglo.  

---

## 3. Lista de precios en el supermercado (Recorrido con for)
**Objetivo**: Recorrer un arreglo usando `for`.  
**Enunciado**: Crea un arreglo `precios` con valores `{2500, 3200, 1500, 4000, 1000}`.  
Recórrelo con un ciclo `for` e imprime:  
- El número de producto.  
- Su precio.  

---

## 4. Promedio de notas escolares (Operaciones con arreglos)
**Objetivo**: Hacer cálculos con los elementos del arreglo.  
**Enunciado**: Crea un arreglo `notas` con 5 valores enteros (ejemplo `{3, 4, 5, 2, 5}`).  
- Calcula la suma de todas las notas.  
- Calcula e imprime el promedio.  

---

## 5. Inventario de tienda de ropa (For-each loop)
**Objetivo**: Usar `for-each` para recorrer arreglos.  
**Enunciado**: Crea un arreglo `prendas` con valores `{"Camiseta", "Pantalón", "Zapatos", "Chaqueta"}`.  
Usa un `for-each` para imprimir cada prenda con el mensaje:  
`Producto en inventario: <nombre>`.  

---

## 6. Búsqueda en una playlist (Condicional + Recorrido)
**Objetivo**: Combinar recorrido con condicional.  
**Enunciado**: Crea un arreglo `playlist` con 6 canciones.  
Pide al usuario (con `Scanner`) que ingrese el nombre de una canción.  
Recorre el arreglo y muestra si la canción está en la lista o no.  

---

## 7. La temperatura de la semana (While loop)
**Objetivo**: Recorrer un arreglo usando `while`.  
**Enunciado**: Crea un arreglo `temperaturas` con los valores `{30, 32, 28, 31, 29, 33, 27}`.  
Usa un ciclo `while` para imprimir:  
`Día X: temperatura Y°C`.  

---

## 8. Tabla de multiplicar (Array bidimensional)
**Objetivo**: Usar un arreglo bidimensional.  
**Enunciado**: Crea un arreglo bidimensional `tabla` de tamaño `[5][5]`.  
Llénalo con las multiplicaciones del 1 al 5.  
Ejemplo: `tabla[2][3]` debe contener `3*4 = 12`.  
Imprime la tabla en formato de cuadrícula.  

---

## 9. Calificaciones de estudiantes (Matriz y promedio)
**Objetivo**: Trabajar con arrays bidimensionales y operaciones.  
**Enunciado**: Declara una matriz `notas` de 3 estudiantes con 4 notas cada uno.  
Calcula el **promedio de cada estudiante** y muéstralo así:  
`Estudiante X: promedio = Y`.  

---

## 10. Reservas de cine (Matriz de ocupación de asientos)
**Objetivo**: Modelar un problema real con una matriz.  
**Enunciado**: Crea una matriz `cine` de 5 filas x 5 columnas que represente los asientos de una sala de cine.  
- Inicialízala con valores `"L"` (libre).  
- Simula que se ocupan algunos asientos (cambiando `"L"` por `"X"`).  
- Imprime el estado de la sala en forma de cuadrícula.

---

# Tips para trabajar con Arrays en Java

1. **Índices comienzan en 0**  
   Recuerda que el primer elemento de un array está en la posición 0, no en la 1.  
   Ejemplo: `numeros[0]` accede al primer número.

2. **Uso de length**  
   La propiedad `array.length` te indica el tamaño del arreglo.  
   Es útil para recorrer el arreglo sin pasarse de los límites.  
   Ejemplo: `for (int i = 0; i < numeros.length; i++)`.

3. **Evitar errores comunes (ArrayIndexOutOfBoundsException)**  
   Nunca intentes acceder a un índice fuera de rango.  
   Ejemplo incorrecto: si `numeros.length = 5`, no puedes acceder a `numeros[5]`.

4. **For-each para simplificar**  
   Usa `for (tipo elemento : arreglo)` cuando solo necesites leer los valores, sin modificar posiciones específicas.

5. **Inicialización rápida**  
   Puedes inicializar un array en una sola línea:  
   `int[] numeros = {1, 2, 3, 4};`.

6. **Arrays y lógica de negocio**  
   Piensa en ejemplos de la vida real: playlists de Spotify, calificaciones de estudiantes, inventarios de productos.  
   Así entenderás mejor para qué se usan.

7. **Usa Scanner para hacerlo interactivo**  
   Permite al usuario ingresar datos y guardarlos en un array.  
   Ejemplo: `numeros[i] = scanner.nextInt();`.

8. **Matriz = tabla**  
   Un array bidimensional se entiende mejor si lo imaginas como una tabla de filas y columnas.  
   Ejemplo: asientos de cine, tablero de ajedrez, calificaciones de estudiantes.

9. **Dividir el problema en pasos**  
   No intentes resolver todo de una vez.  
   - Paso 1: declara el array.  
   - Paso 2: llena con datos.  
   - Paso 3: recorre e imprime.  
   - Paso 4: haz cálculos.

10. **Practicar con ejemplos propios**  
   Crea tus propios casos: tu playlist, tus comidas favoritas, tus calificaciones.  
   Cuanto más personal sea el ejemplo, más fácil será aprender.
