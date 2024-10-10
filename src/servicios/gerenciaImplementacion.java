package servicios;

import controladores.inicio;
import dtos.clienteDto;
/*
 * implementacion que implementa gerenciaInterfaz
 *  @author amd 101024
 */
public class gerenciaImplementacion implements gerenciaInterfaz {

	@Override
	public void aniadirCliente() throws Exception {
		
		idInterfaz ii  =new idImplementacion();
		boolean cerrado  = false;
		
		do {
			long id =ii.idCliente();
			System.out.println("escribe el  nombre");
			String nombre  =inicio.sc.next();
			System.out.println("escribe el  primer apellido ");
			String apellido1  =inicio.sc.next();
			System.out.println("escribe el  segundo apellido");
			String apellido2  =inicio.sc.next();
			inicio.listacliente.add(new clienteDto(id,nombre,apellido1,apellido2));
			System.out.println("quieres seguir añadiendo clientes (si=1/no=2)");
			int  seguirBucle  =inicio.sc.nextInt();
			if(seguirBucle!=1) {
				cerrado=true;
			}
			} while (!cerrado);
	}

}
