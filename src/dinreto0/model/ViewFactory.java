/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dinreto0.model;

/**
 *
 * @author 2dam
 */
public class ViewFactory {
    private static View data;

	/**
	 * Carga la variable data, si esta no esta cargada previamente
	 * @return data Modelo de datos de tipo Mapa {@link MapManager}
	 */
	public static View getView() {
		if (data == null) {
			data = new ViewConsoleImplementation();
		}
		return data;
        }
}
