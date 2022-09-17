package Atleta;
import java.util.Scanner;

public class MainAtleta {

	public static float indiceGanadorCarrera(Atleta competidores[]) {
		float tiempoCarrera;
		int indice=0;
		
		tiempoCarrera= competidores[0].getTiempoCarrera();
		
		for(int i=0;i<competidores.length;i++) {
			if(competidores[i].getTiempoCarrera()<tiempoCarrera) {
				tiempoCarrera=competidores[i].getTiempoCarrera();
				indice=i;
			}
			
		}
		return indice;
		
	}
	
	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		int numeroAtleta;
		String nombre;
		float tiempoCarrera;
		int cantidadAtletas;
		float indiceGanador;
		
		
		System.out.println("Ingrese la cantidad de atletas que compiten:");
		cantidadAtletas=reader.nextInt();
		
		Atleta competidores[] = new Atleta[cantidadAtletas];
		
		for(int i=0;i<competidores.length;i++) {
			numeroAtleta=i+1;
			
			reader.nextLine();
			System.out.println("Ingrese el nombre del atleta numero" + numeroAtleta+":");
			nombre=reader.next();
			System.out.println("Ingrese el tiempo de carrera del atleta" + numeroAtleta + ":");
			tiempoCarrera=reader.nextFloat();
			
			competidores[i]= new Atleta(numeroAtleta,nombre,tiempoCarrera);
			
		}
		
		indiceGanador=indiceGanadorCarrera(competidores);
		System.out.println("El ganador de la carrera es:");
		System.out.println(competidores[(int)indiceGanador].mostrarDatosGanador());

	}

}
