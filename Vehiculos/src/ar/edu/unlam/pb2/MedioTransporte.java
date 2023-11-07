package ar.edu.unlam.pb2;

public abstract class MedioTransporte {

	private Double latitud;
	private Double longitud;
	private boolean detectarColicion;

	public MedioTransporte(Double latitud, Double longitud) {
		this.detectarColicion = false;
		this.latitud = latitud;
		this.longitud = longitud;

	}

	public void actualizarCoordenadas(Double latitud, Double longitud) throws ColitionException {
		if (Math.abs(latitud - latitud) < 0.000001 && Math.abs(longitud - longitud) < 0.000001) {
			detectarColicion = true;
			throw new ColitionException(
					"Se detectó una colisión en las coordenadas (" + latitud + ", " + longitud + ")");
		}

		// Si no hay colisión, actualiza las coordenadas
		this.latitud = latitud;
		this.longitud = longitud;
	}

	public boolean getColicion() {

		return detectarColicion;
	}

	public Double getLatitud() {
		return latitud;
	}

	public void setLatitud(Double latitud) {
		this.latitud = latitud;
	}

	public Double getLongitud() {
		return longitud;
	}

	public void setLongitud(Double longitud) {
		this.longitud = longitud;
	}

}
