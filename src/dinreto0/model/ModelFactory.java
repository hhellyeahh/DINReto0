/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dinreto0.model;

import exceptions.ExceptionManager;
import java.util.ResourceBundle;

/**
 *
 * @author 2dam
 */
public class ModelFactory {

    private static Model data;

    /**
     * Carga la variable data, si esta no esta cargada previamente
     *
     * @return data Modelo de datos de tipo Mapa {@link MapManager}
     */
    public static Model getModel() throws UnknownModelTypeException{

        switch (ResourceBundle.getBundle("dinreto0.model/config").getString("MODEL")) {
            case "FILE": 
                        data = new ModelFileImplementation();
                        break;
                    
            case "BD": 
                        data = new ModelDBImplementation();
                        break;
            default:
                        throw new UnknownModelTypeException("That type of model is not valid.");
                
        }

        return data;
    }
}
