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
     * @return data Modelo de datos de tipo Mapa {@link MapManager}
     */
    public static View getView() {
        Integer nmr = null;
        String uwu = null;
        uwu = ResourceBundle.getBundle("dinreto0.model/config").getString("VIEW");
        nmr = Integer.parseInt(uwu);
        if (data == null) {
            if (nmr == 1) {
                data = new ViewConsoleImplementation();
            } else if (nmr == 2) {
                data = new ViewSwingImplementation();
            } 
        }
        return data;
    }
}
