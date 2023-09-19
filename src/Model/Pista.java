package Model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import java.util.ArrayList;
import java.util.List;



/**************************************** 
 *                                      *
 * CLASE PISTA:                         * 
 * Representa la PISTA donde aterrizan  *
 * los voladores.                       *
 *                                      *
 ****************************************/

public class Pista {
	
	// ATRIBUTOS //
	
	private int nroPista;
	
	private LocalDateTime fechaManiobra;
	
	private Volador volador;

	
	
	// CONSTRUCTORES //
	
	/*******************************************
	 * CONSTRUCTOR PARAMETRIZADO
	 * @param nroPista
	 * @param fechaManiobra
	 * @param volador
	 ********************************************/
	
	public Pista(int nroPista, LocalDateTime fechaManiobra, Volador volador) {
		this.nroPista = nroPista;
		this.fechaManiobra = fechaManiobra;
		this.volador = volador;
	}



	@Override
	public String toString() {
		return "Pista [ nroPista = " + nroPista + "fechaManiobra=" + fechaManiobra + ", volador=" + volador + "]";
	}



	



	public int getNroPista() {
		return nroPista;
	}



	public LocalDateTime getFechaManiobra() {
		return fechaManiobra;
	}



	public Volador getVolador() {
		return volador;
	}
	
	
	

}
