package ar.edu.unlam.pb2;

import java.util.HashSet;
import java.util.Set;

public class Mapa {
	
	public Mapa(String nombre) {
		
		this.nombre = nombre;
		this.vehiculos = new HashSet<MedioTransporte>();
		
	}

	public void agregarVehiculo(MedioTransporte vehiculos) {
		if(vehiculos instanceof Auto || vehiculos instanceof Moto || vehiculos instanceof Bicicleta || vehiculos instanceof Tren) {
			this.vehiculos.add(vehiculos);
		}
		
	}
	
	public Integer getCantidadDeVehiculos() {
		return vehiculos.size();
	}
	
	public boolean hayCoalicion() throws ColitionException{
		for(MedioTransporte medios : this.vehiculos)
			if(medios.getColicion()) {
				throw new ColitionException ("se detecto una coalición");
			}
		return false;
	}

	
	private String nombre;
	private Set<MedioTransporte> vehiculos;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<MedioTransporte> getVehiculos() {
		return vehiculos;
	}

	public void setVehiculos(Set<MedioTransporte> vehiculos) {
		this.vehiculos = vehiculos;
	}






}
