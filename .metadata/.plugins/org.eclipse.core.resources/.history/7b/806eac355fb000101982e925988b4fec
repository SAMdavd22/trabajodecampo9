package manajer;

import java.io.*;
import java.util.*;
import modelo.*;

public class ArchivoManager {

    private static final String RUTA_CSV = "productos.csv";
    private static final String RUTA_SER = "usuarios.ser";

    public void guardarProductos(List<Producto> productos) {
        try (FileWriter fw = new FileWriter(RUTA_CSV)) {
            for (Producto p : productos) {
                fw.write(String.format("%s,%s,%s,%d,%.2f,%d%n",
                        p.getCodigo(), p.getNombre(), p.getModelo(),
                        p.getCategoria().getIdCategoria(), p.getPrecio(), p.getStock()));
            }
        } catch (IOException e) {
            System.err.println("Error al guardar productos: " + e.getMessage());
        }
    }

    public List<Producto> leerCSV() {
        List<Producto> productos = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(RUTA_CSV))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length == 6) {
                    Categoria cat = new Categoria(Integer.parseInt(datos[3]), "Categoría " + datos[3]);
                    Producto p = new Producto(datos[0], datos[1], datos[2], cat,
                            Double.parseDouble(datos[4]), Integer.parseInt(datos[5]));
                    productos.add(p);
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer CSV: " + e.getMessage());
        }
        return productos;
    }

    public void guardarUsuarios(List<Usuario> usuarios) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(RUTA_SER))) {
            oos.writeObject(usuarios);
        } catch (IOException e) {
            System.err.println("Error al guardar usuarios: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    public List<Usuario> leerUsuarios() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(RUTA_SER))) {
            return (List<Usuario>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al leer usuarios: " + e.getMessage());
            return new ArrayList<>();
        }
    }
}
