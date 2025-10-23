package modelo;


import java.io.Serializable;

public class Usuario implements Serializable {
    private int id;
    private String nombre;
    private String contraseña;


    public Usuario(int id, String nombre, String contraseña) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.contraseña = contraseña;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	public boolean validarCredenciales(String nombre, String contraseña) {
        return this.nombre.equals(nombre) && this.contraseña.equals(contraseña);
    }
}