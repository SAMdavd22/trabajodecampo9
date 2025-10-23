package modelo;

public class Producto {
    private String codigo;
    private String nombre;
    private String modelo;
    private Categoria categoria;
    private double precio;
    private int stock;
    
    public String toString() {
        return "Código: " + codigo + ", Nombre: " + nombre + ", Modelo: " + modelo + ", Categoría: " + categoria.getNombre() + ", Precio: " + precio + ", Stock: " + stock;
    }

    public Producto(String codigo, String nombre, String modelo, Categoria categoria, double precio, int stock) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.modelo = modelo;
		this.categoria = categoria;
		this.precio = precio;
		this.stock = stock;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
}
 
    
  
