-MyStore-

-Descripción

MyStore de momento es una aplicación de tienda en línea simple escrita en Java. Permite a los usuarios agregar
productos a un carrito de compras y calcular el total de su orden.

-Clases
La aplicación consta de las siguientes clases:

.Producto: Esta clase representa un producto con un id, nombre, precio y descripción.

.Tienda: Esta clase representa una tienda con una lista de productos.

.Carrito: Esta clase representa un carrito de compras con una lista de productos agregados al carrito.

.Orden: Esta clase representa una orden con una lista de productos y un método para calcular el total de la orden.

.InformacionPrincipal: Esta es la clase principal que ejecuta la aplicación.

-Cómo usar
Para usar la aplicación, primero cree instancias de productos y agréguelos a la tienda. Luego, puede agregar
productos al carrito desde la tienda. Finalmente, puede crear una orden con los productos en su carrito y calcular el total.

.Código
Producto producto1 = new Producto(1, "Camiseta", 15.99, "Camiseta de algodón");

Producto producto2 = new Producto(2, "Pantalón", 29.99, "Pantalón vaquero");

Tienda tienda = new Tienda();

tienda.agregarProducto(producto1);

tienda.agregarProducto(producto2);

Carrito carrito = new Carrito();

carrito.agregarProducto(producto1);

carrito.agregarProducto(producto2);

Orden orden = new Orden(carrito.obtenerProductosEnCarrito());

double total = orden.calcularTotal();

-Dependencias

La aplicación no tiene dependencias externas y solo requiere un entorno de ejecución Java (JRE).

-Instalación

Para instalar la aplicación, simplemente clone el repositorio y compile las clases en su entorno Java.

javac *.java

-Ejecución

Para ejecutar la aplicación, ejecute la clase principal InformacionPrincipal.

java InformacionPrincipal


# MyStore

