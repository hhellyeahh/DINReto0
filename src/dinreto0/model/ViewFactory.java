/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dinreto0.model;

import java.util.ResourceBundle;

/**
 *
 * @author 2dam
 */
public class ViewFactory {

    private static View data;

    /**
     * Carga la variable data, si esta no esta cargada previamente
     *
     * @return data View de datos de tipo Mapa {@link MapManager}
     */
    public static View getView() throws UnknownModelTypeException {

        switch (ResourceBundle.getBundle("dinreto0.model/config").getString("VIEW")) {
            case "TEXT":
                data = new ViewConsoleImplementation();
                break;

            case "GRAPH":
                data = new ViewSwingImplementation();
                break;
            default:
                throw new UnknownModelTypeException("That type of view is not valid.");

        }
        return data;
    }

}
