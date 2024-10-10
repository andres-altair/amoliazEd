package servicios;

import java.time.format.DateTimeFormatter;

import controladores.inicio;
import dtos.ventaDto;

public class empeladoImplementacion implements empeladoInterfaz {

	@Override
	public void aniadirVenta() throws Exception{
		idInterfaz ii  =new idImplementacion();
		
		long id =ii.idVenta();
		System.out.println("escribe el  importe");
		double cantidad = inicio.sc.nextDouble();
		
		inicio.listaVenta.add(new ventaDto(id,cantidad));

	}

	@Override
	public void calcularVentaTotalMensual() throws Exception{
		DateTimeFormatter formato  = DateTimeFormatter.ofPattern("MM-yyyy");
		System.out.println("escribe una fecha(MM-yyyy)");
		String fecha = inicio.sc.next();
		int cantidad=0;
		ventaDto venta = new ventaDto();
		for (ventaDto v :inicio.listaVenta ) {
			if(fecha.equals(  v.getFchaIntante().format(formato))) {
				cantidad += v.getCantidad();
			}
		}System.out.println("cantidad ="+ cantidad);

	}

}
