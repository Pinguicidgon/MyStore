package MyStore;

import java.util.List;

public class Orden {
    private List<Producto> productos;
    
    public Orden(List<Producto> productos) {
        this.productos = productos;
    }
    
    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }
        return total;
    }
}

