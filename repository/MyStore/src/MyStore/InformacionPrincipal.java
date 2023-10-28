package MyStore;
import java.util.List;


public class InformacionPrincipal {
	    public static void main(String[] args) {
	        Tienda tienda = new Tienda();
	        
	        Producto producto1 = new Producto(1, "Camiseta", 15.99, "Camiseta de algodón");
	        Producto producto2 = new Producto(2, "Pantalón", 29.99, "Pantalón vaquero");
	        
	        tienda.agregarProducto(producto1);
	        tienda.agregarProducto(producto2);
	        
	        List<Producto> productosEnTienda = tienda.obtenerProductos();
	        
	        Carrito carrito = new Carrito();
	        carrito.agregarProducto(producto1);
	        carrito.agregarProducto(producto2);
	        
	        List<Producto> productosEnCarrito = carrito.obtenerProductosEnCarrito();
	        
	        System.out.println("Productos en el carrito:");
	        for (Producto producto : productosEnCarrito) {
	            System.out.println("Nombre: " + producto.getNombre());
	            System.out.println("Precio: " + producto.getPrecio());
	            System.out.println("Descripción: " + producto.getDescripcion());
	        }
	        
	        Orden orden = new Orden(productosEnCarrito);
	        double total = orden.calcularTotal();
	        System.out.println("Total de la orden: " + total);
	    }
	}



	
	

