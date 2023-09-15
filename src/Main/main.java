package Main;

import java.util.Scanner;
import Model.Volador;
import utilidades.GestorVolador;
import utilidades.GestorPistas;

/**************************************** 
 *                                      *
 * En esta clase se inicia la ejecucion * 
 * de la aplicacion.                    *
 *                                      *
 ****************************************/

public class main {
	
	static {
		
		// Cargamos la lista de objetos voladores // 
		
		// creamos a los voladores //
		
		Volador volador01 = new Volador (1, "Aerolineas argentinas","LV-HYU","Comercial");
		Volador volador02 = new Volador (2, "American Airlines","N02588","Comercial");
		
		
		// Cargamos a la lista de Voladores//
		
		GestorVolador.agregarVolador(volador01);
		GestorVolador.agregarVolador(volador02);
	}

 /** Funcion MAIN*/

	public static void main(String[] args) {
		
		// Se visualiza la lista de voladores //
		GestorVolador.visualizarVoladores();
		
		/************************************
		 * Pseudocodigo 
		 *
		 *La torre de Control se encarga 
		 *de las ejecuciones de las ordenes 
		 *a las aeronaves.
		 *
		 * Validacion aeronaves por Tipo
		 * que aterizen en su pista correspondiente.
		 * 
		 * Se mostrara las pistas (01, 02) 
		 * 
		 * 
		 **********************************************/

	}

}
