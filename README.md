# Proyecto-Benchmark-

# Descripción del Proyecto:
Herramienta de consola desarrollada en Java diseñada para procesar, validar y analizar datos térmicos extraídos de pruebas de estrés en procesadores de gama alta. El sistema permite registrar temperaturas (mínimas, promedio y máximas) de múltiples herramientas de benchmarking y detecta automáticamente los picos críticos de temperatura mediante el análisis bidimensional de datos.

# Funcionalidades Principales:
-Análisis Bidimensional: Procesamiento de datos térmicos estructurados en matrices, permitiendo cruzar el tipo de prueba (Cinebench, Prime95, etc.) con sus respectivas métricas de temperatura.

-Detección Algorítmica de Picos: Implementación de un algoritmo de búsqueda secuencial en matrices (O(n*m)) para identificar el registro térmico más alto y su contexto de prueba.

-Validación Estricta de Datos: Sistema de ingreso manual de nuevas pruebas protegido por un motor de validación (while loops) que asegura que los registros térmicos ingresados mantengan un orden estrictamente creciente (Mínima < Promedio < Máxima), garantizando la integridad de los datos antes de su procesamiento.

# Tecnologías y Conceptos Aplicados:
-Lenguaje: Java

-Estructuras de Datos: Vectores (Arrays 1D) y Matrices (Arrays 2D).

-Lógica de Control: Bucles anidados (for), estructuras condicionales (if/else), y bucles de validación de estado (while).

-Modularización: Separación de responsabilidades en métodos específicos (buscadorPicos, ingresoTest).
