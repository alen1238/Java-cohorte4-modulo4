# Situaciones Prácticas para Elegir la Estructura de Map en Java

A continuación, se presentan situaciones reales y detalladas que los estudiantes deben analizar para decidir cuál implementación de `Map` en Java usar (`HashMap`, `TreeMap`, `LinkedHashMap`). Cada una está diseñada para desarrollar criterio profesional.

---

## 1. Registro de empleados por número de identificación

**Situación:**  
Estás desarrollando el sistema de recursos humanos de una empresa. Se necesita buscar rápidamente los datos de un empleado a partir de su número de identificación (por ejemplo, "1023456"). El sistema tiene miles de empleados y no importa el orden en que están almacenados.

**¿Qué estructura usarías? ¿Por qué?**

---

## 2. Ranking académico de estudiantes por promedio final

**Situación:**  
En una plataforma educativa, debes generar un informe final donde los estudiantes se muestran ordenados de mayor a menor según su promedio final. Cada promedio (clave) está asociado a un estudiante (valor), y es fundamental que el listado aparezca en orden automáticamente.

**¿Qué estructura usarías? ¿Por qué?**

---

## 3. Carrito de compras en un e-commerce

**Situación:**  
Estás desarrollando la lógica de un carrito de compras. Cada producto tiene un ID único, y necesitas agregar productos en el orden en que el usuario los va añadiendo, para luego mostrar el carrito manteniendo ese mismo orden de inserción.

**¿Qué estructura usarías? ¿Por qué?**

---

## 4. Registro de historia clínica de un paciente

**Situación:**  
En una app de gestión médica, necesitas registrar los eventos médicos (consultas, exámenes, tratamientos) de un paciente en el orden exacto en que ocurrieron. Cada evento está asociado a una fecha y no se deben reordenar cronológicamente ni alfabéticamente, sino mantener el orden real en que fueron agregados.

**¿Qué estructura usarías? ¿Por qué?**

---

## 5. Catálogo de productos con búsqueda por nombre

**Situación:**  
Estás creando un sistema de inventario donde los productos deben consultarse por nombre (por ejemplo, "Laptop Lenovo"). No es necesario que estén ordenados y lo más importante es la velocidad de consulta.

**¿Qué estructura usarías? ¿Por qué?**

---

## 6. Tabla de posiciones de un videojuego

**Situación:**  
Estás construyendo la lógica de un videojuego que muestra la tabla de posiciones con los jugadores ordenados por puntaje (de mayor a menor), y debe actualizarse automáticamente al cambiar un puntaje. No puede haber dos jugadores con el mismo puntaje.

**¿Qué estructura usarías? ¿Por qué?**

---

## 7. Historial de navegación en una aplicación web

**Situación:**  
Un sistema web necesita registrar cada página que visita el usuario, en el orden exacto de navegación. Luego, debe mostrar este historial desde la primera hasta la última página visitada. No se requiere orden alfabético ni por tiempo.

**¿Qué estructura usarías? ¿Por qué?**

---

## 8. Mapa de encuestas por país

**Situación:**  
Estás diseñando un sistema de encuestas donde los resultados están agrupados por país. Solo necesitas acceder rápidamente a los datos de un país específico como "México", "Argentina", "Perú", y no te importa el orden de aparición.

**¿Qué estructura usarías? ¿Por qué?**

---

## 9. Reporte de mantenimientos ordenado por fecha

**Situación:**  
Un sistema industrial lleva el registro de mantenimientos realizados a sus máquinas. Cada entrada contiene una fecha como clave y una descripción del mantenimiento. Los ingenieros deben ver la lista ordenada cronológicamente.

**¿Qué estructura usarías? ¿Por qué?**

---

## 10. Diccionario de traducción palabra → definición

**Situación:**  
Estás creando un mini diccionario donde los usuarios pueden buscar la definición de palabras específicas. La prioridad es que la búsqueda sea rápida. No se necesita mostrar las palabras en orden alfabético ni de inserción.

**¿Qué estructura usarías? ¿Por qué?**
