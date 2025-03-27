package Model;

public class Carro {
	
	private String marca, modelo;
	private int id, año;
	private Boolean disponible;
	
	
	public Carro(String marca, String modelo, int id, int año, Boolean disponible) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.id = id;
		this.año = año;
		this.disponible = disponible;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getAño() {
		return año;
	}


	public void setAño(int año) {
		this.año = año;
	}


	public Boolean getDisponible() {
		return disponible;
	}


	public void setDisponible(Boolean disponible) {
		this.disponible = disponible;
	}


	@Override
	public String toString() {
		return "Carro [marca=" + marca + ", modelo=" + modelo + ", id=" + id + ", año=" + año + ", disponible="
				+ disponible + "]";
	} 
	
	
}
