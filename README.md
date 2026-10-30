Aquí tienes la estructura en formato Markdown lista para el `README.md` de este código actualizado de **Simulación de Libreta de Calificaciones con Clase Principal (Encapsulamiento y Manejo de Arreglos en Java)**, manteniendo el enfoque exclusivo de **Programación Orientada a Objetos en memoria** (sin bases de datos):

---

# 📚 Simulación de Libreta de Calificaciones y Promedios (Encapsulamiento y Arreglos en Java)

Este proyecto es una aplicación en Java que modela el registro y cálculo del rendimiento académico de un estudiante a través de una libreta digital de notas y su respectiva clase de ejecución. Pone en práctica conceptos fundamentales de la **Programación Orientada a Objetos (POO)** como el **encapsulamiento de atributos privados**, el control de arreglos estáticos mediante contadores dinámicos y la validación de rangos numéricos permitidos en memoria.

---

## 🧩 Clases y Estructura del Sistema

El diseño del software se organiza a través de una clase de dominio encapsulada y un punto de ejecución:

* **`LibretaCalificaciones`**: Modela la libreta académica del alumno y protege la integridad de sus registros de notas.
* **Atributos privados (`private`)**: `nombreEstudiante`, un arreglo estático de calificaciones `notas` (con una capacidad máxima de 10 elementos) y un contador interno `cantidadNotas`.
* **Constructor**: Inicializa la libreta asignando el nombre del alumno, creando un arreglo de tamaño fijo e inicializando los contadores.
* **Métodos accesores (*getters*)**: Permiten consultar de forma controlada el nombre del estudiante.
* **Métodos operativos de negocio**:
* `agregarNotas(double nota)`: Valida que la calificación se encuentre dentro del rango académico válido y comprueba que la libreta no haya alcanzado su capacidad máxima antes de almacenar el valor y desplazar el contador.
* `obtenerPromedio()`: Calcula y retorna el promedio aritmético de las notas cargadas, previniendo errores de división por cero si aún no existen registros cargados.




* **`Main`**: Punto de entrada del programa. Instancia una libreta de calificaciones para un estudiante (ej. Juan), añade una serie de calificaciones válidas de manera secuencial y muestra por consola tanto el nombre del alumno como su promedio final obtenido.

---

## ⚙️ Reglas de Negocio y Control de Validación

1. **Rango Válido de Calificaciones:** El método de inserción evalúa que la nota se encuentre comprendida entre los límites establecidos (mayores a 0 y menores o iguales a 10).
2. **Control de Capacidad del Arreglo:** Comprueba que la cantidad de notas almacenadas no supere la longitud máxima de la estructura estática, evitando desbordamientos de memoria.
3. **Encapsulamiento de Datos:** Oculta los arreglos y contadores internos, permitiendo interactuar con la información únicamente a través de los métodos públicos definidos.

---

## 💻 Salida por Consola

Al ejecutar la clase `Main` con las calificaciones de prueba, el programa genera el siguiente resultado:

```text
Estudiante: Juan
Promedio de notas: 7.5

```

---

## 🚀 Conceptos de Programación Aplicados

* **Encapsulamiento de Estado:** Ocultamiento de la estructura interna de calificaciones, permitiendo modificar y consultar los datos de forma segura.
* **Gestión Estática de Colecciones:** Uso de arreglos primitivos controlados mediante índices y contadores internos para administrar volúmenes fijos de información en memoria.
* **Diseño Modular:** Clara separación entre la lógica del dominio académico (`LibretaCalificaciones`) y la ejecución del cliente (`Main`).
