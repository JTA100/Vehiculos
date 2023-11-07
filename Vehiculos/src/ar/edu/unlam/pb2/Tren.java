package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.List;

public class Tren extends MedioTransporte{
	
	/*		assertEquals((Integer) 15, nuevo.getCantidadDeVagones());
		assertEquals((Integer) 250, nuevo.getCantidadDePasajerosPorVagon());
		assertEquals((Integer) 100, nuevo.getVelocidadMaxima());
		assertEquals((Double) 41.40338, nuevo.getLatitud());
		assertEquals((Double) 2.17403, nuevo.getLongitud());*/
	
	private Integer cantidadDeVagones;
	private Integer cantidadDePasajerosPorVagon;
	private Integer velocidadMaxima;

	public Tren(Integer cantidadDeVagones, Integer cantidadDePasajerosPorVagon, Integer velocidadMaxima, Double latitud, Double longitud) {
		
		super(latitud, longitud);
		this.cantidadDeVagones = cantidadDeVagones;
		this.cantidadDePasajerosPorVagon = cantidadDePasajerosPorVagon;
		this.velocidadMaxima = velocidadMaxima;
	}

	public Integer getCantidadDeVagones() {
		return cantidadDeVagones;
	}

	public void setCantidadDeVagones(Integer cantidadDeVagones) {
		this.cantidadDeVagones = cantidadDeVagones;
	}

	public Integer getCantidadDePasajerosPorVagon() {
		return cantidadDePasajerosPorVagon;
	}

	public void setCantidadDePasajerosPorVagon(Integer cantidadDePasajerosPorVagon) {
		this.cantidadDePasajerosPorVagon = cantidadDePasajerosPorVagon;
	}

	public Integer getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(Integer velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

}
