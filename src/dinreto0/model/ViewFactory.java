/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dinreto0.model;

import java.util.ResourceBundle;

/**
 *
 * @author ZuliLeire
 */
public class ViewFactory {

    private static View data;

    /**
     * Load the data variable, if it is not previously loaded
     * @return data View 
     */
    public static View getView() throws UnknownModelTypeException {

        switch (ResourceBundle.getBundle("dinreto0.model/config").getString("VIEW")) {
            case "TEXT":
                data = new ViewConsoleImplementation();
                break;

            case "GRAPH":
                data = new ViewSwingImplementation();
                break;
               case "FX":
                data = new ViewJavaFXImplementation();
                break;  
            default:
                throw new UnknownModelTypeException("That type of view is not valid.");

        }
        return data;
    }

}
