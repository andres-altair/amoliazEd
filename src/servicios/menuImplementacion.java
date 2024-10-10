package servicios;

import controladores.inicio;
/*
 * implementacion que implementa menuInterfaz
 *  @author amd 101024
 */
public class menuImplementacion implements menuInterfaz {

	@Override
	public int menuPrincipal()   throws Exception {
		System.out.println("0. cerrar");
		System.out.println("1. menu gerencia");
		System.out.println("2. menu empleado");

		int opcion = inicio.sc.nextInt();
		
		return opcion;
	}

	@Override
	public int menuEmpleado()  throws Exception {
		System.out.println("0. volver");
		System.out.println("1. calculo total de ventas mensual");
		System.out.println("2. añadir compras");

		int opcion = inicio.sc.nextInt();
		
		return opcion;
	}

	@Override
	public int menuGerencia()  throws Exception{
		System.out.println("0. volver");
		System.out.println("1. añadir cliente");

		int opcion = inicio.sc.nextInt();
		
		return opcion;
	}

}
