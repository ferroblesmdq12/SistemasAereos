package Model;
import java.util.Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**************************************** 
 *                                      *
 * CLASE PISTA:                         * 
 * Representa la PISTA donde aterrizan  *
 * los voladores.                       *
 *                                      *
 ****************************************/

public class Pista {
	
	// ATRIBUTOS //
	
	private String nombrePista;
	
	private LocalDateTime fechaManiobra;
	
	private Volador volador;

	
	
	// CONSTRUCTORES //
	
	/*******************************************
	 * CONSTRUCTOR PARAMETRIZADO
	 * @param nombrePista
	 * @param fechaManiobra
	 * @param volador
	 ********************************************/
	
	public Pista(String nombrePista, LocalDateTime fechaManiobra, Volador volador) {
		this.nombrePista = nombrePista;
		this.fechaManiobra = fechaManiobra;
		this.volador = volador;
	}



	@Override
	public String toString() {
		return "Pista [nombrePista=" + nombrePista + ", fechaManiobra=" + fechaManiobra + ", volador=" + volador + "]";
	}
	
	
	

}
