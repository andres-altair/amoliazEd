package servicios;

import controladores.inicio;
/*
 * implementacion que implementa idInterfaz
 *  @author amd 101024
 */
public class idImplementacion implements idInterfaz {

	@Override
	public long idCliente() {
		long id;
		int tamanio  =inicio.listacliente.size();
		if(tamanio>0) {
			id = inicio.listacliente.get(tamanio-1).getId()+1;
		}else {
			id =1;
		}
		return id;
	}

	@Override
	public long idVenta() {
		long id;
		int tamanio  =inicio.listaVenta.size();
		if(tamanio>0) {
			id = inicio.listaVenta.get(tamanio-1).getId()+1;
		}else {
			id =1;
		}
		return id;
	}

}
