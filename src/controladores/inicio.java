package controladores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dtos.clienteDto;
import dtos.ventaDto;
import servicios.empeladoImplementacion;
import servicios.empeladoInterfaz;
import servicios.gerenciaImplementacion;
import servicios.gerenciaInterfaz;
import servicios.logImplementacion;
import servicios.logInterfaz;
import servicios.menuImplementacion;
import servicios.menuInterfaz;

public class inicio {

	public static String log = "C:\\Users\\amoliaz\\DWS\\amoliaz\\src\\auditoria\\log";
	public static List<ventaDto> listaVenta = new ArrayList<ventaDto>();
	public static List<clienteDto> listacliente = new ArrayList<clienteDto>();
	public static Scanner sc =  new Scanner(System.in);
	public static void main(String[] args) {
		menuInterfaz mi  = new menuImplementacion();
		logInterfaz li  =new logImplementacion();
		gerenciaInterfaz gi  =new gerenciaImplementacion();
		empeladoInterfaz ei  =new empeladoImplementacion();
			
		int opcionPrincipal;
		int opcionGerencia;
		int opcionEmpleado;
		boolean cerrado  =false;
		try {
			
		
		do 
		{
			opcionPrincipal = mi.menuPrincipal();
			switch (opcionPrincipal) {
			case 0: cerrado=true;
					li.logOpcion("cerrado");
					System.out.println("cerrado");
					break;
			case 1:  opcionGerencia= mi.menuGerencia();
					li.logOpcion(" menu gerencia");
					switch (opcionGerencia) {
					case 0: break;
					case 1: gi.aniadirCliente();
					li.logOpcion("añadir cliente");
						
					default: System.out.println("opcion erronea");
					break;
					}
			case 2: opcionEmpleado= mi.menuEmpleado();
					li.logOpcion("menu empleado");
					switch (opcionEmpleado) {
					case 0: break;
					case 1: ei.calcularVentaTotalMensual();
							li.logOpcion("calculo total de ventas mensual");
						break;
					case 2 : ei.aniadirVenta();
						break;
					
					default: System.out.println("añador venta");
					break;
					}
					
			default: System.out.println("opcion erronea");
				
			}
			
			
			
		}while(!cerrado);
		} catch (Exception e) {
			String error = e.getMessage();
			li.logError(error);
		}

	}

}
