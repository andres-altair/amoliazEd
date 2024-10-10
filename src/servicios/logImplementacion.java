package servicios;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import controladores.inicio;
/*
 * implementacion que implementa a logInterfaz
 * @author amd 101024
 */
public class logImplementacion implements logInterfaz {

	@Override
	public void logOpcion(String opcion) {
		try (BufferedWriter bw  =new BufferedWriter(new FileWriter(inicio.log))){
			bw.write(opcion + "\n");
			bw.close();
		} catch (IOException e) {
			String error = e.getMessage();
			logError(opcion);
		}

	}

	@Override
	public void logError(String error) {
		try (BufferedWriter bw  =new BufferedWriter(new FileWriter(inicio.log))){
			bw.write(error + "\n");
			bw.close();
		} catch (IOException e) {
			String fallo = e.getMessage();
			logError(fallo);
		}
		
	}

}
