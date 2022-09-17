package Atleta;

public class Atleta {
	
private int numeroAtleta;
private String nombre;
private float tiempoCarrera;

public Atleta(int numeroAtleta, String nombre, float tiempoCarrera) {
	this.numeroAtleta=numeroAtleta;
	this.nombre=nombre;
	this.tiempoCarrera=tiempoCarrera;
}

public float getTiempoCarrera() {
	return tiempoCarrera;
}

public String mostrarDatosGanador() {
	return "Numero de atleta:" + numeroAtleta + "\n" + "Nombre del atleta:" + nombre + "\n" + "Tiempo de carrera:" + tiempoCarrera;
}


}
