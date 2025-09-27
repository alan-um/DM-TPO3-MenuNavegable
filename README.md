# DM-TPO3-MenuNavegable
Desarrolla una aplicación móvil en Android utilizando el patrón de arquitectura MVVM.
La aplicación deberá permitir a los usuarios crear y guardar productos en memoria, es decir, sin necesidad de persistirlos en una base de datos o archivo. La interfaz gráfica de usuario deberá incluir una pantalla principal que muestre una lista de todos los productos existentes. La aplicación deberá implementar el patrón MVVM para separar la lógica de presentación de la lógica de negocio y utilizar LiveData para la comunicación entre las capas de vista y modelo. Además, deberá usar RecyclerView para la implementación de la lista de productos.

**Estructura sugerida**

Crear una Activity principal que funcione como un menú navegable y que posea un ArrayList<Producto> público y estático, donde Producto es una clase que contiene los atributos:

*código*

*descripción*

*precio*
 

**Opciones del Menú**

*Cargar:*
Con una vista que permita ingresar los datos de un producto (código, descripción y precio) y agregarlo a la lista estática. Validar que no se ingresen campos vacíos y que no se repitan códigos.

*Listar:*
Mostrar un RecyclerView con todos los productos agregados, ordenados alfabéticamente por descripción.

*Salir:*
Activar un Diálogo que permita cerrar la aplicación.
