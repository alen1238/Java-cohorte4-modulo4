# Ejercicios de Programación con Modelo y Servicio

Este documento contiene dos ejercicios prácticos para aplicar el concepto de **modelo-servicio-presentación** usando **arreglos multidimensionales**.

---

## Ejercicio 1: Inventario de Tienda (con comentarios en el código)

**Enunciado**  
Una tienda pequeña necesita llevar el control de su inventario. Los productos se organizan en secciones (ejemplo: Abarrotes, Aseo, Bebidas).  
Cada sección tiene un número fijo de productos, y se requiere:  

1. Registrar el nombre de los productos en cada sección.  
2. Consultar qué productos hay en una sección específica.  
3. Mostrar todo el inventario organizado por secciones.  

**Clases con comentarios de guía**  

### Clase `Producto` (Modelo)
```java
// Clase que representa un producto de la tienda
public class Producto {
    private String nombre;

    // Constructor
    public Producto(String nombre) {
        // Inicializa el nombre del producto
        this.nombre = nombre;
    }

    // Getter para obtener el nombre
    public String getNombre() {
        return nombre;
    }
}
```

---

### Clase `InventarioServicio` (Servicio)
```java
// Clase que maneja la lógica del inventario
public class InventarioServicio {
    // Matriz de productos: filas = secciones, columnas = productos en esa sección
    private Producto[][] inventario;

    // Constructor que recibe el número de secciones y productos por sección
    public InventarioServicio(int numSecciones, int productosPorSeccion) {
        // Inicializa la matriz
        inventario = new Producto[numSecciones][productosPorSeccion];
    }

    // Método para registrar un producto
    public void registrarProducto(int seccion, int posicion, String nombre) {
        // Crea un producto nuevo en la posición indicada
        inventario[seccion][posicion] = new Producto(nombre);
    }

    // Método para mostrar los productos de una sección
    public void mostrarSeccion(int seccion) {
        System.out.println("Sección " + seccion + ":");
        for (int i = 0; i < inventario[seccion].length; i++) {
            Producto p = inventario[seccion][i];
            if (p != null) {
                System.out.println(" - " + p.getNombre());
            }
        }
    }

    // Método para mostrar todo el inventario
    public void mostrarInventario() {
        for (int i = 0; i < inventario.length; i++) {
            mostrarSeccion(i);
        }
    }
}
```

---

### Clase `Main` (Presentación)
```java
// Clase principal para probar el inventario
public class Main {
    public static void main(String[] args) {
        // Crear el servicio con 2 secciones y 3 productos por sección
        InventarioServicio servicio = new InventarioServicio(2, 3);

        // Registrar productos
        servicio.registrarProducto(0, 0, "Arroz");
        servicio.registrarProducto(0, 1, "Frijoles");
        servicio.registrarProducto(1, 0, "Jabón");
        servicio.registrarProducto(1, 1, "Detergente");

        // Mostrar inventario completo
        servicio.mostrarInventario();
    }
}
```

---

## Ejercicio 2: Tablero de Notas de un Curso (con TODOs)

**Enunciado**  
Una escuela necesita un sistema para registrar y consultar las notas de sus estudiantes en 3 asignaturas.  
Se cuenta con una **matriz bidimensional** donde cada **fila representa un estudiante** y cada **columna una asignatura**.  
El sistema debe permitir:  

1. Registrar las notas de cada estudiante en cada materia.  
2. Mostrar el tablero completo de notas.  
3. Calcular el promedio de un estudiante.  
4. Calcular el promedio de una asignatura.  

**Arquitectura esperada:**  
- **Modelos**:  
  - `Estudiante`: con atributos `nombre` y su índice en la matriz.  
- **Servicios**:  
  - `NotasServicio`: contiene la matriz `double[][] notas` y toda la lógica de cálculos y consultas.  
- **Presentación**:  
  - `Main`: simula el registro de notas y muestra resultados en consola.  

---

### Clase `Estudiante` (Modelo)
```java
// Clase que representa a un estudiante
public class Estudiante {
    private String nombre;
    private int indice; // posición (fila) en la matriz de notas

    public Estudiante(String nombre, int indice) {
        // TODO: inicializar atributos
    }

    public String getNombre() {
        // TODO: retornar el nombre
        return "";
    }

    public int getIndice() {
        // TODO: retornar el índice
        return -1;
    }
}
```

---

### Clase `NotasServicio` (Servicio)
```java
// Clase que maneja la lógica de la gestión de notas
public class NotasServicio {
    private double[][] notas; // filas = estudiantes, columnas = asignaturas

    public NotasServicio(int numEstudiantes, int numAsignaturas) {
        // TODO: inicializar la matriz con las dimensiones recibidas
    }

    // Registrar una nota
    public void registrarNota(int estudiante, int asignatura, double nota) {
        // TODO: validar que los índices estén dentro de rango
        // TODO: asignar la nota en la posición correspondiente
    }

    // Mostrar todas las notas en forma de tabla
    public void mostrarNotas() {
        // TODO: recorrer la matriz e imprimir los valores en formato de tabla
    }

    // Calcular promedio de un estudiante (por fila)
    public double promedioEstudiante(int estudiante) {
        // TODO: recorrer las columnas de la fila correspondiente
        // TODO: calcular y retornar el promedio
        return 0.0;
    }

    // Calcular promedio de una asignatura (por columna)
    public double promedioAsignatura(int asignatura) {
        // TODO: recorrer las filas de la columna correspondiente
        // TODO: calcular y retornar el promedio
        return 0.0;
    }
}
```

---

### Clase `Main` (Presentación)
```java
// Clase principal para probar el sistema de notas
public class Main {
    public static void main(String[] args) {
        // TODO: Crear un arreglo de estudiantes (ejemplo: 3 estudiantes)
        // TODO: Crear el servicio con 3 estudiantes y 3 asignaturas
        // TODO: Registrar algunas notas en la matriz
        // TODO: Mostrar la tabla de notas completa
        // TODO: Calcular y mostrar promedio de un estudiante específico
        // TODO: Calcular y mostrar promedio de una asignatura específica
    }
}
```

---

