# Ejercicios: Separación de Modelos y Servicios en Java

Estos ejercicios están diseñados para que practiques la separación entre **modelos (datos)** y **servicios (lógica)**.  
No están resueltos, pero contienen pasos guiados y preguntas clave para que aprendas a diferenciar correctamente las responsabilidades.

---

## Ejercicio 1: Biblioteca de Libros

**Contexto**  
Una biblioteca necesita representar libros y prestar servicios básicos de consulta.

**Modelos (solo representan datos):**
- `Libro`: con atributos `titulo`, `autor`, `disponible`.

**Servicios (contienen la lógica):**
- `BibliotecaServicio`: debe permitir agregar libros y listarlos.

**Tareas guiadas:**
1. Crea la clase `Libro` (modelo).
2. Diseña el servicio `BibliotecaServicio` con una lista de libros.
3. Implementa un método para agregar un libro.
4. Implementa un método para mostrar todos los libros con su estado.

**Pregunta clave:**
- ¿Por qué la lógica de agregar libros debe ir en el **servicio** y no dentro de la clase `Libro`?

---

## Ejercicio 2: Gestión de Estudiantes

**Contexto**  
Una universidad quiere registrar estudiantes y calcular promedios de notas.

**Modelos:**
- `Estudiante`: atributos `nombre`, `nota1`, `nota2`, `nota3`.

**Servicios:**
- `EstudianteServicio`: debe calcular promedio y mostrar aprobado/reprobado.

**Tareas guiadas:**
1. Crea la clase `Estudiante`.
2. Diseña `EstudianteServicio` con un método que calcule el promedio.
3. Agrega un método para indicar si el estudiante aprobó (promedio ≥ 3.0).
4. Crea un pequeño menú en consola para registrar un estudiante y mostrar si aprueba.

**Pregunta clave:**
- ¿Qué pasaría si metes la lógica de promedio dentro de `Estudiante` en lugar del servicio?

---

## Ejercicio 3: Cajero Automático

**Contexto**  
Un banco necesita simular cuentas de usuario con depósitos y retiros.

**Modelos:**
- `Cuenta`: atributos `numeroCuenta`, `saldo`.

**Servicios:**
- `CajeroServicio`: métodos `depositar`, `retirar`, `consultarSaldo`.

**Tareas guiadas:**
1. Crea la clase `Cuenta`.
2. Diseña `CajeroServicio` con una lista de cuentas.
3. Implementa lógica de depósito y retiro (validando que no quede negativo).
4. Agrega opción de mostrar saldo de una cuenta específica.

**Pregunta clave:**
- ¿Por qué es importante que las validaciones (saldo negativo) estén en el **servicio** y no en el modelo `Cuenta`?

---

## Ejercicio 4: Tienda Virtual

**Contexto**  
Una tienda online debe vender productos y calcular el total de una compra.

**Modelos:**
- `Producto`: atributos `nombre`, `precio`.
- `Carrito`: contiene una lista de productos.

**Servicios:**
- `CarritoServicio`: agrega productos al carrito y calcula total a pagar.

**Tareas guiadas:**
1. Crea las clases `Producto` y `Carrito`.
2. Diseña `CarritoServicio` para manejar la lógica de agregar productos.
3. Implementa un método que calcule el valor total del carrito.
4. Simula la compra de 3 productos desde el `main`.

**Pregunta clave:**
- ¿Qué ventajas hay de mantener el cálculo del total en un servicio separado del modelo `Carrito`?

---

## Ejercicio 5: Sistema de Parqueadero

**Contexto**  
Un parqueadero debe registrar carros y calcular el valor a pagar según horas.

**Modelos:**
- `Carro`: atributos `placa`, `horaEntrada`, `horaSalida`.

**Servicios:**
- `ParqueaderoServicio`: registra carros, calcula horas estacionadas y total a pagar.

**Tareas guiadas:**
1. Crea la clase `Carro`.
2. Diseña `ParqueaderoServicio` para registrar entrada y salida.
3. Implementa un método que calcule el tiempo total y el costo.
4. Permite listar todos los carros registrados.

**Pregunta clave:**
- ¿Por qué el modelo `Carro` solo debe tener información y no calcular el costo de parqueo?

---

Con esta progresión, empezarás con **datos simples** (Libro, Estudiante) y avanzarás a **lógica más elaborada** (Cajero, Tienda, Parqueadero).  
Recuerda siempre separar **modelo (datos)** de **servicio (lógica)**.


---

# Ejemplo Resuelto: Biblioteca de Libros

A continuación, se muestra un ejemplo completo de cómo separar **modelo** y **servicio** en el caso de la biblioteca.  

## Modelo: Libro
```java
public class Libro {
    private String titulo;
    private String autor;
    private boolean disponible;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true; // Por defecto, todo libro está disponible
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
```

## Servicio: BibliotecaServicio
```java
public class BibliotecaServicio {
    private Libro[] libros;
    private int contador; // Lleva registro de cuántos libros hay

    public BibliotecaServicio(int capacidad) {
        this.libros = new Libro[capacidad]; // Tamaño fijo
        this.contador = 0;
    }

    public void agregarLibro(Libro libro) {
        if (contador < libros.length) {
            libros[contador] = libro;
            contador++;
        } else {
            System.out.println("No se pueden agregar más libros. Capacidad máxima alcanzada.");
        }
    }

    public void mostrarLibros() {
        for (int i = 0; i < contador; i++) {
            Libro libro = libros[i];
            String estado = libro.isDisponible() ? "Disponible" : "Prestado";
            System.out.println(libro.getTitulo() + " - " + libro.getAutor() + " (" + estado + ")");
        }
    }
}

```

## Clase Principal (main)
```java
public class Main {
    public static void main(String[] args) {
        BibliotecaServicio servicio = new BibliotecaServicio();

        Libro libro1 = new Libro("Cien Años de Soledad", "Gabriel García Márquez");
        Libro libro2 = new Libro("El Quijote", "Miguel de Cervantes");

        servicio.agregarLibro(libro1);
        servicio.agregarLibro(libro2);

        servicio.mostrarLibros();
    }
}
```

## Reflexión
- El **modelo `Libro`** solo contiene información (datos).  
- El **servicio `BibliotecaServicio`** se encarga de la lógica (agregar y mostrar).  
- Esto permite separar claramente responsabilidades y facilita la escalabilidad del sistema.
