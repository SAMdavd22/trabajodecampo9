package manajer;

import java.util.*;
import modelo.*;

public class ProductoManager {
    private List<Producto> productos;
    private ArchivoManager archivoManager;

    public ProductoManager() {
        this.archivoManager = new ArchivoManager();
        this.productos = archivoManager.leerCSV();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
        archivoManager.guardarProductos(productos);
    }

    public void eliminarProducto(String codigo) {
        productos.removeIf(p -> p.getCodigo().equals(codigo));
        archivoManager.guardarProductos(productos);
    }

    public Producto buscarProducto(String codigo) {
        return productos.stream()
                .filter(p -> p.getCodigo().equals(codigo))
                .findFirst()
                .orElse(null);
    }

    public List<Producto> listarProductos() {
        return new ArrayList<>(productos);
    }
}
