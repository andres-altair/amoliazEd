package servicios;
/*
 * interfaz encargada de las acciones del empleado
 * @author amd 101024
 */
public interface empeladoInterfaz {
	/*
	 * metodo que añade una venta
	 * @author amd 101024
	 */
	public void aniadirVenta() throws Exception;
	/*
	 * metodo que calcula el total de venta mensual
	 * @author amd 101024
	 */
	public void calcularVentaTotalMensual() throws Exception;

}
