
# Proyecto: Sistema de Control de Radiación Cósmica de Satélites

## Descripción general
Se requiere diseñar un sistema para administrar y controlar satélites que registran mediciones de **radiación cósmica** en órbita.  
El sistema debe permitir registrar satélites, almacenar mediciones periódicas y consultar la información de manera eficiente.

La radiación cósmica es un factor clave en la operación de satélites y estaciones espaciales, ya que niveles elevados pueden afectar los sistemas electrónicos y la salud de los astronautas. Por ello, este sistema es fundamental para simular el monitoreo de satélites.

El proyecto debe estar estructurado de manera modular y orientada a objetos, considerando al menos las siguientes funcionalidades:
1. Registrar satélites en el sistema con un identificador único y un estado inicial (activo, inactivo o en mantenimiento).
2. Consultar el estado de un satélite en cualquier momento.
3. Agregar nuevas mediciones de radiación cósmica para un satélite específico.
4. Consultar el historial de mediciones de un satélite.
5. Cambiar el estado de un satélite según sea necesario.

## Ejemplos de entradas y salidas

### Registro inicial de satélites
- SAT-001 → estado: activo
- SAT-002 → estado: en mantenimiento
- SAT-003 → estado: inactivo

### Ejemplo de mediciones almacenadas
- SAT-001 → [120.5, 134.2, 128.0] (niveles de radiación en µSv/h)
- SAT-002 → [200.1, 198.7]  
- SAT-003 → [95.0]

### Operaciones esperadas

1. **Consultar estado**
   - Entrada: ID = "SAT-002"
   - Salida: "en mantenimiento"

2. **Consultar historial**
   - Entrada: ID = "SAT-001"
   - Salida: [120.5, 134.2, 128.0]

3. **Agregar nueva medición**
   - Entrada: ID = "SAT-003", medición = 105.3
   - Salida: "Medición agregada con éxito."
   - Nuevo historial de SAT-003 → [95.0, 105.3]

4. **Cambiar estado**
   - Entrada: ID = "SAT-001", nuevo estado = "inactivo"
   - Salida: "Estado actualizado correctamente."
   - Estado actual de SAT-001 → "inactivo"

## Consideraciones adicionales
- Cada satélite debe identificarse por un código único (ejemplo: SAT-001).  
- Los valores de radiación siempre deben ser positivos.  
- El sistema debe validar los estados permitidos de un satélite: "activo", "inactivo", "en mantenimiento".  
- El diseño del proyecto debe favorecer la reutilización de código y la claridad en la organización de clases.  

---
**Tarea para los estudiantes:**  
Implemente este sistema en Java respetando los principios de POO. Utilice estructuras de datos adecuadas para:  
- Almacenar y consultar el estado de los satélites.  
- Registrar y acceder a los historiales de mediciones.  

El sistema debe contar con una interfaz de usuario por consola que permita interactuar con las funcionalidades descritas mediante un menú de opciones.
