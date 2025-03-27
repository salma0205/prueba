package Model;

public class Usuario {
	
	private String nombreUsuario, contraseña;

	public Usuario(String nombreUsuario, String contraseña) {
		super();
		this.nombreUsuario = nombreUsuario;
		this.contraseña = contraseña;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	@Override
	public String toString() {
		return "Usuario [nombreUsuario=" + nombreUsuario + ", contraseña=" + contraseña + "]";
	}
	
	
}
