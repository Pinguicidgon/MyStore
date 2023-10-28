package MyStore;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private List<Producto> productos;

    public Tienda() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public List<Producto> obtenerProductos() {
        return productos;
    }
}
