/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dinreto0.model;

import dinreto0.ui.JavaFXView;
import javafx.application.Application;

/**
 *
 * @author Zuli
 */
public class ViewJavaFXImplementation implements View{

    /**
     * Implementation for JavaFX
     * @param greeting it send it to the launch of the JAVAFX in order to build it
     */
    @Override
    public void showGreeting(String greeting) {
        Application.launch(JavaFXView.class,greeting );
    }
    
}
