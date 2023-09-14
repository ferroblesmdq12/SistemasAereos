package Model;

import java.util.ArrayList;
import java.util.List;

/**************************************** 
 *                                      *
 * CLASE TORRE DE CONTROL:              * 
 * Representa la torre de contrl del    *
 * del aeropuerto. Gestiona y decide    *
 * quien aterriza.                      *
 ****************************************/

public class TorreDeControl {
	
	// ATRIBUTOS //

	private String nombreAeropuerto;
	
	private List<Pista> pistas;
	
	private List<Volador> listaVoladores;
	
	
	
	// CONSTRUCTOR POR DEFECTO //
	
	
	// Se declara la lista de pistas //
	
	public TorreDeControl() {
		pistas = new ArrayList<>();
		
	}
	
	/*******************************
	 * CONSTRUCTOR PARAMETRIZADO
	 * @param nombreAreopuerto
	 * @param pistas
	 * @param listaVoladores
	 * 
	 *****************************/
	public TorreDeControl(String nombreAeropuerto) {
		this.nombreAeropuerto = nombreAeropuerto;
		this.pistas = new ArrayList<>();
	}
	
	// METODOS //
	
	// registra los voladores que aterrizaron en las pistas //
	
	public void registrarAterrizajes(Pista pista) {
		this.pistas.add(pista);
	}
	
	// Se visualiza por pantalla el registro de aterrizajes en pistas //
	
	public void mostrarAterrizajes() {
		for(Pista p: pistas)
		{
			System.out.println(p);
		}
	}
	

}
