package MyStore;

import java.util.ArrayList;
import java.util.List;

public class Carrito {
	private List<Producto> productosEnCarrito;

	public Carrito() {
		productosEnCarrito = new ArrayList<>();
	}

	public void agregarProducto(Producto producto) {
		productosEnCarrito.add(producto);
	}

	public void quitarProducto(Producto producto) {
		productosEnCarrito.remove(producto);
	}

	public List<Producto> obtenerProductosEnCarrito() {
		return productosEnCarrito;
	}
}
