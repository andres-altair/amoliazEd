package servicios;
/*
 * interfaz encargada de los menus
 * @author amd 101024
 */
public interface menuInterfaz {
	/*
	 * metodo que recoge la opcion del menu primcipal
	 * @author amd 101024
	 * @return (int) opcion del menu principal
	 */
	public int menuPrincipal() throws Exception;
	/*
	 * metodo que recoge la opcion del menu de empleado
	 * @author amd 101024
	 * @return (int) opcion del menu empleado
	 */
	public int menuEmpleado()  throws Exception;
	/*
	 * metodo que recoge la opcion del menu de ferencia
	 * @author amd 101024
	 * @return (int) opcion del menu de gerencia
	 */
	public int menuGerencia()  throws Exception;

}
