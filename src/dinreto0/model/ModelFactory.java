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
public class ModelFactory {
    private static Model data;

	/**
	 * Carga la variable data, si esta no esta cargada previamente
	 * @return data Modelo de datos de tipo Mapa {@link MapManager}
	 */
	public static Model getModel() {
		if (data == null) {
			data = new ModelFileImplementation();
		}
		return data;
}
}
