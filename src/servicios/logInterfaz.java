package servicios;
/*
 * ineterfaz encargada del log
 */
public interface logInterfaz {

	/*
	 * metodo que escribe la opcion del usuario en el log
	 * @author amd 101024
	 * @param se le pasa un string con la opcionde usuario
	 */
	public void logOpcion(String opcion);
	/*
	 * metodo que escribe el error que se ha producido
	 * @author amd 101024
	 * @param se le pasa un string del error
	 */
	public void logError(String error);
}
